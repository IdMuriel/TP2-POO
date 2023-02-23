package tp2;

import java.util.*;

public class Pile {

    Liste maListe;
    public void empiler(Object valeur){
        maListe.Dernier();
        maListe.Ajouter(valeur);
    }

    public Object depiler(){
        maListe.Dernier();
        return maListe.Supprimer();
    }
}
