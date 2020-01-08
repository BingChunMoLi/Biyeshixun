package com.bingchunmoli.Util;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * @ProjectName: [BingChunMoLi]
 * @Package: [city.yasuo.util.SHA1]
 * @ClassName: [冰彦糖]
 * @Description: [SHA1加密]
 * @Author: [冰彦糖]
 * @CreateDate: [2019.12.14 00:42]
 * @UpdateUser: [冰彦糖]
 * @UpdateDate: [2019.12.14 00:42]
 * @UpdateRemark: [说明本次修改内容]
 */
public class SHA1 {
    /**
     * @param psw SHA1加密字符串
     * @return  哈希值
     */
    public static String encodePassword(String psw) {
        if(StringUtils.isEmpty(psw)){
            return null;
        }else{
            return DigestUtils.sha1Hex(psw);
        }
    }
}
