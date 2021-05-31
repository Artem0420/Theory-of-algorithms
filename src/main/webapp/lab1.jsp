
<%@page import="TheoryOfAlgorithms.Markichev.Lab1.Lab1"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 1</title>
    </head>
    <body>
         <a href="index.jsp">Back to landing page</a>
        <h1>Lab 1</h1>
        <%! int number = 36; %>
        <%! Lab1 lab1 = new Lab1(number);%>        
        <p>Number = <%= lab1.getNumber() %> </p> 
        <%! int add = 16; %>
        <p><%= lab1.getNumber() %> + <%= add %> = <%= lab1.Plus(add) %> </p> 
        <%! int minus = 10; %>
        <p><%= lab1.getNumber() %> - <%= minus %> = <%= lab1.Minus(minus) %> </p> 
        <%! int multiply = 3; %>
        <p><%= lab1.getNumber() %> * <%= multiply %> = <%= lab1.Multiply(multiply) %> </p> 
        <%! int divide = 2; %>
        <p><%= lab1.getNumber() %> / <%= divide %> = <%= lab1.Divide(divide) %> </p> 
    </body>
</html>
