package model;

public class Utilisateurs {
private String nom,prenom,nomUtilisateur,motpass;


public Utilisateurs() {
	
}
public Utilisateurs(String nom, String prenom, String nomUtilisateur, String motpass) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.nomUtilisateur = nomUtilisateur;
	this.motpass = motpass;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}

public String getNomUtilisateur() {
	return nomUtilisateur;
}

public void setNomUtilisateur(String nomUtilisateur) {
	this.nomUtilisateur = nomUtilisateur;
}

public String getMotpass() {
	return motpass;
}

public void setMotpass(String motpass) {
	this.motpass = motpass;
}

@Override
public String toString() {
	return "Utilisateurs [nom=" + nom + ", prenom=" + prenom + ", nomUtilisateur=" + nomUtilisateur + ", motpass="
			+ motpass + "]";
}


}
