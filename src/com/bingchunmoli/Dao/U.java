package com.bingchunmoli.Dao;

import com.bingchunmoli.Obj.User;

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
@WebServlet(name = "U",urlPatterns = "/u")
public class U extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        Object session1 = session.getAttribute("User");
        User u = new User();
        Integer UID = (Integer) session1;
        if (UID == null){
            UID = Integer.valueOf(request.getParameter("uid"));
        }
        u.setUID(UID);

        String uid = request.getParameter("uid");
        String IP = request.getParameter("IP");
        String city = request.getParameter("city");
        UserAddachieve userAddachieve = new UserAddachieve();
        userAddachieve.userupdate(UID,IP,city);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.print("请重新提交表单");
    }
}
