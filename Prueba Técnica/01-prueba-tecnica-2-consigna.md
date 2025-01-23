### **Desarrollo de una aplicación de gestión de turnos**

El objetivo de esta prueba es evaluar tus conocimientos en Java y Java Web, incluyendo sintaxis, estructuras repetitivas, estructuras selectivas, manejo de colecciones y operaciones CRUD (Crear, Leer, Actualizar y Borrar) utilizando JPA (Java Persistence API) para interactuar con una base de datos, JSP para interactuar con el usuario y programación funcional como complemento.


### **Descripción del caso**

Una entidad gubernamental necesita del desarrollo de un "turnero" (aplicación de gestión de turnos), donde se puedan almacenar en una base de datos turnos para diferentes trámites y ciudadanos asignados a los mismos.

Los turnos son numéricos y se asignan según orden de llegada. Al mismo tiempo, poseen un estado, el cual puede ser "En espera" o "Ya atendido" que debe poder ser cambiado/modificado según corresponda.

Debes desarrollar el backend lógico para ésta aplicación. La aplicación debe permitir a los usuarios realizar las siguientes operaciones:

1. **Agregar un nuevo turno:** Los usuarios deben poder ingresar información sobre un nuevo turno, incluyendo número, fecha y descripción del trámite a realizar. Al mismo tiempo cada turno tendrá un ciudadano asignado. Un turno es EXCLUSIVO de un ciudadano, sin embargo, un ciudadano puede sacar más de un turno en diferentes ocasiones.
    
2. **Listar turnos:** La aplicación debe permitir la visualización de la lista de todos los turnos junto con los ciudadanos asignados a los mismos, en base a una fecha brindada por el usuario. Se sugiere el uso de una tabla, para mejor distribución de los datos.
    
3. **Filtrado de turnos:** El usuario debe poder seleccionar si quiere ver los turnos "En Espera" (que son aquellos que aún no han sido atendidos) o los "Ya atendidos". Siempre teniendo como filtro principal antes que esto la fecha. Es decir, se deberá filtrar por la fecha indicada por el usuario + el estado del turno.
    

### **Requisitos técnicos**

1. Utiliza **Java + Servlets** para el desarrollo backend de la aplicación.
    
2. Utiliza **JSP** como tecnología para el manejo del **frontend con Java**. Siéntete libre de utilizar plantillas (gratuitas y sin copyright por supuesto), Bootstrap o lo que consideres necesario.
    
3. La aplicación debe utilizar **JPA** para acceder a la **base de datos**. Asegúrate de configurar una fuente de datos y las entidades/tablas con sus correspondientes atributos y relaciones entre sí.
    
4. Utiliza **colecciones** y **objetos** para gestionar los datos antes de interactuar con la base de datos.
    
5. Utiliza **POR LO MENOS** una vez en el código **funciones lambda, optionals, utils o streams**. A mayor cantidad de usos, mejor consideración habrá respecto al nivel y optimización del código desarrollado 😉.
    

### **EXTRA**

Todo extra que desee ser agregado por cada desarrollador será considerado de muy buena manera siempre y cuando cumpla con el escenario propuesto.


### **Entregables**

- **Código fuente** de la aplicación en un repositorio de control de versiones (GitHub).
    
    - Utilizar como formato de **nombre del repositori**o la siguiente combinación: apellido+nombre+_pruebatec2. Ej: **dePaulaLuisina_pruebatec2**
        
- Un informe o documentación breve que describa cómo ejecutar y probar la aplicación. En caso de que algunos requerimientos no estén claros en la presente documentación, se permite el uso de SUPUESTOS. Esto puede ser incluido en el archivo **README** de **GitHub**.
    
- Fecha de entrega máxima **Jueves dd/mm/yyyy** hasta las **xx:xx hs**

