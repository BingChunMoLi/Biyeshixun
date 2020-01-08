package com.bingchunmoli.Util;

import java.util.regex.Pattern;

/**
 * @ProjectName: [Biyesheji]
 * @Package: [com.bingchunmoli.Util.If.If]
 * @ClassName: [冰彦糖]
 * @Description: [一句话描述该类的功能]
 * @Author: [冰彦糖]
 * @CreateDate: [2020.1.8 13:32]
 * @UpdateUser: [冰彦糖]
 * @UpdateDate: [2020.1.8 13:32]
 * @UpdateRemark: [说明本次修改内容]
 */
public class If {
    /**
     * @param regex 正则表达是字符串
     * @param Str   验证字符串
     * @return  相同为turn
     */
    public static boolean check(String regex,String Str) {
        return Pattern.matches(regex, Str);
    }
}
