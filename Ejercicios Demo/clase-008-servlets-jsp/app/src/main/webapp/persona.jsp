<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%-- Importar las clases --%>
<%@ page import="java.util.List, com.example.entities.Persona" %>

<!DOCTYPE html>
<html lang="en">
    <%@ include file="partials/head.jsp" %>
<body>

    <%@ include file="partials/header.jsp" %>

    <h1>Personas Listado</h1>

    <p>Mensaje: <%= request.getAttribute("nombre") %></p>

    <ul>

        <% List<Persona> listado = (List<Persona>) request.getAttribute("listado");
            
            for(Persona persona: listado) { %>
                
                <li>Persona: <%= persona.getNombre() %>, <%= persona.getApellido() %></li>

          <% } %>       
    </ul>

    
</body>
</html>