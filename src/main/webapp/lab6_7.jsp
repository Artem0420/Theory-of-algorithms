
<%@page import="TheoryOfAlgorithms.Markichev.Lab6_7.BinaryTreePrinter"%>
<%@page import="TheoryOfAlgorithms.Markichev.Lab6_7.BinaryTree"%>
<%@page import="TheoryOfAlgorithms.Markichev.Lab6_7.Lab6_7_1"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 6-7</title>
    </head>
    <body>
        <a href="index.jsp">Back to landing page</a>
        <%! Lab6_7_1 lab6_7_1 = new Lab6_7_1(211628);%>
        <p>Number 211628<br> Multiply numbers: <%= lab6_7_1.MultiplyNumbers(0, 1)%></p>
        <%! BinaryTree tree = new BinaryTree();%>
        <%
            tree.add(6);
            tree.add(9);
            tree.add(15);
            tree.add(8);
            tree.add(16);
            tree.add(5);
            tree.add(13);
            tree.add(7);
        %>
        <pre>
        <p>Result:<br> <%= BinaryTreePrinter.printNode(tree.getRoot())%></p>
        </pre>
        <%tree.mirrorTree(tree.getRoot()); %>
        <pre>
        <p>Result:<br> <%= BinaryTreePrinter.printNode(tree.getRoot())%></p>
        </pre>
    </body>
</html>
