package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class sumaNumeros
 */
public class sumaNumeros extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public sumaNumeros() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	PrintWriter out = response.getWriter();
	String numero1_ = request.getParameter("numero1");
	Integer resultado=0;
	try {
		Integer numero1 = Integer.parseInt(numero1_);
		while(numero1>=0) {
			resultado=resultado+numero1;
			numero1--;
		}
			System.out.println("El resultado es: " +resultado);
			out.print("<h1>El resultado es:"  +resultado+"</h1>");
		
	} catch (Exception e) {
		System.out.println(e.toString());
		out.print("<h1>Para la comprobación tienen que ser números los tres</h1>");
			}
		}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

