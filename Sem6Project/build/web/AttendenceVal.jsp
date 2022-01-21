<%
    String STUDENT_ID, SESSION_ID, status, date;
    STUDENT_ID = request.getParameter("STUDENT_ID");
    SESSION_ID = request.getParameter("SESSION_ID");
    status = request.getParameter("status");
    date = request.getParameter("date");


    if (b) {
        response.sendRedirect("./Attendence.jsp");
    } else {
        System.out.println("Failed");
    }
%>