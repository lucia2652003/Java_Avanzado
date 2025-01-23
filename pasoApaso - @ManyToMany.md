# Paso a Paso: Crear una Relaciones con JPA e Imprimir en JSP

## 1. Muchos a Muchos -  Modificar las entidades

### Entidad `Persona` - Crear getters y setter de los nuevos atributos.

```java
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String apellido;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "persona_producto",
        joinColumns = @JoinColumn(name = "persona_id"),
        inverseJoinColumns = @JoinColumn(name = "producto_id")
    )
    private Set<Producto> productos = new HashSet<>();

    // Getters y Setters
    public Set<Producto> getProductos() {
        return productos;
    }

    public void setProductos(Set<Producto> productos) {
        this.productos = productos;
    }
}
```

### Entidad `Producto` - Crear getters y setter de los nuevos atributos.

```java

@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private Double precio;

    @ManyToMany(mappedBy = "productos", fetch = FetchType.EAGER)
    private Set<Persona> personas = new HashSet<>();

    // Getters y Setters
    public Set<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(Set<Persona> personas) {
        this.personas = personas;
    }
}
```



## 2. En el Servlet ver si llega la info con los Break Points

```java

 @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Persona> listado = personaController.findAll();


        listado.forEach(persona -> persona.getProductos()
                    .forEach(producto -> System.out.println(persona.getNombre() + " tiene un producto llamado: " + producto.getNombre())));

    }
```



## 3. Mostrarlos en la Vista JSP- Asegurate de importar la clase Productos

### Archivo `personas.jsp` 

```jsp
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%-- Importar las clases --%>
<%@ page import="java.util.List, com.example.entities.Persona, com.example.entities.Producto" %>

<ul>
        <% List<Persona> listado = (List<Persona>) request.getAttribute("listado");

            
            for(Persona persona: listado) { %>
                
                <li>Persona: <%= persona.getNombre() %>, <%= persona.getApellido() %>, Productos: 

                        <% for (Producto producto : persona.getProductos()) { %>
                                    <%= producto.getNombre() %>, 
                        <% } %>
                </li>
            <% } %>  
            
</ul>
```

## 4. Ejecutar y Probar

1. Ejecuta el proyecto.
2. Accede a `http://localhost:8080/app/personas` en tu navegador.
3. Verifica que se muestre la lista de personas y sus productos relacionados.

¡Listo! Ahora tienes una relación de muchos a muchos implementada con JPA e impresa en una vista JSP.

