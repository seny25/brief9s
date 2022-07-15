package Dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Connexion;
import model.Taches;

public class TachDao implements interTach {
	
	 Statement st;
	    public String sql;
	    Connection con;
	@Override
	public Taches Ajouter(Taches taches) {
		 Connection connection= Connexion.getConnection();
		 try {
			 int status = 0;
			 sql="insert into Taches(titre,description,status,deadline,nomcategorie)values(?,?,?,?,?)";
			 PreparedStatement ps=connection.prepareStatement(sql);
			
			 ps.setString(1,taches.getTitre());
			 ps.setString(2,taches.getDescription());
			 ps.setString(3,taches.getStatus());
			 ps.setString(4,taches.getDeadline());
			 ps.setString(5,taches.getNomcategorie());           
			 status = ps.executeUpdate();
			 if(status==1)
			 //ps.close();
				 System.out.println("tache bien ajouter");
			 else 
				 System.out.println("Echec de l'ajout de la tache");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return taches;
	}

	@Override
	public String Supprimer(String titre) {
		 Connection connection= Connexion.getConnection();
		 
		 String sql= "DELETE FROM Taches WHERE titre= ?";
		 try {
		
			 PreparedStatement ps = connection.prepareStatement(sql);
				ps.setString(1, titre);
				ps.executeUpdate();
				ps.close();
		} catch (Exception e) {
			System.out.println("donnee bien supprimer");
		}
		return sql;
		
	}

	@Override
	public Taches modifier(Taches taches) {
		 Connection connection= Connexion.getConnection();
		 String sql = "UPDATE Taches SET titre=?,description=?, status=?,  deadline=?,nomcategorie=? WHERE titre=?";
				try {
					PreparedStatement ps=connection.prepareStatement(sql);
					ps.setString(1, taches.getTitre());
					ps.setString(2,taches.getDescription());
					ps.setString(3,taches.getStatus());
					ps.setString(4,taches.getDeadline());
					ps.setString(5,taches.getNomcategorie());
					
					ps.executeUpdate();
					ps.close();

		            System.out.println("Taches avec comme titre " + taches.getTitre() + "a été mis à jour dans DB avec les détails suivants: " + taches.toString());
					
				} catch (Exception e) {
					
				}
			
		
		
		
		
		return taches;
	}
	public List<Taches> selectAllTaches(){
		List<Taches> taches=new ArrayList<>();
	 try{
		PreparedStatement ps=con.prepareStatement(sql);
		System.out.print(ps);
		ResultSet rs=ps.executeQuery();
		while (rs.next()) {
			
			String titre=rs.getString("titre");
			String description=rs.getString("description");
			String status=rs.getString("status");
			
			String deadline=rs.getString("deadline");
			String nomcategorie=rs.getString("nomcategorie");
			taches.add(new Taches(titre,description,status,deadline,nomcategorie));
			
		}
		  

		
		  
	 } catch (Exception e) {
		
	}
		
	 return null  ;

		
	}
	 

}
