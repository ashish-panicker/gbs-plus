package com.gbs.plus.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "UserController", urlPatterns = {"/user.do"})
public class UserController extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String action = req.getParameter("action");
        switch (action) {
            case "login":
                login(req, resp);
                break;
            case "logout":
                logout(req, resp);
                break;
            case "register":
                RequestDispatcher dispatch =  req.getRequestDispatcher("register.view");
                req.setAttribute("reqRecvdTime", LocalTime.now());
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                dispatch.forward(req, resp);
// 
                // resp.sendRedirect("user.html");
                break;
        }


    }

    private void logout(HttpServletRequest req, HttpServletResponse resp) {}

    private void login(HttpServletRequest req, HttpServletResponse resp) {}

    private void register(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");

        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>User Name: " + userName + "</h1>");
        out.println("<h1>Password: " + password + "</h1>");
        out.println("</body>");
        out.println("</html>");
    }

}
