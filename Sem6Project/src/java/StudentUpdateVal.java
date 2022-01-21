/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import stdaoimp.Userimp;
import stmodel.User;

/**
 *
 * @author windows
 */
public class StudentUpdateVal extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String cid = request.getParameter("cid");
    String cnm = request.getParameter("cnm");
    String csesid = request.getParameter("csesid");
    Userimp ui = new Userimp();
    User u = ui.getUserbyId(cid);
    System.out.println(u);
    u.setName(cnm);
    u.setSessionid(csesid);
    boolean b = ui.updateUser(u);
    if(b){
       response.sendRedirect("./StudentTable.jsp");
    }else{
        System.out.println("failed");
    }
    }

}

