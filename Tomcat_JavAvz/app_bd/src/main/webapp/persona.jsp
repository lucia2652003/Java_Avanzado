<%-- Configurar metadatos--%>
<%@ page  contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%-- Importar clases --%>
<%@ page import="java.util.List, com.example.entities.Persona, com.example.entities.Producto, com.example.entities.Tarjeta"%>

<!DOCTYPE html>
<html lang="en">
    <%@ include file="partials/head.jsp" %>
    <body>
        <%@ include file="partials/header.jsp" %>
        <h1>Listados Personas</h1>
       
       <ul>
               <% List<Persona> listado = (List<Persona>) request.getAttribute("listado");


                   for(Persona persona: listado) { %>

                       <li>Persona: <%= persona.getNombre() %> <%= persona.getApellido() %>, Productos:
                                <% for (Producto producto : persona.getProductos()) { %>
                                                      <i> <%= producto.getNombre() %> </i>,
                                <% } %>Tarjetas:
                                <% for (Tarjeta tarjeta : persona.getTarjetas()) { %>
                                                      <strong> <%= tarjeta.getTipo() %>, </strong>
                                <% } %>
                       </li>
                   <% } %>

       </ul>
    </body>
</html>