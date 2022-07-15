package Dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;

import model.Connexion;
import model.Utilisateurs;

public class UtiliDao implements interUtili {

	 Statement st;
	    public String sql;
	@Override
	public Utilisateurs Ajouter(Utilisateurs utili) {
		 Connection connection= Connexion.getConnection();
		 try {
			
			 sql="insert into Utilisateurs(nom,prenom,nomUtilisateur,motpass) values(?,?,?,?)";
			 PreparedStatement ps=connection.prepareStatement(sql);
			 ps.setString(1,utili.getNom());
			 ps.setString(2,utili.getPrenom());
			 ps.setString(3,utili.getNomUtilisateur());
			 ps.setString(4,utili.getMotpass());
			 ps.executeUpdate();
			ps.close();
				 System.out.println("utilisateur bien ajouter");
			
					
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		return utili;
	}

	@Override
	public Utilisateurs Supprimer(String motpass) {
		 Connection connection= Connexion.getConnection();
		 String sql= "DELETE FROM  Utilisateurs WHERE motpass= ?";
		 try {
			 PreparedStatement ps = connection.prepareStatement(sql);
			 ps.setString(1, motpass);
			 ps.executeUpdate();
			 ps.close();
			 System.out.println("Utilisateur  bien supprimer");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}


}
