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

/*localhost:8080/app/persona*/

@WebServlet(urlPatterns = "/persona")
public class PersonaServlet extends HttpServlet {

    private PersonaController personaController = new PersonaController();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Persona> listado = personaController.findAll();

        /*Enviar info al jsp*/
        req.setAttribute("listado", listado);
        req.setAttribute("nombre", "Brian");

        req.getRequestDispatcher("persona.jsp").forward(req, resp);



    }
}
