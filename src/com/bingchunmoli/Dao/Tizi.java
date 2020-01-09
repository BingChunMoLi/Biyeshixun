package com.bingchunmoli.Dao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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
@WebServlet(name = "Tizi",urlPatterns = "/tiezi")
public class Tizi extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        HttpSession session =  request.getSession();
        session.getAttribute("User");
        String tizi = request.getParameter("comment");
        String title = request.getParameter("title");
        UserAddachieve userAddachieve = new UserAddachieve();
        userAddachieve.add("tiezi",2,"title","article",title,tizi);
        out.print("发表成功");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.print("请重新提交表单");
    }
}
