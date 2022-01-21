<%-- 
    Document   : SessionAdd
    Created on : Dec 21, 2021, 1:21:15 PM
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
        <form action="SessionAddVal.jsp">
            <input type="text" name="s_id" placeholder="Enter Session_Id" required=""/><br>
            <input type="number" name="b_id" placeholder="Enter Batch_Id" required=""/><br>
            <b>Enter The Start Time</b><br>
            <input type="time" name="sdate" required=""/><br>
            <b>Enter The End Time</b><br>
            <input type="time" name="edate" required=""/><br>
            <input type="submit" value="Add"/>
        </form>
    </body>
</html>
