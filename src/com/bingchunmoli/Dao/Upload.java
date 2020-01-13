package com.bingchunmoli.Dao;


import com.bingchunmoli.Obj.User;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

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
@WebServlet(name = "Upload",urlPatterns = "/upload")
public class Upload extends HttpServlet {
    //    定义上传目录
    static final String UPLOAD_DIRECTORY = "upload";
    //    单次上传文件的最大限制
    static final int MEMORY_THRESHOLD = 1024 * 1024 * 40;//40M
    static final int MAX_FILE_SIZE = 1024 * 1024 * 40;//单个文件最大40m
    static final int MAX_REQUEST_SIZE = 1024 * 1024 * 80;//单次请求能够上传最大的文件大小
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setHeader("content-type", "text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        Object session1 = session.getAttribute("User");
        if (session1 != null){
            User u = new User();
            Integer uid = (Integer) session1;
            u.setUID(uid);
            if (!ServletFileUpload.isMultipartContent(request)) {
                out.println("表单的类型必须是  enctype=multipart/form-data");
                out.flush();
                return;
            }

//        配置上传参数
            DiskFileItemFactory factory = new DiskFileItemFactory();
//        设置内存临界值，超过该值将产生临时文件并存于临时目录
            factory.setSizeThreshold(MEMORY_THRESHOLD);
//        设置临时存储目录
            factory.setRepository(new File(System.getProperty("java.io.tmpdir")));
//        创建上传文件的对象
            ServletFileUpload upload = new ServletFileUpload(factory);
//        设置最大文件上传值
            upload.setFileSizeMax(MAX_FILE_SIZE);
//        设置最大请求值（表单数据和文件本身）
            upload.setSizeMax(MAX_REQUEST_SIZE);
//        设置编码
            upload.setHeaderEncoding("UTF-8");
//        上传的文件会在站点的根目录下
            String uploadPath = request.getServletContext().getRealPath("./") + File.separator + UPLOAD_DIRECTORY;
            File uploadDir = new File(uploadPath);
//        文件不存在就创建该目录
            if (!uploadDir.exists()) {
                uploadDir.mkdir();
            }

            try {
                List<FileItem> formItems = upload.parseRequest(request);
//            请求中包含了文件
                if (formItems != null && formItems.size() > 0) {
                    for (FileItem item : formItems) {
//                    处理非文件上传字段
                        if (!item.isFormField()) {
//                        文件名称
                            String fileName = new File(item.getName()).getName();
//                        构造完整的文件路径
                            String filePath = uploadPath + File.separator + fileName;
//                        输出文件路径
                            System.out.println(filePath);
//                        创建文件对象
                            File storeFile = new File(filePath);
//                        文件写道该文件中
                            item.write(storeFile);
                            updao updao = new updao();
                            updao.add(filePath,"头像",uid);
                            request.setAttribute("msg", "文件上传成功");
                            out.print("<!--\n" +
                                    " * @Author: your name\n" +
                                    " * @Date: 2020-01-11 00:52:18\n" +
                                    " * @LastEditTime : 2020-01-11 00:54:04\n" +
                                    " * @LastEditors  : Please set LastEditors\n" +
                                    " * @Description: In User Settings Edit\n" +
                                    " * @FilePath: \\undefinedd:\\Github\\Biyesheji\\web\\page\\b\\boos.html\n" +
                                    " -->\n" +
                                    "<!DOCTYPE html>\n" +
                                    "<html lang=\"en\">\n" +
                                    "\n" +
                                    "    <head>\n" +
                                    "\n" +
                                    "        <meta charset=\"utf-8\">\n" +
                                    "        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                                    "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                                    "        <title>Bootstrap Modal Registration Form Template</title>\n" +
                                    "\n" +
                                    "        <!-- CSS -->\n" +
                                    "        <link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/css?family=Roboto:400,100,300,500\">\n" +
                                    "        <link rel=\"stylesheet\" href=\"/css/b.min.css\">\n" +
                                    "\t\t<link rel=\"stylesheet\" href=\"/css/form-elements.css\">\n" +
                                    "        <link rel=\"stylesheet\" href=\"/css/style.css\">\n" +
                                    "\n" +
                                    "    \n" +
                                    "\n" +
                                    "        <!-- Favicon and touch icons -->\n" +
                                    "        <link rel=\"shortcut icon\" href=\"assets/ico/favicon.png\">\n" +
                                    "\n" +
                                    "    </head>\n" +
                                    "\n" +
                                    "    <body>\n" +
                                    "\n" +
                                    "        <!-- Content -->\n" +
                                    "        <div class=\"top-content\">\n" +
                                    "        \t\n" +
                                    "            <div class=\"inner-bg\">\n" +
                                    "                <div class=\"container\">\n" +
                                    "                    <div class=\"row\">\n" +
                                    "                        <div class=\"col-sm-8 col-sm-offset-2 text\">\n" +
                                    "                        \t<a class=\"logo\" href=\"index.html\"></a>\n" +
                                    "                            <h1><strong>上传成功</strong></h1>\n" +
                                    "                            <div class=\"description\">\n" +
                                    "                            \t<p>\n" +
                                    "\t                            \t页面三秒后跳转或点击跳转主页<a href=\"/index.html\"></a>\n" +
                                    "                            \t</p>\n" +
                                    "                            </div>\n" +
                                    "                            <div class=\"top-big-link\">\n" +
                                    "                            \t<a class=\"btn btn-link-1 launch-modal\" href=\"/index.html\" data-modal-id=\"modal-register\">返回主页</a>\n" +
                                    "                            </div>\n" +
                                    "                        </div>\n" +
                                    "                    </div>\n" +
                                    "                </div>\n" +
                                    "            </div>\n" +
                                    "            \n" +
                                    "        </div>\n" +
                                    "        \n" +
                                    "        <!-- MODAL -->\n" +
                                    "       \n" +
                                    "\n" +
                                    "\n" +
                                    "        <!-- Javascript -->\n" +
                                    "        <script src=\"/js/jquery-1.11.1.min.js\"></script>\n" +
                                    "        <script src=\"/js/bootstrap.min.js\"></script>\n" +
                                    "        <script src=\"/js/jquery.backstretch.min.js\"></script>\n" +
                                    "        <script src=\"/js/scripts.js\"></script>\n" +
                                    "        \n" +
                                    "        <!--[if lt IE 10]>\n" +
                                    "            <script src=\"assets/js/placeholder.js\"></script>\n" +
                                    "        <![endif]-->\n" +
                                    "\t<script>\n" +
                                    "        window.onload=function(){\n" +
                                    "            window.setTimeout(function () {\n" +
                                    "                window.location.href='/index.html'\n" +
                                    "            },3000);\n" +
                                    "        }\n" +
                                    "\t</script>" +
                                    "    </body>\n" +
                                    "\n" +
                                    "</html>");
                        }

                    }

                }
            } catch (FileUploadException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            out.print("<!--\n" +
                    " * @Author: your name\n" +
                    " * @Date: 2020-01-11 00:52:18\n" +
                    " * @LastEditTime : 2020-01-11 00:54:04\n" +
                    " * @LastEditors  : Please set LastEditors\n" +
                    " * @Description: In User Settings Edit\n" +
                    " * @FilePath: \\undefinedd:\\Github\\Biyesheji\\web\\page\\b\\boos.html\n" +
                    " -->\n" +
                    "<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "\n" +
                    "    <head>\n" +
                    "\n" +
                    "        <meta charset=\"utf-8\">\n" +
                    "        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                    "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                    "        <title>Bootstrap Modal Registration Form Template</title>\n" +
                    "\n" +
                    "        <!-- CSS -->\n" +
                    "        <link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/css?family=Roboto:400,100,300,500\">\n" +
                    "        <link rel=\"stylesheet\" href=\"/css/b.min.css\">\n" +
                    "\t\t<link rel=\"stylesheet\" href=\"/css/form-elements.css\">\n" +
                    "        <link rel=\"stylesheet\" href=\"/css/style.css\">\n" +
                    "\n" +
                    "    \n" +
                    "\n" +
                    "        <!-- Favicon and touch icons -->\n" +
                    "        <link rel=\"shortcut icon\" href=\"assets/ico/favicon.png\">\n" +
                    "\n" +
                    "    </head>\n" +
                    "\n" +
                    "    <body>\n" +
                    "\n" +
                    "        <!-- Content -->\n" +
                    "        <div class=\"top-content\">\n" +
                    "        \t\n" +
                    "            <div class=\"inner-bg\">\n" +
                    "                <div class=\"container\">\n" +
                    "                    <div class=\"row\">\n" +
                    "                        <div class=\"col-sm-8 col-sm-offset-2 text\">\n" +
                    "                        \t<a class=\"logo\" href=\"index.html\"></a>\n" +
                    "                            <h1><strong>请登录</strong></h1>\n" +
                    "                            <div class=\"description\">\n" +
                    "                            \t<p>\n" +
                    "\t                            \t页面三秒后跳转或点击跳转登录<a href=\"/page/login/login.html\"></a>\n" +
                    "                            \t</p>\n" +
                    "                            </div>\n" +
                    "                            <div class=\"top-big-link\">\n" +
                    "                            \t<a class=\"btn btn-link-1 launch-modal\" href=\"/index.html\" data-modal-id=\"modal-register\">返回主页</a>\n" +
                    "                            </div>\n" +
                    "                        </div>\n" +
                    "                    </div>\n" +
                    "                </div>\n" +
                    "            </div>\n" +
                    "            \n" +
                    "        </div>\n" +
                    "        \n" +
                    "        <!-- MODAL -->\n" +
                    "       \n" +
                    "\n" +
                    "\n" +
                    "        <!-- Javascript -->\n" +
                    "        <script src=\"/js/jquery-1.11.1.min.js\"></script>\n" +
                    "        <script src=\"/js/bootstrap.min.js\"></script>\n" +
                    "        <script src=\"/js/jquery.backstretch.min.js\"></script>\n" +
                    "        <script src=\"/js/scripts.js\"></script>\n" +
                    "        \n"+
                    "        <!--[if lt IE 10]>\n" +
                    "            <script src=\"assets/js/placeholder.js\"></script>\n" +
                    "        <![endif]-->\n" +
                    "\t<script>\n" +
                    "        window.onload=function(){\n" +
                    "            window.setTimeout(function () {\n" +
                    "                window.location.href='/page/login/login.html'\n" +
                    "            },3000);\n" +
                    "        }\n" +
                    "\t</script>"+
                    "    </body>\n" +
                    "\n" +
                    "</html>");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("请重新提交");
    }
}
