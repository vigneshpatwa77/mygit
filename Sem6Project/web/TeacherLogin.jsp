<%-- 
    Document   : login
    Created on : Sep 29, 2021, 7:59:16 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="background.css" rel="stylesheet"/>
    </head>
    <body>
        <form action="TeacherLogVal.jsp" >
            <div id="form">
                <input type="text" name="Tid" placeholder="Enter ID" required=""><br>
                <input type="password" name="Tpas" placeholder="Enter PassWord" required=""><br>
                <input type="submit" value="Login">
            </div>
        </form>
    </body>
</html>
