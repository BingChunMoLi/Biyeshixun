package com.bingchunmoli.Util;

import com.bingchunmoli.Dao.UserAddachieve;
import com.bingchunmoli.Dao.UserAdditions;

import javax.servlet.http.Cookie;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "login",urlPatterns = "/login.do")
public class login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        boolean user_rex,pwd_rex,user_null;
        String username = (String) request.getParameter("name");
        String password = (String) request.getParameter("pass");
        String email = (String)request.getParameter("email");
        user_rex = If.check(".{8,20}",username);
        pwd_rex = If.check("[a-zA-Z]+([0-9a-zA-Z]){5,11}",password);
        user_null = UserAdditions.Search_user(username);
        if (user_rex && pwd_rex){
            if (user_null){
                HttpSession session =  request.getSession();
                if (session.getAttribute(username) == null){
                    UserAddachieve user = new UserAddachieve();
                    password = SHA1.getSha1(password);
                    boolean a = user.userquery("User",username,password);
                    if(a){
                        if (username.equals("username")){
                            int uid = user.useruid("User",username);
                            session.setAttribute("User",uid);
                            Cookie cookie = new Cookie("User",String.valueOf(uid));
                            Cookie cookie1 = new Cookie("Admin","true");

                            response.addCookie(cookie);
                            response.addCookie(cookie1);
//                            Ajax.Ajax("/page/Administrators.html",response);
                            out.print("/");
                            response.setHeader("refresh", "1;url=/page/Administrators.html");
                        }else{
                            int uid = user.useruid("User",username);
                            session.setAttribute("User",uid);
                            Cookie cookie = new Cookie("User",String.valueOf(uid));
//                            cookie.setMaxAge(0);
                            response.addCookie(cookie);
//                            Ajax.Ajax("/",response);
                            out.print("/");
                        }
                    }else{
                        out.print("登录失败，密码错误");
                    }
                }else{
                    response.sendRedirect("/page/login/login.html");
                }
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
