<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AddProduct</title>
</head>
<body>
<h2>DODAJ PRODUKT</h2>
<form action="AddProductServlet" method="POST">
    Nazwa produktu:
    <input type="text" name="productName"><br>
    Ilosc:
    <input type="text" name="productCount"><br>
    <input type="submit" value="Wyślij">
</form>
</body>
</html>

