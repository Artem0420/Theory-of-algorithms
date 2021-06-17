
<%@page import="markichev.IR11.Exam.DoFunc"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exem Page Page</title>
    </head>
    <body>
        <%! DoFunc mygen = new DoFunc(70);%>

        <div style="display: block">
            Сгенерить 70 случайных чисел: <%= mygen.getmyFunNumbers()%> 
        </div>
        <br>
        <div style="display: block">
            Результат: <%= mygen.DoCalculate()%>
        </div>


    </body>
</html>
