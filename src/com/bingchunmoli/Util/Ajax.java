package com.bingchunmoli.Util;

import com.alibaba.fastjson.JSON;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @ProjectName: [Biyesheji]
 * @Package: [com.bingchunmoli.util.Ajax]
 * @ClassName: [冰彦糖]
 * @Description: [一句话描述该类的功能]
 * @Author: [冰彦糖]
 * @CreateDate: [2020.1.9 15:31]
 * @UpdateUser: [冰彦糖]
 * @UpdateDate: [2020.1.9 15:31]
 * @UpdateRemark: [说明本次修改内容]
 */
public class Ajax {
    public static void Ajax(Object obj, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/json;charset=utf-8");
        PrintWriter out = resp.getWriter();
        String resJson = JSON.toJSONString(obj);
        out.print(resJson);
    }
}
