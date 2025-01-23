package com.example.servlets;

import com.example.controller.VotoController;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/votar")
public class FormularioVotacionServlet  extends HttpServlet {

    private VotoController votoController = new VotoController();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("votarForm.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String candidato = req.getParameter("candidato");


        votoController.create(candidato);

        resp.sendRedirect( req.getContextPath() + "/votacion");

    }

}
