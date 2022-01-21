<%-- 
    Document   : updateval
    Created on : Oct 9, 2021, 1:08:44 PM
    Author     : HP
--%>


<%@page import="stmodel.User"%>
<%@page import="stdaoimp.Userimp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
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
       response.sendRedirect("./TeacherLogin.jsp");
    }else{
        System.out.println("failed");
    }
%>



<html>
    <head>
    </head>
    <body>
        
    </body>
</html>
