package com.bingchunmoli.Util;

import com.bingchunmoli.Dao.UserAddachieve;
import com.bingchunmoli.Dao.UserAdditions;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "login",urlPatterns = "/login.do")
public class login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        boolean user_rex,pwd_rex,user_null;
        String username = (String) request.getParameter("name");
        String password = (String) request.getParameter("pass");
        user_rex = If.check(".{8,20}",username);
        pwd_rex = If.check("[a-zA-Z]+([0-9a-zA-Z]){5,11}",password);
        user_null = UserAdditions.Search_user(username);
        if (user_rex && pwd_rex){
            if (user_null){
                HttpSession session =  request.getSession();
//                if(session.isNew()){
                    UserAddachieve user = new UserAddachieve();
                    password = SHA1.encodePassword(password);
                    user.userquery("user",username,password);
                    session.setAttribute("user",username);
//                }else{
//                    response.sendRedirect("/");
//                }
//                System.out.println(session.getId());
            }else{
                out.print("没有此用户");
            }
        }else {
            out.print("用户名及密码不符合规范");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("请重新提交表单");
    }
}
