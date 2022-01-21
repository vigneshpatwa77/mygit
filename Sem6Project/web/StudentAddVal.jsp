<%-- 
    Document   : regval
    Created on : Oct 26, 2021, 11:08:26 PM
    Author     : HP
--%>


<%@page import="stmodel.User"%>
<%@page import="stdaoimp.Userimp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    String rid = request.getParameter("rid");
    String rnm = request.getParameter("rnm");
    String rsid = request.getParameter("rsid");
    Userimp ui = new Userimp();
    User u = new User(rid, rnm, rsid);
    u.setId(rid);
    u.setName(rnm);
    u.setSessionid(rsid);
    boolean b = ui.addUser(u);
    if(b){
        System.out.println("sucess");
        response.sendRedirect("./table.jsp");
    }
    else{
        System.out.println("failed");
    }
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
    </body>
</html>
