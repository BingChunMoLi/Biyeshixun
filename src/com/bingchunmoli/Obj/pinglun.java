package com.bingchunmoli.Obj;

import java.util.*;

/**
 * - PID,评论ID
 * - TID,帖子ID
 * - UID,用户ID
 * - Comment,评论
 * - Data,时间
 * - AtPID,回复@的ID
 * - ReplyID,回复评论的ID
 */
public class pinglun {

    /**
     * Default constructor
     */
    public pinglun() {
    }

    /**
     * 
     */
    private long PID;

    /**
     * 
     */
    private long TID;

    /**
     * 
     */
    private long UID;

    /**
     * 
     */
    private String Comment;

    /**
     * 
     */
    private String Data;

    /**
     * 
     */
    private long AtPID;

    /**
     * 
     */
    private long ReplyID;

    /**
     * @return
     */
    public long getPID() {
        // TODO implement here
        return PID;
    }

    /**
     * @param PID
     */
    public void setPID(long PID) {
        // TODO implement here
        this.PID = PID;
    }

    /**
     * @return
     */
    public long getTID() {
        // TODO implement here
        return TID;
    }

    /**
     * @param TID
     */
    public void setTID(long TID) {
        // TODO implement here
        this.TID = TID;
    }

    /**
     * @return
     */
    public long getUID() {
        // TODO implement here
        return UID;
    }

    /**
     * @param UID
     */
    public void setUID(long UID) {
        // TODO implement here
        this.UID = UID;
    }

    /**
     * @return
     */
    public String getComment() {
        // TODO implement here
        return Comment;
    }

    /**
     * @param Comment
     */
    public void setComment(String Comment) {
        // TODO implement here
        this.Comment = Comment;
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
    public long getAtPID() {
        // TODO implement here
        return AtPID;
    }

    /**
     * @param AtPID
     */
    public void setAtPID(long AtPID) {
        // TODO implement here
        this.AtPID = AtPID;
    }

    /**
     * @return
     */
    public long getReplyID() {
        // TODO implement here
        return ReplyID;
    }

    /**
     * @param ReplyID
     */
    public void setReplyID(long ReplyID) {
        // TODO implement here
        this.ReplyID = ReplyID;
    }

}