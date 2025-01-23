<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%-- Importar las clases --%>
<%@ page import="java.util.List, com.example.entities.VotosRespuesta" %>

<!DOCTYPE html>
<html lang="en">
<body>


    <h1>Votaciones Listado  <a  href="/app/votar" aria-label="Ir a Votar">Ir a Votar</a></h1>

    <p>Mensaje: </p>

    <ul>

            <% List<VotosRespuesta> listado = (List<VotosRespuesta>) request.getAttribute("listado");

                for(VotosRespuesta votos: listado) { %>

                    <li>Candidato <%= votos.getCandidato() %> = (<%= votos.getVotos() %>)</li>

              <% } %>
        </ul>



</body>
</html>