package com.bingchunmoli.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
public class updao {
    PreparedStatement preparedStatement = null;
    public void add(String path,String alt,Integer uid){
        Connection c = Link.getConnection();
        String sql  ="INSERT into Userimage(path,date,alt,uid)values(?,?,?,?)";
        try {
            preparedStatement = c.prepareStatement(sql);
            preparedStatement.setString(1,path);
            preparedStatement.setLong(2,new Date().getTime());
            preparedStatement.setString(3,alt);
            preparedStatement.setInt(4,uid);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
