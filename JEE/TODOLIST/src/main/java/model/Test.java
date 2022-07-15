package model;

import Dao.TachDao;
import Dao.UtiliDao;

public class Test {

	public static void main(String[] args) {
	//TachDao tachDao=new TachDao();
	//Taches taches = new Taches("ddddddev", "JEE","web", "deux jours", 5, 2);
	
	UtiliDao utiliDao=new UtiliDao();
	Utilisateurs utili=new  Utilisateurs("balde","seny","osbt2021mail.com","seny");
	
	
	//Ajouter a la base de donnee
	
	 //tachDao.Ajouter(taches);
	//tachDao.modifier(taches);
	utiliDao.Supprimer("seny");
	utiliDao.Ajouter(utili);
	//utiliDao.Supprimer(123);
	}

}
