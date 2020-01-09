package com.bingchunmoli.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;

/**
 * 链接数据库对象
 */
public class Link {

    /**
     * Default constructor
     */
    public Link() {
    }

    /**
     * 
     */
    public static final String URL = "jdbc:mysql://blog.bingchunmoli.com:3306/Test?useSSL=true&serverTimezone=UTC";

    /**
     * 
     */
    public static final String USER = "root";

    /**
     * 
     */
    public static final String PASSWORD = "League_Jinx16521";

    /**
     * 
     */
    public static Connection conn = null;
    static{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL,USER,PASSWORD);
        }catch  (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection() {
        // TODO implement here
        return conn;
    }

}