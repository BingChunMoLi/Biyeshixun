package com.bingchunmoli.Util;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;

import java.security.MessageDigest;

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

    public static String getSha1(String str) {

        char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'a', 'b', 'c', 'd', 'e', 'f' };
        try {
            MessageDigest mdTemp = MessageDigest.getInstance("SHA1");
            mdTemp.update(str.getBytes("UTF-8"));
            byte[] md = mdTemp.digest();
            int j = md.length;
            char buf[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                buf[k++] = hexDigits[byte0 >>> 4 & 0xf];
                buf[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(buf);
        } catch (Exception e) {
            return null;
        }
    }

}
