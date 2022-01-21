<%-- 
    Document   : TeacherAdd
    Created on : Dec 23, 2021, 10:04:54 PM
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
        <form action="TeacherAddVal.jsp" method="POST">
            <input type="text" name="tid" placeholder="Enter Teacher ID" required="" /><br>
            <input type="text" name="tnm" placeholder="Enter Teacher Name" required=""/><br>
            <input type="password" name="tpas" placeholder="Enter Password" required=""/><br>
            <input type="text" name="cr" placeholder="Enter Course" required=""/><br>
            <input type="submit" value="Register"/>
        </form>
    </body>
</html>
