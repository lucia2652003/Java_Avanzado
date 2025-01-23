## Temas a tratar

En esta clase se abordarán las siguientes temáticas:

- Relaciones entre clases **Java**
- Relaciones en **JPA**
    - @OneToOne
    - @OneToMany
    - @ManyToMany
- **Ejercicio integrador Sistemas Web con JSP + JPA**

---

## Relaciones entre clases Java

En la programación orientada a objetos, las clases se relacionan de varias formas para modelar y organizar el comportamiento y la estructura de un sistema. En Java, estas relaciones se establecen principalmente a través de la herencia, la composición y la asociación mediante diferentes técnicas (Objetos, _Collections_, etc.).

**¡Veamos cada una de ellas!**


### Herencia

Ya conocemos la herencia, donde se permite que una clase adquiera propiedades (campos y métodos) de otra. En Java, se logra mediante la palabra clave `extends`. Una clase que hereda se denomina subclase o clase hija, y la clase de la cual se hereda se llama superclase o clase padre.

**Ejemplo:**

```java
// Superclase
class Vehiculo {
    // Atributos y métodos
}

// Subclase que hereda de Vehiculo
class Coche extends Vehiculo {
    // Atributos y métodos específicos del Coche
}
```


### **Relación 1 a 1**

En una relación 1 a 1, un objeto de una clase está asociado con exactamente un objeto de otra.

**Ejemplo:**

```java
class Persona {
    private String nombre;
    private Direccion direccion;

    // Constructor, getters y setters
}

class Direccion {
    private String calle;
    private String ciudad;
    // Otros atributos de dirección

    // Constructor, getters y setters
}
```

En este caso, la clase `Persona` tiene una única `Direccion`. Cada instancia de `Persona` está asociada con exactamente una instancia de `Direccion`.


### **Relación 1 a n**

En una relación 1 a n, un objeto de una clase está asociado con múltiples objetos de otra clase.

**Ejemplo:**

```java
class Departamento {
    private String nombre;
    // Otros atributos del departamento

    // Constructor, getters y setters
}

class Empleado {
    private String nombre;
    private Departamento departamento;

    // Constructor, getters y setters
}
```

En este caso, la clase `Departamento` puede tener múltiples instancias de la clase `Empleado`, pero cada instancia de `Empleado` está asociada con un único `Departamento`.


### **Relación n a n**

En una relación n a n, múltiples objetos de una clase están asociados con múltiples objetos de otra clase.

**Ejemplo:**

```java
class Estudiante {
    private String nombre;
    // Otros atributos del estudiante

    // Constructor, getters y setters
}

class Curso {
    private String nombre;
    private List<Estudiante> estudiantes;

    public Curso() {
        estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    // Otros métodos para gestionar los estudiantes en el curso
}
```

En este ejemplo, la clase `Curso` tiene una lista de `Estudiante`. Varios estudiantes pueden estar asociados con varios cursos.

Estos son solo ejemplos simples de cómo podrían verse estas relaciones en Java utilizando objetos y colecciones. Dependiendo de las necesidades del sistema, estas relaciones podrían ser más complejas y requerirían una modelización más detallada.

Para ver un ejemplo práctico más a fondo de este tema, te dejamos a continuación un video teórico-práctico:

