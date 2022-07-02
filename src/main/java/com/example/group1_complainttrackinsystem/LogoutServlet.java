package com.example.group1_complainttrackinsystem;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LogoutServlet", value = "/logout")
public class LogoutServlet extends HttpServlet {

    private String message;

    public void init() {
        message = "Hello Sir";
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out =  response.getWriter();
        response.setContentType("text/html");

        out.println("<html>");
        out.println("<head>");
        out.println("</html>");
        out.println("</head>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        String x = request.getParameter("complaint");
        String result = (String) request.getAttribute("result");

        PrintWriter out =  response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<h1>"+ result +"</h1>");
        out.println("</html>");
        out.println("</head>");
    }
}
