package packServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.TachDao;
import Dao.UtiliDao;
import model.Connexion;
import model.Taches;

/**
 * Servlet implementation class TachServlet
 */
@WebServlet(name="TachServlet",urlPatterns = "/hello")
public class TachServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 Connection connection= Connexion.getConnection();
    
	 private TachDao tachDao;
	   public void init() {
		   tachDao = new TachDao();
		  
		   
	   }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		
//		System.out.println("get");

		
		
        
	}
		/*
		 * Taches taches = new Taches(); taches.setIdtitre(4); taches.setTitre(titre);
		 * taches.setDescription(description); taches.setStatus(status);
		 * taches.setIdcat(idcat); taches.setDeadline(deadline);
		 
       try {
    	   tachDao.Ajouter(taches);
    	  System.out.print(taches.getIdtitre()); 
    	  System.out.print(taches.getTitre());
    	  System.out.print(taches.getDescription());
    	  System.out.print(taches.getStatus());
    	  System.out.print(taches.getIdcat());
    	  System.out.print(taches.getDeadline());
    	  request.getRequestDispatcher("T.jsp");
    	   
	} catch (Exception e) {
		// TODO: handle exception
	}
       out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		

//		System.out.println("post");
		TachDao tachDao=new TachDao ();
		response.setContentType("text/html");
//        PrintWriter out=response.getWriter();
        String titre=request.getParameter("titre");
        String description=request.getParameter("description");
        String status=request.getParameter("status");
        String deadline=request.getParameter("deadline");
        String nomcategorie=request.getParameter("nomcategorie");
//        System.out.println("hhhh"+titre);
      Taches taches = new Taches(titre,description,status,deadline, nomcategorie);
       
//		Taches taches = new Taches(); 
//		taches.setTitre(titre);
//		taches.setDescription(description); 
//		taches.setStatus(status);
//		 taches.setDeadline(deadline);
		
        	 tachDao.Ajouter(taches);
        	 response.sendRedirect("T.jsp");
		 
	
			
		
	}

}
