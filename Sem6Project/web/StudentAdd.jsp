<%-- 
    Document   : register
    Created on : Oct 26, 2021, 10:49:46 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>


    <body>
        <form action="StudentAddVal.jsp" method="post">
            <input type="text" name="rid" placeholder="Please Enter Student ID"/><br>
            <input type="text" name="rnm" placeholder="Please Enter Student Name"/><br>
            <input type="text" name="rsid" placeholder="Please Enter Session Id"/><br>
            <input type="submit" value="Register"/>
        </form>
    </body>
</html>
