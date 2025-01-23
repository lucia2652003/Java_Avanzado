<%-- Configurar metadatos--%>
<%@ page  contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%-- Importar clases --%>
<%@ page import="java.util.List, com.example.entities.Votacion" %>
 
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="./public/css/style.css">
</head>
<body>
    <h1>Conteo de votaciones</h1>
    <ul>
        <% List<Votacion> lista = (List<Votacion>) request.getAttribute("lista");
          for( Votacion voto : lista ) { %>
                        <li>Partido: <%= voto.getValor() %> : <%= voto.getId() %></li>
        <% } %>
    </ul>
</body>
</html>