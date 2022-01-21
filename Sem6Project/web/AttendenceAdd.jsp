<%-- 
    Document   : AttendenceAdd
    Created on : Dec 11, 2021, 10:08:43 PM
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
        <form action="AttendenceVal.jsp">
            <input type="text" name="STUDENT_ID" placeholder=" Enter STUDENT_ID" required=""/><br>
            <input type="text" name="SESSION_ID" placeholder="Enter SESSION_ID" required=""/><br>
            <b>Attendence :</b><br> 
            <b>Present</b> <input type="radio" name="status" value="1" checked="checked"  />
            <b>Absent</b> <input type="radio" name="status" value="0"  />
            <br>
            <b>Date :</b><br>
            <input type="date" name="date" required=""/><br>
            <input type="submit" value="Add Attendence"/>
        </form>
    </body>
</html>

