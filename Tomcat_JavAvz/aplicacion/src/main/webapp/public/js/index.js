

function saludar() {
    //Si no escribe en el input, le avisará
    if(document.getElementById("nombre").value == "") alert("Lo siento, por favor vuelve a introducirlo");
    else alert("Encantada de conocerte "+document.getElementById("nombre").value);

} 
