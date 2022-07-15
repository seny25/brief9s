package Dao;

import model.Taches;
public class TestDao {

	public static void main(String[] args) {
		TachDao ta=new TachDao();
		Taches taches=ta.Ajouter(new Taches("JEE","to de list","en cours","20/05/2022","recherche"));
		//Taches tache=ta.modifier(new Taches("resaux", "c", "ter", "22/05/2022","veille"));
	}

}
