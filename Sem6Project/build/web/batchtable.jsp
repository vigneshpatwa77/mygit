<%-- 
    Document   : batchtable
    Created on : Jan 17, 2022, 1:47:07 PM
    Author     : windows
--%>

<%@page import="bmodel.batch"%>
<%@page import="java.util.List"%>
<%@page import="bdaoimp.batchimp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            batchimp bi = new batchimp();
            List<batch> bl = bi.getAllBatch();
            System.out.println(bl.size());
        %>
        <table border="1">
            <thead>
            <th>ID</th> 
            <th>NAME</th>
            <TH>START TIME</TH>
            <TH>END TIME</TH>
        </thead>
        <tbody>
            <% for (batch b : bl) {
                    System.out.println(bl);
            %>
            <Tr>
                <td>
                    <%=b.getB_id()%>
                </td>
                <td>
                    <%=b.getS_id()%>
                </td>
                <td>
                    <%=b.getTime()%>
                </td>
                <td>
                    <%=b.getEntime()%>
                </td>
            </TR>
            <% }%> 

        </tbody>

    </table>
    <br><br><a href="Teacherupdate.jsp"><input type="submit" value="Update" /></a>
    <a href="TeacherDelete.jsp"><input type="submit" value="Delete"/></a>
</body>
</html>
