package packServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.UtiliDao;
import model.Connexion;
import model.Utilisateurs;

/**
 * Servlet implementation class UtilisServlet
 */
@WebServlet(name="UtilisServlet",urlPatterns = "/")
public class UtilisServlet extends HttpServlet {
	 Connection connection= Connexion.getConnection();
	private static final long serialVersionUID = 1L;     
   private  UtiliDao utiliDao;
   public void init() {
	  
	   
   }
   /**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
		
		
		
		response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String nom=request.getParameter("nom"); 
        String prenom=request.getParameter("prenom"); 
        String nomUtilisateur=request.getParameter("nomUtilisateur");
        String motPass=request.getParameter("motPass");
        
        
        
        UtiliDao utiliDao=new UtiliDao ();
        Utilisateurs u =new Utilisateurs ();
        u.setNom(nom);
        u.setPrenom(prenom); 
        u.setNomUtilisateur(nomUtilisateur);
        u.setMotpass(motPass);
        
      
        try {
        	
        	//Utilisateurs utilisateur=new Utilisateurs(nom,prenom,nomUtilisateur,motPass);
			//UtiliDao utiliDao=new UtiliDao();
			utiliDao.Ajouter(u);
			System.out.println(u.getNom());
			System.out.println(u.getPrenom());
			System.out.println(u.getNomUtilisateur());
			System.out.println(u.getMotpass());
			request.getRequestDispatcher("index.jsp");
			
			
			
        	
		} catch (Exception e) {
			e.printStackTrace();
		}
       

        out.close();
		//doGet(request, response);
	}
	
	
   
	/**
	 * @throws IOException 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	 private void Supprimer(HttpServletRequest request, HttpServletResponse response) throws IOException {
	 
       UtiliDao utiliDao=new UtiliDao ();
       try {

           String motPass=request.getParameter("sana");
           utiliDao.Supprimer(motPass);
       	   request.getRequestDispatcher("login.jsp");
	} catch (Exception e) {
		System.out.print("le mot passe n'a pas ete supprimer");
	}
   	 
	
   }
	 
}
