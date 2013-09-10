<%-- 
    Document   : page2
    Created on : Sep 9, 2013, 6:39:51 PM
    Author     : ncummins
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Challenge 1 - Results Page</title>
    </head>
    <body>
        <%
            Object answer = request.getAttribute("answer");
            String strAnswer = answer.toString();
            out.println(strAnswer);
        %>
    </body>
</html>
