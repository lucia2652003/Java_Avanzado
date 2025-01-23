<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%-- Importar las clases --%>
<%@ page import="java.util.List, com.example.entities.Persona, com.example.entities.Producto, com.example.entities.Tarjeta" %>

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
                
                <li><b>Persona:</b> <%= persona.getNombre() %>, <%= persona.getApellido() %>,
                <br>
                <b>Productos:</b>
                    
                    <% for(Producto producto: persona.getProductos()) {   %>

                         <i> <%= producto.getNombre() %> </i>

                    <% } %>

                    <br>

                    <% for(Tarjeta tarjeta: persona.getTarjetas()) {   %>

                          <i><b>Tarjetas:</b> = <%= tarjeta.getId() %>) <%= tarjeta.getTipo() %>, </i>

                    <% } %>
                </li>
                 <br>
                 <hr>

          <% } %>       
    </ul>

    
</body>
</html>