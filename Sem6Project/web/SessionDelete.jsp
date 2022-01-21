<%-- 
    Document   : SessionDelete
    Created on : Dec 21, 2021, 8:00:15 PM
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
        <form action="SessionDeleteVal.jsp">
            <input type="text" name="sid" placeholder="Enter Session_id you want to Delete" required=""/><br><br>
            <input type="submit" value="Delete"/>
        </form>
    </body>
</html>
