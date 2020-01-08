package com.bingchunmoli.Dao;

import java.util.*;

/**
 * 增删改查
 */
public interface Additions <T>{

    /**
     * 
     */
    public void add(T... t);

    /**
     * 
     */
    public void update(T... t);

    /**
     * 
     */
    public void del(T... t);

    /**
     * 
     */
    public void query(T... t);

}