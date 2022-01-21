<%@page import="tedaoimp.tuserdaoimp"%>
<%@page import="temodel.tuser"%>
<%
    String tid,tnm,tpas,cr;
    tid = request.getParameter("tid");
    tnm = request.getParameter("tnm");
    tpas = request.getParameter("tpas");
    cr = request.getParameter("cr");

tuser t = new tuser(tid, tnm, tpas, cr);
tuserdaoimp ti = new tuserdaoimp();
boolean b = ti.addTeacher(t);

if (b) {
     response.sendRedirect("./StudentTable.jsp");            
    } else {
    
    }

%>