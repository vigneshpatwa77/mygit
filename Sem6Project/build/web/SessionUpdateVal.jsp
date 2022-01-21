<%@page import="sedaoimp.sessionimp"%>
<%@page import="semodel.session"%>
<%
String csid = request.getParameter("csid");
        String cstid = request.getParameter("cstid");
        String csbid = request.getParameter("csbid");
        int b = Integer.parseInt(csbid);

        sessionimp si = new sessionimp();
        session se = si.getSessionByid(csid);
        System.out.println();
        se.setB_id(b);
        boolean bi = si.UpdateSession(se);
        if (bi) {
            response.sendRedirect("./StudentTable.jsp");
        } else {
            System.out.println("failed");
        }
%>