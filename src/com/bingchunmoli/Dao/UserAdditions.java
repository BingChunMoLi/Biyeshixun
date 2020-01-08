package com.bingchunmoli.Dao;


import com.bingchunmoli.Obj.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @ProjectName: [Biyesheji]
 * @Package: [com.bingchunmoli.Dao.UserAdditios]
 * @ClassName: [冰彦糖]
 * @Description: [用户增加]
 * @Author: [冰彦糖]
 * @CreateDate: [2020/1/05 10:22]
 * @UpdateUser: [冰彦糖]
 * @UpdateDate: [2020/1/05 10:22]
 * @UpdateRemark: [说明本次修改内容]
 */
public class UserAdditions {
    public boolean Search_user(String Input_user) {
        boolean flag = false;                               //boolean 判断是否为空返回值用
        Integer UID = null;
        User user = new User();                             //new一个用户对象
        Connection conn = null;                             //初始化连接
        conn = Link.getConnection();                        //得到数据库链接
        String sql = "select * from User where name=?";     //预定义SQL语句
        PreparedStatement ptmt = null;                      //预定义
        try {
            ptmt = conn.prepareStatement(sql);              //预编译sql
            ptmt.setString(1,Input_user);   //传入名字参数
            ResultSet rs = ptmt.executeQuery();             //ResultSet结果集
            while (rs.next()){
                UID = rs.getInt("UID");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (UID != null){
            flag = true;
        }else{
            flag = false;
        }
        return flag;
    }
}
