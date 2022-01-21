<%-- 
    Document   : BatchUpdate
    Created on : Dec 28, 2021, 4:32:46 PM
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
        <form action="batchupdateval" method="POST">
            <input type="number" name="bu_id1" placeholder="Enter Batch_id" required=""/><br>
            <input type="text" name="su_id" placeholder="Enter Teacher_Id" required=""/><br>
            <b>Enter The Start Date</b><br>
            <input type="date" name="udate" required=""/><br>
            <b>Enter The End Date</b><br>
            <input type="date" name="eudate" required=""/><br>
            <input type="submit" value="UPDATE"/>
            
        </form>
    </body>
</html>
