package ron.server;


import ron.message.HelloMessage;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 * User: apelbaur
 * Date: 12/5/13
 * Time: 3:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyServlet extends javax.servlet.http.HttpServlet {

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("ron.server.MyServlet.doGet: name= " + request.getParameter("name"));
        HelloMessage my = new HelloMessage(request.getParameter("name"));
        String message = my.getMessage();
        if (request.getParameterValues("additional") != null && request.getParameterValues("additional").length > 0 && "length".equals(request.getParameterValues("additional")[0])) {
            message += "length= " + my.getNameLength();
        }
        PrintWriter out = response.getWriter();
        out.println(HTMLMessage.getHEMLMessage(message));
    }
}
