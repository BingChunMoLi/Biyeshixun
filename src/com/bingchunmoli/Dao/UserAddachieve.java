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
    /**
     *
     * @param t 不定长参数，第一个为表名，第二个开始为添加的字段名然后是字段值
     */
    @Override
        public void add(T... t) {
        int zd = (Integer) t[1];
        String array[] = new String[zd];
        String temp = "";
        for (int i = 2;i < zd + 2;i++){
            if (i == zd + 1){
                temp += t[i];
            }else{
                temp += t[i] + ",";
            }
        }
        String temp2 = "";
        for (int i = 0;i < zd;i++){
            if (i == zd - 1){
                temp2 += "?";
            }else{
                temp2 += "?" + ",";
            }
        }
        sql = "INSERT into " + String.valueOf(t[0])+ " ( " + temp +" )values(" + temp2 + ")";
        try {
            preparedStatement = connection.prepareStatement(sql);
            if (String.valueOf(t[0]).equals("User")){
                for (int i = 1;i < zd;i++){
                    preparedStatement.setString(i, String.valueOf(t[i + zd + 1]));
                }
                preparedStatement.setLong(zd,new Date().getTime());
            }else{
                for (int i = 1;i < zd;i++){
                    preparedStatement.setString(i, String.valueOf(t[i]));
                }
            }
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     *
     * @param t 不定长参数，第一个为表名，第二个开始为添加的字段名然后是字段值
     */
    @Override
    public void update(T... t) {
        int zd = (Integer) t[1];
//        String array[] = new String[zd];
//        String temp = "";
//        for (int i = 2;i < zd + 2;i++){
//            if (i == zd + 1){
//                temp += t[i] + "=?";
//            }else{
//                temp += t[i] + "=?,";
//            }
//        }
//        System.out.println(temp);
//        update User set name=?,email=?,password=?,age=?,sex=? where uid = 163;

        try {
            sql = "update " + String.valueOf(t[0]) +" set " + String.valueOf(t[2]) + "where " + String.valueOf(t[t.length - 2]) +" =" + (Integer)t[t.length - 1];
            preparedStatement = connection.prepareStatement(sql);
            if (String.valueOf(t[0]).equals("User")){
                for (int i = 1;i < zd +1;i++){
                    System.out.println(t.length);
                    preparedStatement.setString(i, String.valueOf(t[i + 2]));
                }
            }else{
                for (int i = 1;i < zd +1;i++){
                    System.out.println(t.length);
                    preparedStatement.setString(i, String.valueOf(t[i + zd]));
                }
            }
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void userupdate(Integer UID, String IP, String city){
        Connection c = Link.getConnection();
        String sql  ="update User set lastip = ?,lastdata = ?,lastsite = ? where uid = ?";
        try {
            preparedStatement = c.prepareStatement(sql);
            preparedStatement.setString(1,IP);
            preparedStatement.setLong(2,new Date().getTime());
            preparedStatement.setString(3,city);
            preparedStatement.setInt(4, UID);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     *
     * @param t 不定长参数，第一个为表名，第二为删除的查询字段，第三个为删除的查询值
     */
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
//        try {
//            Class clazz=Class.forName("com.bingchunmoli.Obj.User");
//            Field[] fields = clazz.getDeclaredFields();
//            for (int i = 0;i < fields.length;i++){
//                System.out.println(fields[i].getName());
//                Field field = fields[i];
//                field.setAccessible(true);
//                try {
//                    System.out.println(field.get(t[1]));
//                    System.out.println(field.getName());
//                } catch (IllegalAccessException e) {
//                    e.printStackTrace();
//                }
//            }
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }


        sql = "SELECT * from " + t[0] +" where " + t[1] +" = ?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, (Integer) t[1]);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public boolean userquery(T... t){
        boolean flag = false;
        String pass = "";
        User user = new User();
        int UID;
        sql = "SELECT * from " + String.valueOf(t[0]) +" where name = ?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, String.valueOf(t[1]));
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                pass = rs.getString("password");
            }
            if (pass.equals(String.valueOf(t[2]))){
                flag = true;
                while (rs.next()){
                    user.setUID(rs.getInt("uid"));
                }
            }else{
                flag = false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }
    public int useruid(T... t){
        User user = new User();
        int UID = 0;
        sql = "SELECT * from " + String.valueOf(t[0]) +" where name = ?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, String.valueOf(t[1]));
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                UID = rs.getInt("uid");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return UID;
    }
    public void addjijin(Integer uid,Integer value){
        Connection c = Link.getConnection();
        String sql  ="INSERT into Money(uid,date,value)values(?,?,?)";
        try {
            preparedStatement = c.prepareStatement(sql);
            preparedStatement.setInt(1,uid);
            preparedStatement.setLong(2,new Date().getTime());
            preparedStatement.setInt(3,value);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
