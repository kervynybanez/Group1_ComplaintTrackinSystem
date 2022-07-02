package com.example.group1_complainttrackinsystem;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FileComplaintServlet", value = "/FileComplaint")
public class FileComplaintServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out =  response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<style>");
        out.println("body{");
        out.println("background: linear-gradient(to right, #9c27b0, #8ecdff);");
        out.println("overflow: hidden");
        out.println("}");
        out.println("h3{");
        out.println("text-align: center;");
        out.println("font-family: 'Iron Bridge';");
        out.println("font-size: 25px;");
        out.println("color: white;");
        out.println("width: 100%");
        out.println("position: relative;");
        out.println("}");
        out.println("h5{");
        out.println("text-align: center;");
        out.println("font-family: 'Iron Bridge';");
        out.println("font-size: 15px;");
        out.println("color: white;");
        out.println("width: 100%");
        out.println("position: relative;");
        out.println("}");
        out.println(".inputs {");
        out.println("font-family: 'Microsoft YaHei UI';");
        out.println("text-align: center;");
        out.println("color: white;");
        out.println("}");
        out.println("#desc {");
        out.println("margin-bottom: 3px;");
        out.println("width: 400px;");
        out.println("height: 150px;");
        out.println("margin-right: 10px;");
        out.println("}");
        out.println("#submitBtn {");
        out.println("font-family: 'Microsoft YaHei UI';");
        out.println("background-color: cornflowerblue;");
        out.println("border: none");
        out.println("color: white;");
        out.println("padding: 15px 32px;");
        out.println("text-decoration: none;");
        out.println("font-size: 16px;");
        out.println("margin-top: 10px;");
        out.println("}");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class=\"logo\" style=\"text-align: center\">");
        out.println("<img src=\"brokengadget.png\" width=\"20%\" height\"30%\">");
        out.println("</div>");
        out.println("<h3>Login Successful!</h3>");
        out.println("<h5>What is your complaint?<h5>");
        out.println("<br/>");
        out.println("<form method=\"POST\" action=\"FileComplaint\">");
        out.println("<h5>Please specify below:</h5>");
        out.println("<div class=\"inputs\">");
        out.println("<input type=\"textarea\" name=\"complaint\" id=\"desc\"/>");
        out.println("<br/>");
        out.println("<button type=\"submit\" id=\"submitBtn\"> Submit</button>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String complaint = (request.getParameter("complaint"));
        String x = complaint;

        request.setAttribute("result", x);

        RequestDispatcher rd = request.getRequestDispatcher("/logout");
        rd.forward(request, response);
    }
}
