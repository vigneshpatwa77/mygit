<%@page import="tedaoimp.tuserdaoimp"%>
<%@page import="temodel.tuser"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    String pas, id;
    id = request.getParameter("Tid");
    pas = request.getParameter("Tpas");

//        Connection c;
//	PreparedStatement s;
//	ResultSet r;
//	
//	Class.forName("org.h2.Driver");
//	c = DriverManager.getConnection("jdbc:h2:C:\\java\\netbeans","sa","123");
//	s = c.prepareStatement("select * from test where name=? and password=?");
//	s.setString(1, nm);
//        s.setString(2, pas);
//        r = s.executeQuery();
    tuserdaoimp ti = new tuserdaoimp();
    tuser t = ti.getTeacherbyid(id);
    System.out.println(t);
    if (id.equals(t.getId()) && pas.equals(t.getPassword())) {
        
        System.out.println("validate");
        response.sendRedirect("./StudentTable.jsp");
    } else {
        response.sendRedirect("./TeacherLogin.jsp");
        System.out.println("please tell the error");
    }

%>
<%--CREATE TABLE TEST(ID INT PRIMARY KEY,
   NAME VARCHAR(255),
password varchar(25),
course varchar(25 )
);--%>