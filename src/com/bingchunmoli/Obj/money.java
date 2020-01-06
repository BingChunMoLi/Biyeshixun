package com.bingchunmoli.Obj;

import java.util.*;

/**
 * - JID,基金的ID
 * - UID,用户的ID
 * - Data,时间
 * - Change,变化类型（增长or使用）
 * - Value,变化值
 */
public class money {

    /**
     * Default constructor
     */
    public money() {
    }

    /**
     * 
     */
    private long JID;

    /**
     * 
     */
    private int UID;

    /**
     * 
     */
    private String Data;

    /**
     * 
     */
    private String Change;

    /**
     * 
     */
    private int Value;

    /**
     * @return
     */
    public long getJID() {
        // TODO implement here
        return JID;
    }

    /**
     * @param JID
     */
    public void setJID(long JID) {
        // TODO implement here
        this.JID = JID;
    }

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
    public String getData() {
        // TODO implement here
        return Data;
    }

    /**
     * @param Data
     */
    public void setData(String Data) {
        // TODO implement here
        this.Data = Data;
    }

    /**
     * @return
     */
    public String getChange() {
        // TODO implement here
        return Change;
    }

    /**
     * @param Change
     */
    public void setChange(String Change) {
        // TODO implement here
        this.Change = Change;
    }

    /**
     * @return
     */
    public int getValue() {
        // TODO implement here
        return Value;
    }

    /**
     * @param Value
     */
    public void setValue(int Value) {
        // TODO implement here
        this.Value = Value;
    }

}