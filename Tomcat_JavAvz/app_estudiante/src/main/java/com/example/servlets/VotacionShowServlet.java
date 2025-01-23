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

@WebServlet("/voto_mostrar")
public class VotacionShowServlet extends HttpServlet {
    private final VotacionController vc = new VotacionController();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        List<Votacion> lista = vc.findAll();

        request.setAttribute("lista", lista);

        request.getRequestDispatcher("votaMostrar.jsp").forward(request, resp);
    }
}
