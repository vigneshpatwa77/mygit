<%-- 
    Document   : deleteval
    Created on : Oct 11, 2021, 5:26:12 PM
    Author     : HP
--%>



<%@page import="stmodel.User"%>
<%@page import="stdaoimp.Userimp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
     String did = request.getParameter("did");
     Userimp ui = new Userimp();
    User u = ui.getUserbyId(did);
    System.out.println(u);
    boolean b = ui.deleteUser(u);
    if(b){
       response.sendRedirect("./table.jsp");
    }else{
        System.out.println("failed");
    }
    
%>


<!DOCTYPE html>
<html>
    <head>
    </head>
    <body>
    </body>
</html>
