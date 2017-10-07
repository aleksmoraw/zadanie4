<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Formularz</title>
</head>
<body>
<form action="addProductServlet" method="POST">
    <input type="text" name="productName" placeholder="Nazwa" /><br />
    <input type="text" name="productCount" placeholder="Ilosc" /><br />
    <input type="submit" value="Save" />
</form>
<%--<table>--%>
    <%--<c:forEach items="${allProduct}" var="allProduct">--%>
        <%--<tr>--%>
            <%--<td>${allProduct.id}</td>--%>
            <%--<td>${allProduct.productName}</td>--%>
            <%--<td>${allProduct.productCount}</td>--%>
        <%--</tr>--%>
    <%--</c:forEach>--%>
<%--</table>--%>
<%--<form action="productServlet" method="POST" enctype="multipart/form-data">--%>
    <%--<p>Co chcesz zrobic ?</p>--%>
    <%--<select name="action">--%>
        <%--<option value="add">add</option>--%>
        <%--<option value="update">update</option>--%>
        <%--<option value="delete">delete</option>--%>
    <%--</select>--%>
    <%--<input type="submit" value="Wyslij">--%>
<%--</form>--%>
</body>
</html>




