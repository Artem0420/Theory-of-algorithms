<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 2</title>
    </head>
    <body>
        <a href="index.jsp">Back to landing page</a>
        <h1>Lab 2</h1>
        <form action="./lab2" method="post">
            <label for="x">Please, enter number:</label>
            <div class="input-group">
                <input  class="form-control" id="x" type="text" name="x" placeholder="##.###"/>
                <input class="btn btn-success" type="submit" value="Submit"/>
            </div>
            <p class="mt-3 mb-0">Result: <%=request.getAttribute("result")%></p>
        </form>
    </body>
</html>
