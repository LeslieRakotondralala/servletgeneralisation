package etu001920.framework.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import mapping.Mapping;

import java.io.IOException;
import java.util.HashMap;

@WebServlet(name = "ServletGeneralisation", value = "/ServletGeneralisation")
public class ServletGeneralisation extends HttpServlet {
    HashMap<String, Mapping> mappingUrl;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = request.getRequestURI();
        url = url.substring(request.getContextPath().length());
        response.getWriter().write(url);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
}
