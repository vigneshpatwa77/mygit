<%-- 
    Document   : update
    Created on : Oct 6, 2021, 12:03:29 PM
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
        <form action="StudentUpdateVal" method="post">
            <input type="text" name="cid" placeholder="Enter Student_id"/><br><br>
            <input type="text" name="cnm" placeholder="Enter the change name"/><br><br>
            <input type="text" name="csesid" placeholder="Enter the change session_id"/><br><br>
            <input type="submit" title="update"/>
        </form>
    </body>
</html>
