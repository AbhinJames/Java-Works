package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OfficeChangeServlet
 */
@WebServlet("/OfficeChangeServlet")
public class OfficeChangeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OfficeChangeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();

		
		String converter = request.getParameter("converter");
		String country = request.getParameter("country");
		
		double toconvert = Double.parseDouble(converter); 
		double converted=0.0;
		
		if(country.equals("us"))
		{
			converted=0.94 * toconvert; 
		}
		else
		{
			converted = 0.70 * toconvert;
		}
		
		//response.sendRedirect("ConvertedCurrency");
		
		out.println("Currency in " + country + " is: ");
		out.println(converted);
		
		response.setContentType("text/html");
		out.println("<br>");
		out.println("<a href=\"mottoForm.html\">Back</a>");
		out.close();
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
