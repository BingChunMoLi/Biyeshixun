package com.bingchunmoli.Dao;

import com.bingchunmoli.Obj.User;
import com.bingchunmoli.Util.Ajax;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @ProjectName: [${project_name}]
 * @Package: [${package_name}.${file_name}]
 * @ClassName: [${type_name}]
 * @Description: [一句话描述该类的功能]
 * @Author: [${user}]
 * @CreateDate: [${date} ${time}]
 * @UpdateUser: [${user}]
 * @UpdateDate: [${date} ${time}]
 * @UpdateRemark: [说明本次修改内容]
 */
@WebServlet(name = "Userinfo",urlPatterns = "/userinfo")
public class Userinfo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        Object session1 = session.getAttribute("User");
        System.out.println(session1);
//        System.out.println(session.getAttribute("User"));
        User u = new User();
        Integer uid = (Integer) session1;
        u.setUID(uid);
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String sex = request.getParameter("reason");
        String age = request.getParameter("name");
        UserAddachieve userAddachieve = new UserAddachieve();
        Cookie[] cookie = request.getCookies();
        for (Cookie co:cookie) {
            System.out.println(co.getName() + ":" + co.getValue());
        }
        try {
            userAddachieve.update("User",4,"name=?,email=?,sex=?,age=?",name,email,sex,age,"uid",uid);
        }catch (Exception e){
            System.out.println(e);
        }
        Ajax.Ajax("更新信息成功",response);
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.print("请重新提交");
    }
}
