package com.bingchunmoli.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

/**
 * @ProjectName: [Biyesheji]
 * @Package: [com.bingchunmoli.Dao.Tizidao]
 * @ClassName: [Tizidao]
 * @Description: [增加帖子]
 * @Author: [冰彦糖]
 * @CreateDate: [2020.1.10]
 * @UpdateUser: [冰彦糖]
 * @UpdateDate: [2020.1.10]
 * @UpdateRemark: [第一次书写]
 */
public class Tizidao {
    PreparedStatement preparedStatement = null;
    public void add(String title,String article,Integer uid){
        Connection c = Link.getConnection();
        String sql  ="INSERT into tiezi(title,uid,date,article)values(?,?,?,?)";
        try {
            preparedStatement = c.prepareStatement(sql);
            preparedStatement.setString(1,title);
            preparedStatement.setInt(2,uid);
            preparedStatement.setString(3,String.valueOf(new Date().getTime()));
            preparedStatement.setString(4,article);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
