<%-- 
    Document   : SessionUpdate
    Created on : Dec 22, 2021, 1:38:31 PM
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
        <form action="SessionUpdateVal.jsp">
            <input type="text" name="csid" placeholder="Enter Session_Id" required=""/><br><br>
            <input type="number" name="csbid" placeholder="Enter the change Batch_Id" required=""/><br><br>
            <input type="submit" title="update"/>
        </form>
    </body>
</html>
