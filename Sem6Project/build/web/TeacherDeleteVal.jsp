<%@page import="temodel.tuser"%>
<%@page import="tedaoimp.tuserdaoimp"%>
<%
     String t_id = request.getParameter("t_id");
     tuserdaoimp ti = new tuserdaoimp();
     tuser t = ti.getTeacherbyid(t_id);
    boolean b = ti.deleteTeacher(t);
    if(b){
       response.sendRedirect("./StudentTable.jsp");
    }else{
        System.out.println("failed");
    }
    
%>