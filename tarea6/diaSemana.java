package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class diaSemana
 */
public class diaSemana extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public diaSemana() {
        super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		String numero_ = request.getParameter("numero");
		
		try {
			Integer numero = Integer.parseInt(numero_);
			
			String [] semana= {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
			out.print("<h1>El día seleccionado es el: "+semana[numero-1]+"</h1>");
			System.out.println("El día seleccionado es el: "+semana[numero-1]);
		} catch (Exception e) {
			System.out.println(e.toString());
			out.print("<h1>INTRODUZCA UN NÚMERO VÁLIDO</h1>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
