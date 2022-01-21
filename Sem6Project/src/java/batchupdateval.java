/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import bdaoimp.batchimp;
import bmodel.batch;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author windows
 */
public class batchupdateval extends HttpServlet {

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
        String bu_id1, su_id, utime, eudate;
        bu_id1 = request.getParameter("bu_id1");
        su_id = request.getParameter("su_id");
        utime = request.getParameter("udate");
        eudate = request.getParameter("eudate");
        batchimp bi = new batchimp();
        batch bl =  bi.getBatchById(bu_id1);
        bl.setB_id(bu_id1);
        bl.setS_id(su_id);
        bl.setTime(utime);
        bl.setEntime(eudate);
        boolean b = bi.UpdateBatch(bl);
        if (b) {
            response.sendRedirect("./TeacherLogin.jsp");
        } else {
            System.out.println("failed");
        }
    }

}
