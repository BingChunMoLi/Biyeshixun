package com.bingchunmoli.Test;


import com.bingchunmoli.Dao.UserAdditions;
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
 * @Description: [测试]
 * @Author: [${user}]
 * @CreateDate: [${date} ${time}]
 * @UpdateUser: [${user}]
 * @UpdateDate: [${date} ${time}]
 * @UpdateRemark: [说明本次修改内容]
 */
@WebServlet(name = "Test_Servlet",urlPatterns = "/test")
public class Test_Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        boolean flag = false;
        HttpSession s = request.getSession();
        String user = request.getParameter("user");
        User User = new User();
        UserAdditions ua = new UserAdditions();
        flag = ua.Search_user(user);
        if (flag){
            s.setAttribute("user",User.getUID());
            out.println("有");
        }else{
            out.print("查无此人");
        }
        out.print(User.getUID());
        String IP = request.getRemoteAddr();
        System.out.println(IP);
        out.println(user);
    }
}
