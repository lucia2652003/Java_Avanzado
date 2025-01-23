<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%-- Importar las clases --%>
<%@ page import="java.util.List, com.example.entities.Persona, com.example.entities.Producto, com.example.entities.Tarjeta" %>
<!DOCTYPE html>
<html lang="en">
    <%@ include file="partials/head.jsp" %>
<body>

    <%@ include file="partials/header.jsp" %>

    <br><br>
    <form action="/app/tarjetaForm" method="post">

            <label for="opciones">Selecciona una opción:</label> <br>
            <select id="opciones" name="personaId" required>
                <option value="" disabled selected>-- Selecciona una opción --</option>
                    <% List<Persona> listado = (List<Persona>) request.getAttribute("listado");

                        for(Persona persona: listado) { %>
                            <option value="<%= persona.getId() %>"><%= persona.getNombre() %> <%= persona.getApellido() %></option>
                    <% } %>
            </select>

        <br><br>

        <select id="opciones" name="tipo" required>
                    <option value="CREDITO" selected>-- Tarjeta de Credito --</option>
                    <option value="DEBITO">-- Tarjeta de Debito --</option>
                </select>

        <br><br>

        <button type="submit">Guardar Persona</button>

    </form>


    
</body>
</html>