<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Formularz</title>
</head>
<body>
<form action="productServlet" method="POST" enctype="multipart/form-data">
    <p>Co chcesz zrobic ?</p>
    <select name="action">
        <option value="add">add</option>
        <option value="update">update</option>
        <option value="delete">delete</option>
    </select>
    <input type="submit" value="Wyslij">
</form>
</body>
</html>




