package com.example.servlets;

import com.example.controllers.PersonaController;
import com.example.controllers.TarjetaController;
import com.example.entities.Persona;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/tarjetaForm")
public class TarjetaFormServlet extends HttpServlet {

    private TarjetaController tarjetaController = new TarjetaController();
    private PersonaController personaController = new PersonaController();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Persona> listado = personaController.findAll();
        req.setAttribute("listado", listado);
        req.getRequestDispatcher("tarjetaForm.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*Datos del formulario*/
        String tipo = req.getParameter("tipo");
        Long personaId = Long.valueOf(req.getParameter("personaId"));

        /*Crear un objeto prsona para guardar*/
        Persona personaCreada = new Persona();
        personaCreada.setId(personaId);

        /*guardar en la tabla tarjeta*/
        tarjetaController.create(tipo, personaCreada);

        /*redirigir a el listado de Personas*/
        resp.sendRedirect( req.getContextPath() + "/persona");

    }
}
