package com.example.servlets;

import com.example.controller.VotacionController;
import com.example.entities.Votacion;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/votacion")
public class VotacionFormServlet extends HttpServlet {

    private final VotacionController vc = new VotacionController();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        request.getRequestDispatcher("vota.jsp").forward(request, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String votar = req.getParameter("voto");
       vc.create(votar);
       resp.sendRedirect(req.getContextPath()+"/votacion");
    }
}
