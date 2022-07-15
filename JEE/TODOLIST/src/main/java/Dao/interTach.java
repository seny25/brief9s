package Dao;

import java.util.List;

import model.Taches;
import model.Utilisateurs;

public interface interTach {
	public Taches  Ajouter(Taches taches);

    public   String Supprimer(String titre  );
    
    public Taches modifier(Taches taches);
    



}
