package com.bingchunmoli.Dao;

import com.bingchunmoli.Obj.Tiezi;
import com.bingchunmoli.Obj.Userimage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 * @ProjectName: []
 * @Package: [.]
 * @ClassName: []
 * @Description: [一句话描述该类的功能]
 * @Author: []
 * @CreateDate: [ ]
 * @UpdateUser: []
 * @UpdateDate: [ ]
 * @UpdateRemark: [说明本次修改内容]
 */
public class Searchimage {
    PreparedStatement preparedStatement = null;
    public Userimage search(Integer uid){
        Connection c = Link.getConnection();
        Userimage userimage = new Userimage();
        String sql  ="SELECT * from Userimage where uid = ?";
        try {
            preparedStatement = c.prepareStatement(sql);
            preparedStatement.setInt(1,uid);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                userimage.setIID(rs.getInt("iid"));
                userimage.setPath(rs.getString("path"));
                userimage.setData(rs.getString("date"));
                userimage.setAlt(rs.getString("alt"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userimage;
    }
}
