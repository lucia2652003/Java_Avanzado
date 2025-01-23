package com.example.servlets;

import com.example.controller.VotoController;
import com.example.entities.VotosRespuesta;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/votacion")
public class VotacionServlet extends HttpServlet {

    private VotoController votoController = new VotoController();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       List<VotosRespuesta> listado =  votoController.findAll();

        req.setAttribute("listado", listado);

        req.getRequestDispatcher("votacion.jsp").forward(req, resp);
    }

}
