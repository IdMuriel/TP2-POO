package tp2;

import java.util.*;

public class Liste {

//    private int valeur;
//    private Liste suivant;

//    public Liste (int valeur, Liste suivant){
//        this.valeur = valeur;
//        this.suivant = suivant;
//    }

    private Element premier;
    private Element dernier;
    private Element position;
    private int taille;


    private class Element{
        Object valeur;
        Element suivant;

        public Element(Object valeur, Element suivant){
            this.valeur = valeur;
            this.suivant = suivant;
        }
    }

    public Liste(){
        premier = null;
        dernier = null;
        position = null;
        taille = 0;
    }



    public boolean estVide(){

        return taille == 0;
    }

    //cette méthode positionne le curseur sur le premier élément de la liste
    public void Premier(){
        position = premier;
    }

    //cette méthode positionne le curseur sur le dernier élément de la liste
    public void Dernier(){
        position = dernier;
    }
    //cette méthode renvoie l'élément suivant de l'élément sur lequel le curseur est positionné.
    // Si la liste est vide ou si le curseur est déjà sur le dernier élément, la méthode renvoie un objet vide.
    public Object Suivant(){
        if(position == null || position.suivant == null){
            System.out.println("Liste vide");
            return null;
        }
        position = position.suivant;
        return position.valeur;
    }
    //cette méthode supprime l'élément sur lequel le curseur est positionné et renvoie cet élément.
    // Si la liste est vide, elle renvoie n objet vide
    public Object Supprimer(){
        if(position == null){
            System.out.println("Liste vide");
            return null;
        }
        Object val = position.valeur;
        Element precedent = null;
        Element courant = null;
        while (courant != position){
            precedent = courant;
            courant = courant.suivant;
        }
        precedent.suivant = position.suivant;
        if(position == premier)
            premier = position.suivant;
        else if (position == dernier)
            dernier = precedent;

        position = position.suivant;
        taille--;
        return val;
    }
    //cette méthode prend en argument un objet générique de type Object et l'ajoute à la position du curseur dans la liste.
    public void Ajouter(Object valeur){
        if(position == null){
            premier = new Element(valeur, null);
            dernier = premier;
            position = premier;
        } else {
            Element suivant = position.suivant;
            Element nouveau = new Element(valeur, suivant);
            position.suivant = nouveau;
            if(suivant == null){
                dernier = nouveau;
            }
        }
        taille++;
    }

    public int Taille(){
        return taille;
    }
}
