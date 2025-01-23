✅ A continuación encontrarás las resoluciones de los ejercicios de la segunda semana del módulo de Java Avanzado.  

✅ Recuerda que cualquier duda o consulta puedes realizarla mediante el formulario de soporte.


## Java Avanzado: Clase 2 - Día 3

### Ejercicio Nº 1 - Reserva de vuelos - Individual

Imagina que estás desarrollando un sistema de reservas de vuelos para una aerolínea. Los usuarios pueden realizar reservas de vuelos proporcionando información como su nombre, destino, fecha de viaje y número de asientos deseados. Tu tarea es implementar una función de reserva de vuelos que valide los datos ingresados y maneje excepciones si los datos son incorrectos o si no hay suficientes asientos disponibles en el vuelo.

Debes crear una excepción personalizada, por ejemplo, ReservaInvalidaException, que se lance en situaciones excepcionales, como cuando un usuario intenta reservar más asientos de los disponibles o si falta información esencial. La excepción personalizada debe proporcionar un mensaje claro sobre la causa del error.


### Resolución

[Descargar Resolución](./resources/3-VuelosExcepciones.zip)



### Ejercicio Nº 2 - Manejo de inventarios en un comercio - Individual

Imagina que estás desarrollando un sistema de gestión de inventarios para un comercio minorista. Los usuarios pueden agregar productos al inventario proporcionando información como el nombre del producto, el precio y la cantidad disponible. Tu tarea es implementar una función que maneje la gestión de inventarios, validando los datos ingresados y manejando excepciones en caso de errores o datos inválidos.

Trata de ser lo más descriptivo posible en cada mensaje de excepción (en caso de que ésta sea personalizada) o de utilizar los tipos correctos de excepción en cada caso.


### Resolución

[Descargar Resolución](./resources/4-InventarioComercioExcepciones.zip)


### Ejercicio Nº 3 - Vectores y excepciones - Individual

Estás desarrollando una aplicación de gestión de datos en la que puedes almacenar información en un vector y acceder a ella posteriormente. Tu tarea es implementar una función que te permita almacenar datos en un vector y manejar excepciones estándar de Java teniendo en cuenta lo siguiente:

Desarrolla una función que te permita almacenar datos en un vector. Puedes utilizar un vector de tamaño fijo para simplificar el ejercicio.

Luego, implementa un mecanismo que te permita acceder a los datos almacenados en el vector proporcionando un índice.

Utiliza una excepción estándar de Java que, al intentar acceder a una posición que no existe en el vector, por ejemplo, un índice que esté fuera del rango del vector se pueda capturar.

Captura la excepción y proporciona un mensaje de error descriptivo que indique que estás intentando acceder a una posición inválida en el vector.


### Resolución

[Descargar Resolución](./resources/5-DataManagerExcepciones.zip)

---

## Java Avanzado: Clase 2 - Día 3

### Ejercicio Nº 1 - Simulación de un centro de atención al cliente

• Crea una simulación de un centro de atención al cliente en la que varios agentes de soporte pueden atender llamadas telefónicas concurrentemente. • Cada agente se representa como un hilo independiente. • Los agentes deben recibir llamadas de clientes, resolver consultas y registrar información sobre cada llamada. Utiliza hilos para simular la atención concurrente de múltiples llamadas y garantizar que los agentes puedan manejarlas de manera eficiente. • Asegúrate de controlar la concurrencia para evitar conflictos en la asignación de llamadas a los agentes.

### Resolución

[Descargar Resolución](./resources/6-CentroAtencionClienteHilos.zip)


### Ejercicio Nº 2 - Simulación de cadena de producción

- Crea una simulación de una cadena de producción en una fábrica en la que varios trabajadores pueden realizar tareas concurrentemente.

- Cada trabajador se representa como un hilo independiente.
  
- Los trabajadores deben llevar a cabo tareas como ensamblar productos, realizar controles de calidad y embalar productos.
  
- Utiliza hilos para simular la ejecución concurrente de estas tareas en diferentes estaciones de trabajo de la fábrica.
  
- Asegúrate de controlar la concurrencia para evitar problemas como la sobreproducción o la falta de coordinación entre las tareas.


### Resolución

[Descargar Resolución](./resources/7-LineaProduccionHilos.zip)

