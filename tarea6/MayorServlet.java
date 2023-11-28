package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class MayotServlet
 */
public class MayorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MayorServlet() {
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
		String numero1_ = request.getParameter("numero1");
		String numero2_ = request.getParameter("numero2");
		String numero3_ = request.getParameter("numero3");

		try {
			Integer numero1 = Integer.parseInt(numero1_);
			Integer numero2 = Integer.parseInt(numero2_);
			Integer numero3 = Integer.parseInt(numero3_);

			if (numero1 > numero2 && numero1 > numero3) {
				System.out.println("El numero mayor es el primer numero");
				out.print("<h1>El numero mayor es el primer numero</h1>");
			} else if (numero2 > numero3 && numero2 > numero1) {
				System.out.println("El numero mayor es el segundo numero");
				out.print("<h1>El numero mayor es el segundo numero</h1>");
			} else {
				System.out.println("El numero mayor es el tercer numero");
				out.print("<h1>El numero mayor es el tercer numero</h1>");
			}
		} catch (Exception e) {
			System.out.println(e.toString());
			out.print("<h1>Para la comprobación tienen que ser números los tres</h1>");
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