[![](./resources/relacion-entre-clases-screenshot.png)](https://youtu.be/XKk5k9OrAUg)

---
## Relaciones JPA

En el contexto de JPA (Java Persistence API), las anotaciones `@OneToOne`, `@OneToMany` y `@ManyToMany` se utilizan para mapear las relaciones entre entidades en una base de datos relacional.

**¡Veamos más en detalle cada una de ellas!**
  

### **@OneToOne**

Representa una relación uno a uno entre dos entidades. Por ejemplo:

```java
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @OneToOne(mappedBy = "persona")
    private Direccion direccion;

    // Constructor, getters y setters
}

@Entity
public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String calle;

    @OneToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;

    // Constructor, getters y setters
}
```

En este código vemos dos nuevas cuestiones `mappedBy` y `@JoinColumn`. Veamos ambos conceptos en mayor detalle:

#### mappedBy

`mappedBy` es una propiedad utilizada en JPA para establecer la relación bidireccional entre entidades. Cuando tienes una relación bidireccional entre dos entidades, una de ellas actúa como el propietario de la relación (`owner`) y la otra como el inverso (`inverse`).

Cuando defines una relación bidireccional, JPA necesita saber cuál de las entidades es la propietaria de la relación. La propiedad `mappedBy` se utiliza en la entidad inversa para indicar qué campo en la entidad propietaria está mapeando esta relación.

**Por ejemplo:**

```java
@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @OneToOne(mappedBy = "producto")
    private DetalleProducto detalle;

    // Otros atributos, constructores, getters y setters
}

@Entity
public class DetalleProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;

    @OneToOne
    @JoinColumn(name = "producto_id")
    private Producto producto;

    // Otros atributos, constructores, getters y setters
}
```

En este ejemplo, la entidad `Producto` tiene una relación `@OneToOne` con la entidad `DetalleProducto`, donde cada `Producto` tiene un único `DetalleProducto`. La relación inversa está definida en la entidad `DetalleProducto` con `@OneToOne(mappedBy = "producto")`, indicando que la relación está mapeada por el campo `producto` en la clase `Producto`.

El uso de `mappedBy` evita la duplicación de las columnas de relación en la base de datos y asegura la coherencia de la relación entre las entidades. Es importante tener en cuenta que la propiedad `mappedBy` debe hacer referencia al nombre del campo en la entidad propietaria que establece la relación.

#### @JoinColumn

`@JoinColumn` es una anotación de JPA que se utiliza para especificar la columna en la base de datos que está relacionada con la entidad objetivo en una relación de base de datos.

Esta anotación se usa comúnmente en asociaciones `@ManyToOne` y `@OneToOne` para definir la columna que actúa como clave externa (`foreign key`) en la base de datos.

En el ejemplo anterior de `**Productos`** y `**Detalles`** la anotación `@JoinColumn(name = "producto_id")` en la entidad `DetalleProducto` especifica que la columna de clave foránea se llamará `producto_id`, la cual conecta la tabla de `DetalleProducto` con la de `Producto`, representando la relación uno a uno entre estas entidades.


#### Ejemplo @OneToOne

Veamos un ejemplo práctico de `@OneToOne`

[![](./resources/relacion-one-to-one.png)](https://youtu.be/tWboE7JVCPI)


### @OneToMany

Representa una relación uno a muchos entre dos entidades. Por ejemplo, un departamento tiene muchos empleados.

```java
@Entity
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @OneToMany(mappedBy = "departamento")
    private List<Empleado> empleados;

    // Constructor, getters y setters
}

@Entity
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "departamento_id")
    private Departamento departamento;

    // Constructor, getters y setters
}
```

En `@OneToMany(mappedBy = "departamento")` en la clase `Departamento`, `mappedBy` indica que la relación está mapeada por el campo `departamento` en la clase `Empleado`.

Aquí vemos también el uso de una nueva annotation que es la inversa a @OneToMany, que es `@ManyToOne`.


### @ManyToOne

La anotación `@ManyToOne` se utiliza en la clase `Empleado` para establecer una relación de muchos a uno con la clase `Departamento`. Esto significa que varios empleados pueden pertenecer a un solo departamento. Veamos mayor detalle:

- `@ManyToOne`: Indica que la relación entre `Empleado` y `Departamento` es de muchos a uno. En otras palabras, varios empleados pueden estar asociados con un solo departamento.
    
- `@JoinColumn(name = "departamento_id")`: Especifica la columna de clave foránea (`foreign key`) en la tabla de la entidad `Empleado` que establece la relación con la tabla de la entidad `Departamento`. En este caso, la columna de clave foránea se llamará `departamento_id`.
    

Entonces, en resumen, `@ManyToOne` es el complemento de `**@OneToMany**` para poder definir la Bidireccionalidad de la relación entre ambas clases que luego se va a replicar en la base de datos.

#### Ejemplo de @OneToMany

Veamos un ejemplo práctico de `@OneToMany`

[![](./resources/relacion-one-to-many-screenshot.png)](https://youtu.be/IT7AI5_9K_M)

### @ManyToMany

Representa una relación muchos a muchos entre dos entidades. Por ejemplo, estudiantes que pertenecen a varios cursos y un curso que tiene varios estudiantes.

```java
@Entity
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @ManyToMany(mappedBy = "estudiantes")
    private List<Curso> cursos;

    // Constructor, getters y setters
}

@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @ManyToMany
    @JoinTable(name = "curso_estudiante",
        joinColumns = @JoinColumn(name = "curso_id"),
        inverseJoinColumns = @JoinColumn(name = "estudiante_id")
    )
    private List<Estudiante> estudiantes;

    // Constructor, getters y setters
}
```

En `@ManyToMany(mappedBy = "estudiantes")` en la clase `Estudiante`, `mappedBy` indica que la relación está mapeada por el campo `estudiantes` en la clase `Curso`.

En este caso, se utiliza una nueva _annotation_ llamada `@JoinTable` para configurar la tabla intermedia que maneja la relación entre estudiantes y cursos.


#### @JoinTable

`@JoinTable` es una anotación en JPA que se utiliza para configurar una tabla intermedia para representar relaciones `@ManyToMany` entre entidades.

Cuando tienes una relación `@ManyToMany` entre dos entidades y no deseas que JPA cree automáticamente la tabla intermedia, puedes usar `@JoinTable` para personalizar y controlar la tabla intermedia.

> _💡_**_Recordemos_** _que en bases de datos cuando existe una relación muchos a muchos (many to many) se crea una tabla intermedia que maneja estas relaciones. Esto mismo es lo que representamos mediante el uso de_ `@JoinTable`
