<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List"%>
<%@page import="stdaoimp.Userimp"%>
<%@page import="stmodel.User"%>
<%@page import="java.sql.*"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
       isELIgnored="false"  pageEncoding="ISO-8859-1"%>
<html>
    <head>

    </head>
    <body>
        <%

            Userimp ui = new Userimp();
            List<User> ul = ui.getAllluser();
            System.out.println(ul.size());
        %>

        <table border="1">
            <thead>
            <th>ID</th> 
            <th>NAME</th>
            <TH>SESSION_ID</TH>
        </thead>
        <tbody>
           <% for (User u : ul) {
           System.out.println(u);
           %>
            <Tr>
                <td>
                   <%=u.getId()%>
                </td>
                <td>
                    <%=u.getName()%>
                </td>
                <td>
                    <%=u.getSessionid()%>
                </td>
            </TR>
            <% }%> 
           
    </tbody>

</table>
<br><br><a href="StudentUpdate.jsp"><input type="submit" value="Update" /></a>
<a href="StudentDelete.jsp"><input type="submit" value="Delete"/></a>
</body>
</html>