package com.itcom.text;

import java.io.IOException;

/**
 * @author Zhangkj
 * @date 2019-04-17-9:45
 */
public class AServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String name = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(name+"..."+password);

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
