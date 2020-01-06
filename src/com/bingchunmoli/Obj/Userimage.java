package com.bingchunmoli.Obj;

import java.util.*;

/**
 * - IID,图片ID
 * - Name,用户名	
 * - Data,上传时间	
 * - Path,路径	
 * - Type_mime,图片类型
 * - Alt,图片描述
 */
public class Userimage {

    /**
     * Default constructor
     */
    public Userimage() {
    }

    /**
     * 
     */
    private long IID;

    /**
     * 
     */
    private String Name;

    /**
     * 
     */
    private String Data;

    /**
     * 
     */
    private String Path;

    /**
     * 
     */
    private String Type_mime;

    /**
     * 
     */
    private String Alt;

    /**
     * @return
     */
    public long getIID() {
        // TODO implement here
        return IID;
    }

    /**
     * @param IID
     */
    public void setIID(long IID) {
        // TODO implement here
        this.IID = IID;
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
    public String getPath() {
        // TODO implement here
        return Path;
    }

    /**
     * @param Path
     */
    public void setPath(String Path) {
        // TODO implement here
        this.Path = Path;
    }

    /**
     * @return
     */
    public String getType_mime() {
        // TODO implement here
        return Type_mime;
    }

    /**
     * @param Type_mime
     */
    public void setType_mime(String Type_mime) {
        // TODO implement here
        this.Type_mime = Type_mime;
    }

    /**
     * @return
     */
    public String getAlt() {
        // TODO implement here
        return Alt;
    }

    /**
     * @param Alt
     */
    public void setAlt(String Alt) {
        // TODO implement here
        this.Alt = Alt;
    }

}