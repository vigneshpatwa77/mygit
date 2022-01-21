<%@page import="semodel.session"%>
<%@page import="sedaoimp.sessionimp"%>
<%
     String sid = request.getParameter("sid");
     sessionimp si = new sessionimp();
    session se = si.getSessionByid(sid);
    System.out.println(si);
    boolean b = si.DeleteSession(se);
    if(b){
       response.sendRedirect("./StudentTable.jsp");
    }else{
        System.out.println("failed");
    }
    
%>