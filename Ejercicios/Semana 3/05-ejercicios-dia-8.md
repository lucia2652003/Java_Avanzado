## Recursividad

### Ejercicio 1: Exploración de directorios

Crea un programa que simule la exploración recursiva de directorios en el sistema de archivos de un sistema operativo utilizando una **estructura de datos propia**.

Emplea una estructura donde cada nodo representa un directorio y contiene referencias a sus subdirectorios.

El programa debe realizar una exploración simulada para mostrar la jerarquía de directorios y archivos.

**Pistas:**

- Puedes utilizar una clase Directorio para cada una de las carpetas/directorios que contenga como datos: id, nombre, listaSubdirectorios, listaArchivos

```java
class Directorio {
    String nombre;
    List<Directorio> subdirectorios;
    List<String> archivos;

    // Constructor, métodos para agregar subdirectorios y archivos, etc.
}
```

- Puedes utilizar una clase "**ExploradorDirectorios**" con un método "**explorarDirectorio**" que sirva para la recursividad.


### Ejercicio 2: Organizador de tareas

Desarrolla una aplicación para organizar tareas en un proyecto. Utiliza la recursividad para crear una estructura jerárquica de tareas. Cada tarea puede tener subtareas asociadas, y estas subtareas también pueden tener sus propias subtareas, creando así una estructura de "árbol de tareas".

El programa debe permitir al usuario agregar tareas principales y subtareas de manera recursiva. Además, debe ofrecer la capacidad de visualizar la estructura completa de tareas con sus respectivas subtareas.

- 📝**Extra Point (OPCIONAL):** En caso que quieras agregar un poco de "arte" al ejercicio, puedes proponer que las estructuras que se muestren por pantalla sean dibujadas mediante ascii.  
  
**Por ejemplo:**

```java
Proyecto: Desarrollo de Software
|-- Tarea Principal: Diseño de la Aplicación
|   |-- Subtarea: Crear Prototipo
|   |-- Subtarea: Diseñar Interfaz
|   |   |-- Sub-subtarea: Definir Esquema de Colores
|   |   |-- Sub-subtarea: Diseñar Diseño Responsivo
|   |-- Subtarea: Documentar Requisitos
|-- Tarea Principal: Implementación del Código
|   |-- Subtarea: Desarrollar Backend
|   |   |-- Sub-subtarea: Configurar Base de Datos
|   |   |-- Sub-subtarea: Crear Lógica de Negocios
|   |-- Subtarea: Desarrollar Frontend
|   |   |-- Sub-subtarea: Codificar Interfaz de Usuario
|   |   |-- Sub-subtarea: Integrar con Backend
|-- Tarea Principal: Pruebas y Depuración
|   |-- Subtarea: Ejecutar Pruebas de Integración
|   |-- Subtarea: Solucionar Errores
```


### Resoluciones

📌 Recuerda que las resoluciones estarán habilitadas el último día de la semana luego de la revisión en la clase en vivo.

📌 Asegúrate de haber resuelto y subido tus resoluciones propias a tu repositorio antes de que se habiliten las resoluciones semanales.
