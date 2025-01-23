package com.example.servlets;

import com.example.controllers.PersonaController;
import com.example.entities.Persona;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/persona")
public class PersonaServlet extends HttpServlet {

    private PersonaController pc = new PersonaController();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Persona> listado = pc.findAll();
        listado.forEach(persona -> persona.getProductos()
                .forEach(producto -> System.out.println(persona.getNombre() + " tiene un producto llamado: " + producto.getNombre())));
        listado.forEach(persona -> persona.getTarjetas()
                .forEach(tarjeta -> System.out.println(persona.getNombre() + " tiene una tarjeta de tipo: " + tarjeta.getTipo())));

        /*Enviar información*/
        request.setAttribute("listado", listado);
        request.setAttribute("nom", "Lucia");

        //Redirigirlo a una vista JSP
        request.getRequestDispatcher("persona.jsp").forward(request,response);
    }
}
