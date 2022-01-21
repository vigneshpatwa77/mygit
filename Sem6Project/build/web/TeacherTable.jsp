<%-- 
    Document   : TeacherTable
    Created on : Dec 29, 2021, 1:37:00 PM
    Author     : windows
--%>

<%@page import="tedaoimp.tuserdaoimp"%>
<%@page import="temodel.tuser"%>
<%@page import="stmodel.User"%>
<%@page import="java.util.List"%>
<%@page import="stdaoimp.Userimp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            tuserdaoimp t = new tuserdaoimp();
            List<tuser> tl = t.getAlluser();
            System.out.println(tl.size());
        %>
        <table border="1">
            <thead>
            <th>ID</th> 
            <th>NAME</th>
            <TH>PASSWORD</TH>
            <TH>COURSE</TH>
        </thead>
        <tbody>
            <% for (tuser ti : tl) {
                    System.out.println(ti);
            %>
            <Tr>
                <td>
                    <%=ti.getId()%>
                </td>
                <td>
                    <%=ti.getName()%>
                </td>
                <td>
                    <%=ti.getPassword()%>
                </td>
                <td>
                    <%=ti.getCourse()%>
                </td>
            </TR>
            <% }%> 

        </tbody>

    </table>
            <br><br><a href="Teacherupdate.jsp"><input type="submit" value="Update" /></a>
            <a href="TeacherDelete.jsp"><input type="submit" value="Delete"/></a>
</body>
</html>
