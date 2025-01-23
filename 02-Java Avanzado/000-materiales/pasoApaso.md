# Crear una Página Web con Servlet y JSP usando Jakarta EE y Tomcat 🚀

Este tutorial te guiará paso a paso para crear una pequeña página web con un índice que muestra "Sí" usando Jakarta EE, Tomcat y JSP. 👨‍💻

---

## 🛠️ Requisitos Previos
1. **JDK**: Instala JDK 11 o superior.
2. **Apache Tomcat**: Descarga e instala Tomcat (versión compatible con Jakarta EE).
3. **IDE**: Usa un IDE como IntelliJ IDEA, Eclipse o VS Code.
4. **Maven**: Configura Maven para manejar dependencias.

---

## 1️⃣ Instalar Apache Tomcat 🐈

1. **Descargar Tomcat**:
   - Descarga la versión  **Tomcat 10.x**: [Tomcat 10.1.34.zip](https://dlcdn.apache.org/tomcat/tomcat-10/v10.1.34/bin/apache-tomcat-10.1.34-windows-x64.zip).


2. **Instalar Tomcat**:
   - Extrae el archivo descargado en una ubicación de tu elección. En su interior tiene una carpeta llamada **/apache-tomcat-10.1.34** ***NOTA: Recuerda muy bien donde la guardas.***
   - recomendación: te recomendamos cortar esta carpeta y guardarla en C:\jakarta9 (crea la carpeta)

3. **Probar la Instalación**:
   - Abre al directorio `bin` de Tomcat.
   - Doble click el archivo llamado **startup.bat**.

   - Abre tu navegador y visita `http://localhost:8080`. Si ves la página de bienvenida de Tomcat, ¡la instalación fue exitosa! 🎉
    - Doble click el archivo llamado **shutdown.bat**.

---

## 2️⃣ Crear el Proyecto Maven con Tomcat
1. Abre tu IDE y crea un nuevo proyecto Maven Archetype.
2. Usa las siguientes configuraciones:
   - **Name**: `app`
   - **Localización**: `Donde Quieras`
   - **Catalog**: `internal`
   - **Archetype**: `escribimos web y seleccionamos la que aparece`
3. Espera que cargue todo.
4. Ir a File > Settings > Plugins
5. Buscar en el marketplace **Smart Tomcat**
6. Aplly y OK. Cerramos la ventano de settings
7. Ir a File > Settings > Tomcat Server > (+) 
8. Seleccionamos la ruta donde guardamos la carpeta **/apache-tomcat-10.1.34**.
9. Aplly y OK. Cerramos la ventana de settings
10. Click en el `pom.xml` y luego en RUN, nos aparece un formulario de configuración. 
11. Seleccione en USE CLASSPATH OF MODULE: **app**
12. Aplly y RUN.
13. En la terminal aparecerá un link [http://localhost:8080/app](http://localhost:8080/app). Deberás ver tu JSP.
14. Detenemos la App
14. Configura el archivo `pom.xml`:

```xml
        <!-- Jakarta Servlet API -->
        <dependency>
            <groupId>jakarta.servlet</groupId>
            <artifactId>jakarta.servlet-api</artifactId>
            <version>5.0.0</version>
            <scope>provided</scope>
        </dependency>


```

---

## 3️⃣ Configurar el Directorio del Proyecto 🗂️
Estructura básica del proyecto:
```
app/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/ejemplo/
│   │   │       └── IndexServlet.java
│   │   ├── webapp/
│   │       ├── index.jsp
│   │       └── WEB-INF/
│   │           └── web.xml
├── pom.xml
```

---

## 4️⃣ Crear un Servlet para la ruta /test🎛️
1. Crea el archivo `IndexServlet.java` en `src/main/java/com/ejemplo/`.
2. Añade el siguiente código:

```java
package com.ejemplo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/test")
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Redirigir a la vista JSP
        request.getRequestDispatcher("test.jsp").forward(request, response);
    }
}
```

---

## 5️⃣ Crear la Vista test.jsp 🌐
1. Crea el archivo `test.jsp` en `src/main/webapp/`.
2. Añade el siguiente contenido:

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Pagina Test</title>
</head>
<body>
    <h1>Nueva ruta test</h1>
</body>
</html>
```

---

## 6️⃣ Configurar `web.xml` 📄
1. Ir el archivo `web.xml` en `src/main/webapp/WEB-INF/`.
2. Configura el descriptor de despliegue:

```xml
<!DOCTYPE web-app PUBLIC
 "-//Sun Microsystems, Inc.//DTD Web Application 2.3//EN"
 "http://java.sun.com/dtd/web-app_2_3.dtd" >

<web-app>
  <display-name>Archetype Created Web Application</display-name>
  <servlet>
    <servlet-name>IndexServlet</servlet-name>               //Nombre que le damos al Servlet
    <servlet-class>org.example.IndexServlet</servlet-class> //ubicacion del servlet
  </servlet>

</web-app>
```

---

## 7️⃣ Levanta la App con el Tomcat 🖥️
---
1. Ir a Run y ejecutar.

2. Abre la página [http://localhost:8080/app/test](http://localhost:8080/app/test).

Has creado una página web básica con un Servlet, JSP y Tomcat. ¡Felicidades! 🎉

## 🥳 ¡Listo!