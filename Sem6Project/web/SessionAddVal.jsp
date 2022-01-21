<%@page import="sedaoimp.sessionimp"%>
<%@page import="semodel.session"%>
<%
    String s_id, t_id, b_id, time, etime;

    s_id = request.getParameter("s_id");
    b_id = request.getParameter("b_id");
    time = request.getParameter("sdate");
    etime = request.getParameter("edate");
    int b = Integer.parseInt(b_id);

    session se = new session(s_id, b, time, etime);
    sessionimp si = new sessionimp();
    boolean bi = si.addSession(se);

    if (bi) {
        response.sendRedirect("./StudentTable.jsp");
    } else {
    }
%>