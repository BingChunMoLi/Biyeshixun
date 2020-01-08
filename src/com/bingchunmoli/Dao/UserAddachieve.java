package com.bingchunmoli.Dao;

import com.bingchunmoli.Obj.User;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 * @ProjectName: [Biyesheji]
 * @Package: [com.bingchunmoli.Dao.UserAddachieve.UserAddachieve]
 * @ClassName: [冰彦糖]
 * @Description: [增删改查用户]
 * @Author: [冰彦糖]
 * @CreateDate: [2020.1.6 13:37]
 * @UpdateUser: [冰彦糖]
 * @UpdateDate: [2020.1.6 13:37]
 * @UpdateRemark: [说明本次修改内容]
 */
public class UserAddachieve<T> implements Additions<T> {
    Connection connection = Link.getConnection();
    PreparedStatement preparedStatement = null;
    String sql = "";
    @Override
        public void add(T... t) {
        sql = "INSERT into User(name,email,password,signupdata)values(?,?,?,?)";
        try {
            preparedStatement = connection.prepareStatement(sql);
            for (int i = 0;i < t.length;i++){
                preparedStatement.setString(i +1, String.valueOf(t[i]));
            }
            preparedStatement.setLong(4,new Date().getTime());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(T... t) {
        sql = "update User set name = ?,password = ?,email = ? where UID = 2";
        try {
            preparedStatement = connection.prepareStatement(sql);
            for (int i = 0;i < t.length;i++){
                preparedStatement.setString(i + 1, String.valueOf(t[i]));
            }
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void del(T... t) {
        sql = "delete from User where uid = ?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, (Integer) t[0]);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void query(T... t) {
        try {
            Class clazz=Class.forName("com.bingchunmoli.Obj.User");
            Field[] fields = clazz.getDeclaredFields();
            for (int i = 0;i < fields.length;i++){
                System.out.println(fields[i].getName());
//                Field field = fields[i];
//                field.setAccessible(true);
//                try {
//                    System.out.println(field.get(t[1]));
//                    System.out.println(field.getName());
//                } catch (IllegalAccessException e) {
//                    e.printStackTrace();
//                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        sql = "SELECT * from User where uid = ?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, (Integer) t[0]);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
