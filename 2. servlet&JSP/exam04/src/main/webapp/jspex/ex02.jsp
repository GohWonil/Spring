<%@page contentType="text/html; charset=UTF-8" %>

<%
  //_jspService 지역 내부
    //  1 ) HttpServletRequest = request
    //  2 ) HttpServletResponse = response
    //  3 ) pageContext = pageContext
    //  4 ) HttpSession = session
    //  5 ) ServletContext = application
    //  6 ) ServletConfig = config
    //  7 ) JspWriter = out
    //  8 ) Object page
    //  9 ) Throwable exception : Page 디렉티브 isErrorPage = “true”
  //response.sendRedirect("ex03.jsp");
  out.write("<h1>ex02.jsp");
%>
<%!
  //표현문에서는 내장 객체 접근 불가
%>