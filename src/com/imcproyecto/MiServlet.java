package com.imcproyecto;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MiServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        IMC miIMC = new IMC();
        miIMC.peso = 90;
        miIMC.altura = 1.90;

        double resultado = miIMC.mostrarIMC();

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Calculadora IMC</h1>");
        out.println("<p>Peso: 90 kg</p>");
        out.println("<p>Altura: 1.90 m</p>");
        out.println("<h2>IMC = " + String.format("%.2f", resultado) + "</h2>");
        out.println("</body>");
        out.println("</html>");
    }
}