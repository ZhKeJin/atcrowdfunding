package com.itcom.servlet;

import javax.servlet.http.HttpServlet;
import java.io.IOException;

/**
 * @author Zhangkj
 * @date 2019-04-17-10:28
 */

public class AServlet extends HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.sendRedirect(request.getContextPath()+"/a.jsp");

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
