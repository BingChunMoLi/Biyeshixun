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
public class Pldao {
    PreparedStatement preparedStatement = null;
    public void add(Integer uid,Integer tid,String comment){
        Connection c = Link.getConnection();
        String sql  ="INSERT into pinglun(uid,tid,comment,date)values(?,?,?,?)";
        try {
            preparedStatement = c.prepareStatement(sql);
            preparedStatement.setInt(1,uid);
            preparedStatement.setInt(2,tid);
            preparedStatement.setString(3,comment);
            preparedStatement.setLong(4,new Date().getTime());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
