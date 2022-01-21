<%@page import="tedaoimp.tuserdaoimp"%>
<%@page import="temodel.tuser"%>
<%
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
       response.sendRedirect("./StudentTable.jsp");
    }else{
        System.out.println("failed");
    }
%>