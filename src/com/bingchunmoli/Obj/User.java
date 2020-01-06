package com.bingchunmoli.Obj;

import java.util.*;

/**
 * - UID,用户ID  
 * - Name,用户名 
 * - Emil,邮箱
 * - Password,用户密码   
 * - Imagepath,头像路径  
 * - Ifadmin,判断管理员 
 * - Signupdate,注册时间 
 * - Lastdata,上次登录的时间
 * - Lastip,上次登录IP   
 * - Lastsite,上次登录地址   
 * - Age,年龄    
 * - Sex,性别    
 * - Initegral,积分
 */
public class User {

    /**
     * Default constructor
     */
    public User() {
    }

    /**
     * 
     */
    private int UID;

    /**
     * 
     */
    private String Name;

    /**
     * 
     */
    private String Emil;

    /**
     * 
     */
    private String Password;

    /**
     * 
     */
    private String Imagepath;

    /**
     * 
     */
    private boolean Ifadmin;

    /**
     * 
     */
    private int Signupdate;

    /**
     * 
     */
    private String Lastdate;

    /**
     * 
     */
    private String Lastip;

    /**
     * 
     */
    private String Lastsite;

    /**
     * 
     */
    private int Age;

    /**
     * 
     */
    private String Sex;

    /**
     * 
     */
    private long Integral;

    /**
     * @return
     */
    public int getUID() {
        // TODO implement here
        return UID;
    }

    /**
     * @param UID
     */
    public void setUID(int UID) {
        // TODO implement here
        this.UID = UID;
    }

    /**
     * @return
     */
    public String getName() {
        // TODO implement here
        return Name;
    }

    /**
     * @param Name
     */
    public void setName(String Name) {
        // TODO implement here
        this.Name = Name;
    }

    /**
     * @return
     */
    public String getPassword() {
        // TODO implement here
        return Password;
    }

    /**
     * @param Password
     */
    public void setPassword(String Password) {
        // TODO implement here
        this.Password = Password;
    }

    /**
     * @return
     */
    public String getImagepath() {
        // TODO implement here
        return Imagepath;
    }

    /**
     * @param Imagepath
     */
    public void setImagepath(String Imagepath) {
        // TODO implement here
        this.Imagepath = Imagepath;
    }

    /**
     * @return
     */
    public boolean getIfadmin() {
        // TODO implement here
        return Ifadmin;
    }

    /**
     * @param Ifadmin
     */
    public void setIfadmin(boolean Ifadmin) {
        // TODO implement here
        this.Ifadmin = Ifadmin;
    }

    /**
     * @return
     */
    public int getSignupdate() {
        // TODO implement here
        return Signupdate;
    }

    /**
     * @param Signupdate
     */
    public void setSignupdate(int Signupdate) {
        // TODO implement here
        this.Signupdate = Signupdate;
    }

    /**
     * @return
     */
    public String getLastip() {
        // TODO implement here
        return Lastip;
    }

    /**
     * @param Lastip
     */
    public void setLastip(String Lastip) {
        // TODO implement here
        this.Lastip = Lastip;
    }

    /**
     * @return
     */
    public String getLastsite() {
        // TODO implement here
        return Lastsite;
    }

    /**
     * @param Lastsite
     */
    public void setLastsite(String Lastsite) {
        // TODO implement here
        this.Lastsite = Lastsite;
    }

    /**
     * @return
     */
    public int getAge() {
        // TODO implement here
        return Age;
    }

    /**
     * @param Age
     */
    public void setAge(int Age) {
        // TODO implement here
        this.Age = Age;
    }

    /**
     * @return
     */
    public String getSex() {
        // TODO implement here
        return Sex;
    }

    /**
     * @param Sex
     */
    public void setSex(String Sex) {
        // TODO implement here
        this.Sex = Sex;
    }

    /**
     * @return
     */
    public long getIntegral() {
        // TODO implement here
        return Integral;
    }

    /**
     * @param Integral
     */
    public void setIntegral(long Integral) {
        // TODO implement here
        this.Integral = Integral;
    }

    /**
     * @return
     */
    public String getLastdata() {
        // TODO implement here
        return Lastdate;
    }

    /**
     * @param Lastdata
     */
    public void setLastdata(String Lastdata) {
        // TODO implement here
        this.Lastdate = Lastdate;
    }

    /**
     * @return
     */
    public String getEmil() {
        // TODO implement here
        return Emil;
    }

    /**
     * @param Emil
     */
    public void setEmil(String Emil) {
        // TODO implement here
        this.Emil = Emil;
    }

}