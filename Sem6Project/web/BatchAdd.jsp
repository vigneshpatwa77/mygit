<%-- 
    Document   : BatchAdd
    Created on : Dec 22, 2021, 7:00:40 PM
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
        <form action="BatchAddVal.jsp">
            <input type="number" name="b_id1" placeholder="Enter Batch_id" required=""/><br>
            <input type="text" name="s_id" placeholder="Enter Teacher_Id" required=""/><br>
            <b>Enter The Start Date</b><br>
            <input type="date" name="date" required=""/><br>
            <b>Enter The End Date</b><br>
            <input type="date" name="edate" required=""/><br>
            <input type="submit" value="Add"/>
        </form>
    </body>
</html>
