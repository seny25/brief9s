package model;

public class Taches {
	
private String titre;
private String description;
private String status;
private String deadline;
private String nomcategorie;
public Taches() {
	
}






public Taches( String titre, String description, String status,  String deadline,String nomcategorie ) {
	super();
	
	this.titre = titre;
	this.description = description;
	this.status = status;
	
	this.deadline = deadline;
	this.nomcategorie=nomcategorie;
}







public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getDeadline() {
	return deadline;
}
public void setDeadline(String deadline) {
	this.deadline = deadline;
}

public String getNomcategorie() {
	return deadline;
}
public void setNomcategorie(String nomcategorie) {
	this.nomcategorie=nomcategorie;
}






@Override
public String toString() {
	return "Taches [titre=" + titre + ", description=" + description + ", status=" + status + ", deadline=" + deadline
			+ ", nomcategorie=" + nomcategorie + "]";
}













}
