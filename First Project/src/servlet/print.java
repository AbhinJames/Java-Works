package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class print
 */
@WebServlet("/print")
public class print extends HttpServlet {
	private int hitCount = 0;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public print() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		
		Date date = new Date(); 
		
		
		
		response.setIntHeader("Refresh", 5);
		
		
		out.println("<h2>"+"Current Date & Time: " +date.toString()+"</h2>");

		DateFormat df = new SimpleDateFormat("yy/MM/dd HH:mm:ss" );
		Calendar cal = Calendar.getInstance();
		out.println("<h2>"+"Current Date & Time: " +df.format(cal.getTime())+"</h2>");

		
		
		hitCount++;
		out.println("<h3> Total number of hits: "+hitCount+"</h3>");
		
		
//		String name = request.getParameter("name");
//		String[] fruits = request.getParameterValues("fruits");
//
//		out.println("<h3>Hello my name is : "+name+"</h3>" );
//		for(String f: fruits){
//			out.println("<h3>"+f+"</h3>" );
//			}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
