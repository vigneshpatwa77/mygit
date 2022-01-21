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
import tedaoimp.tuserdaoimp;
import temodel.tuser;

/**
 *
 * @author windows
 */
public class Teacherupdateval extends HttpServlet {

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
            String tid = request.getParameter("tid");
    String tnm = request.getParameter("tnm");
    String tpas = request.getParameter("tpas");
    String tcr = request.getParameter("tcr");
    
    tuserdaoimp ti = new tuserdaoimp();
    tuser t = ti.getTeacherbyid(tid);
    t.setName(tnm);
    t.setPassword(tpas);
    t.setCourse(tcr);
    boolean bi = ti.updateTeacher(t);
    if(bi){
       response.sendRedirect("./TeacherLogin.jsp");
    }else{
        System.out.println("failed");
    }
    }
}





