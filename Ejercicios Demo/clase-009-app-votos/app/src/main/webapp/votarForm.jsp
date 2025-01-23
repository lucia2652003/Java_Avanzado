<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<body>

    <h1>Vote por un candidato - <a  href="/app/votacion" aria-label="Ir a La Votación">Votación</a></h1>

<hr>

    <form action="/app/votar" method="post">

        <label>
                    <input type="radio" id="candidatoA" name="candidato" value="A"> Candidato A
        </label><br>

        <label>
                    <input type="radio" id="candidatoB" name="candidato" value="B"> Candidato B
        </label><br>

        <label>
            <input type="radio" id="candidatoC" name="candidato" value="C"> Candidato C
        </label><br><br>


        <button type="submit">Guardar mi Voto</button>

    </form>

    <a  href="/app/votacion" aria-label="Ir a La Votación">Votación</a>



</body>
</html>