<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>Document</title>
    <link rel="stylesheet" href="./public/css/style.css">
</head>
<body>
    <h1>Votaci&oacute;n</h1>
    
    <form action="/grupo_estudiante/votacion" method="post">
       <p>Elija su voto:</p>
       <label for="voto"><input type="radio" value="A" name="voto" id="voto"> Partido A</label>  
       <br>
       <label for="voto"><input type="radio" value="B" name="voto" id="voto"> Partido B</label>  
       <br>
       <label for="voto"><input type="radio" value="C" name="voto" id="voto"> Partido C</label>  
       <br><br>
       <button type="submit" class="votar">Votar</button>
       <br><br>  
    </form>

    <form action="/grupo_estudiante/voto_mostrar" method="get">
      <button class="mostrar">Mostrar resultados</button>
    </form>
</body>
</html>