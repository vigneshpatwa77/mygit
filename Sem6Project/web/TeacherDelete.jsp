<%-- 
    Document   : TeacherDelete
    Created on : Dec 23, 2021, 10:06:51 PM
    Author     : windows
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="TeacherDeleteVal.jsp" method="POST">
            <input type="text" name="t_id" placeholder="Enter T_id " required=""/>
            <input type="submit" value="Delete" />
        </form>
    </body>
</html>
