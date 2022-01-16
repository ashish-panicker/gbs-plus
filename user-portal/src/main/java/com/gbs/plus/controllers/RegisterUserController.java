package com.gbs.plus.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RegisterUserController", urlPatterns = {"/register.view"})
public class RegisterUserController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");

        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>User Name: " + userName + "</h1>");
        out.println("<h1>Password: " + password + "</h1>");
        out.println("<h1>Req Recived at: " + req.getAttribute("reqRecvdTime") + "</h1>");
        out.println("<h1>Current Time at: " + LocalTime.now() + "</h1>");

        out.println("</body>");
        out.println("</html>");
    }
}
