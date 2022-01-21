<%@page import="bmodel.batch"%>
<%@page import="bdaoimp.batchimp"%>
<%
    String b_id1, s_id, time, edate;
    b_id1 = request.getParameter("b_id1");
    s_id = request.getParameter("s_id");
    time = request.getParameter("date");
    edate = request.getParameter("edate");

    batchimp bi = new batchimp();
    batch b = new batch(b_id1, s_id, time, edate);
    boolean s = bi.addBatch(b);
    if (s) {
        response.sendRedirect("./StudentTable.jsp");
    } else {
        System.out.println("failed");
    }
%>