package ron.server;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 * User: apelbaur
 * Date: 12/5/13
 * Time: 3:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyMessageServlet extends javax.servlet.http.HttpServlet {

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        MyMessage my = new MyMessage(this.getClass().getName());
        String message = my.getMessage();
        PrintWriter out = response.getWriter();
        out.println(message);
    }
}
