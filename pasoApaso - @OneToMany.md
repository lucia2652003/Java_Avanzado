# Paso a Paso: Crear una Relaciones con JPA e Imprimir en JSP

## 1. Uno a Muchos -  Modificar las entidades

### Entidad `Persona` - Crear getters y setter de los nuevos atributos.

```java
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String apellido;

    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<Tarjeta> tarjetas;

    // Getters y Setters
    public Set<Tarjeta> getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(Set<Tarjeta> tarjetas) {
        this.tarjetas = tarjetas;
    }
}
```


### Entidad `Tarjeta` - Crear cosntructores, getters y setter de los nuevos atributos.

```java
@Entity
public class Tarjeta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoTarjeta tipo;

    /*todo: Nuevo*/
    @ManyToOne
    @JoinColumn(name = "persona_id", nullable = false)
    private Persona persona;

    //Constructor
      public Tarjeta() {
    }

    // Getters y Setters
    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
```

## 2. En el Servlet ver si llega la info con los Break Points

```java

 @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Persona> listado = personaController.findAll();


        listado.forEach(persona -> persona.getTarjetas()
                .forEach(tarjeta -> System.out.println(persona.getNombre() + " tiene una tarjeta de tipo: " + tarjeta.getTipo())));

    }
```

## 3. Mostrarlos en la Vista JSP- Asegurate de importar la clase Tarjeta

### Archivo `personas.jsp` 

```jsp
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%-- Importar las clases --%>
<%@ page import="java.util.List, com.example.entities.Persona, com.example.entities.Producto, , com.example.entities.Tarjeta" %>

<ul>
        <% List<Persona> listado = (List<Persona>) request.getAttribute("listado");

            
            for(Persona persona: listado) { %>
                
                <li>Persona: <%= persona.getNombre() %>, <%= persona.getApellido() %>, Productos: 

                         <% for (Tarjeta tarjeta : persona.getTarjetas()) { %>
                                               <span class="tarjetas"> <%= tarjeta.getTipo() %>, </span>
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
