package com.gbs.plus.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "GreetingServlet", urlPatterns = {"/greeting"})
public class GreetingServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        // print a hello world message
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Greeting Servlet</title>");
        out.println("</head>");
        out.println("<body");
        out.println("<h1>Hello World!</h1>");
        out.println("</body>");
        out.println("</html>");
        out.flush();
        out.close();


    }

}
