/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheoryOfAlgorithms.Markichev.Lab5;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ruslan
 */
public class Lab5Servlet extends HttpServlet {

   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        String find = request.getParameter("find");
        String result = Lab5_1.FindWord(find);
        request.setAttribute("result", result);
        request.getRequestDispatcher("lab5.jsp").forward(request, response);
    }
}
