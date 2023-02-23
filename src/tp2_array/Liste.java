package tp2_array;

import java.util.ArrayList;

public class Liste {

    private ArrayList<Object> maListe;
    private int position;

    public Liste(){
        maListe = new ArrayList<Object>();
        position = 0;
    }

    public void Premier(){
        position = 0;
    }

    public void Dernier(){
        position = maListe.size() - 1;
    }

    public Object Suivant(){
        if(maListe.isEmpty() || position == maListe.size() - 1){
            System.out.println("Liste vide ou dernier élément.");
            return null;
        } else {
            position++;
            return maListe.get(position);
        }
    }

    public Object Supprimer(){
        if (maListe.isEmpty()){
            System.out.println("Liste vide.");
            return null;
        } else {
            Object valeur = maListe.get(position);
            maListe.remove(position);
            return valeur;
        }
    }

    public void Ajouter(Object valeur){

        maListe.add(position, valeur);
    }

// Méthodes supplémentaires (optionnelles)
    public boolean estVide(){

        return maListe.isEmpty();
    }

}
