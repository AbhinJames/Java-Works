

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DataEntry
 */
@WebServlet("/DataEntry")
public class DataEntry extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DataEntry() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String cours = request.getParameter("cours");
		
		String[] sessions = request.getParameterValues("sessions");
		String seance = request.getParameter("seance");
		
	
		
	
		
		
		out.println("Les informations envoyees: ");
		out.println("Sessions: ");
		for(int i =0;i < sessions.length;i++)
		{
			out.print(sessions[i]);
			out.println(",");
		}
		
		out.print("Nom: ");
		out.println(nom);
		out.print("Prenom: ");
		out.println(prenom);
		out.print("Cours: ");
		out.println(cours);
		out.print("Seance: ");
		out.println(seance);
		
		
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
