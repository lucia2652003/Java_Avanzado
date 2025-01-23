<!DOCTYPE html>
<html lang="en">
    <%@ include file="partials/head.jsp" %>
<body>
    <%@ include file="partials/header.jsp" %>
    
    <form action="/app_bd/personaForm" method="post">
        Nombre: <input type="text" name="nombre" id="nombre" placeholder="Ingrese nombre">
        <br><br>
        Apellido: <input type="text" name="apellido" id="apellido" placeholder="Ingrese apellido">
        <br><br>
        <input type="submit" name="Enviar">
    </form>
</body>
</html>