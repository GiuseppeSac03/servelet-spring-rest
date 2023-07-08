package com.academy.cic;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servelet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
    /*
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	} */

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    
    /*
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String inputString = request.getParameter("inputString");
		String outputString = inputString.toUpperCase();
		request.setAttribute("output", outputString);
		request.getRequestDispatcher("index.jsp").forward(request, response);
		

		
	} */

    /*
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		// TODO Auto-generated method stub
 		request.getRequestDispatcher("index2.jsp").forward(request, response);
 	}
*/
 	/**
 	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
 	 */
    /*
 	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		// TODO Auto-generated method stub
 		int num1 = Integer.valueOf(request.getParameter("num1"));
 		int num2 = Integer.valueOf(request.getParameter("num2"));
 		int somma = num1 + num2;
 		request.setAttribute("somma", somma);
 		request.getRequestDispatcher("index2.jsp").forward(request, response);
 	}
 	*/

 	/*
 	  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 	 		// TODO Auto-generated method stub
 	 		request.getRequestDispatcher("index2.jsp").forward(request, response);
 	 	}
 	 */

 	 	/**
 	 	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
 	 	 */
   
    /*
 	 	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 	 		// TODO Auto-generated method stub
 	 		int num1 = Integer.valueOf(request.getParameter("num1"));
 	 		int num2 = Integer.valueOf(request.getParameter("num2"));
 	 		int somma = num1 + num2;
 	 		request.setAttribute("somma", somma);
 	 		request.getRequestDispatcher("index2.jsp").forward(request, response);
 	 	}
 	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("index3.html");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("index4.html");
	}
}
