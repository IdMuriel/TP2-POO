package tp2_array;

import java.util.*;
//public class Pile {
//
//    protected Liste maListe; //accès restreint à la classe héritière PileEntiers
//    //private ArrayList<Object> maPile;
//
//    public Pile() {
//        maListe = null;
//    }
//    public void Empiler(Object valeur){
//        maListe.Dernier();
//        maListe.Ajouter(valeur);
//    }
//
//    public Object Depiler(){
//        maListe.Dernier();
//        return maListe.Supprimer();
//    }
//
//    public boolean estVide(){
//        return maListe == null;
//    }
//
//}
public class Pile {

    protected ArrayList<Object> maPile;

    public Pile() {
        maPile = new ArrayList<>();
    }

    public void Empiler(Object valeur){
        //maListe.Ajouter(valeur);
        maPile.add(valeur);
    }

    public Object Depiler(){
        //return maListe.Supprimer();
        if (maPile.isEmpty()) {
            System.out.println("Pile vide.");
            return null;
        } else {
            Object valeur = maPile.get(maPile.size() - 1);
            maPile.remove(maPile.size() - 1);
            return valeur;
        }
    }

    // Méthodes supplémentaires (optionnelles)
    public boolean estVide(){
        //return maListe.estVide();
        return maPile.isEmpty();
    }
//    public void afficheInit() {
//        ArrayList<Object> pileAffichage = new ArrayList<>();
//        PileEntiers pileTemporaire = new PileEntiers();
//
//        while (!this.estVide()) {
//            Object valeur = this.Depiler();
//            pileAffichage.add(valeur);
//            pileTemporaire.Empiler(valeur);
//        }
//        System.out.print("[ ");
//        for (int i = pileAffichage.size() - 1; i >= 0 ; i--) {
//            System.out.print(pileAffichage.get(i) + " ");
//        }
//        System.out.println(" ]");
//    }

    // Affichage des différentes piles
    public void Affiche(){
        ArrayList<Object> pileAffichage = new ArrayList<>();
        PileEntiers pileTemporaire = new PileEntiers();

        while (!this.estVide()) {
            Object valeur = this.Depiler();
            pileAffichage.add(valeur);
            pileTemporaire.Empiler(valeur);
        }
        System.out.print("[");
        for (int i = pileAffichage.size() - 1; i >= 0 ; i--) {
            System.out.print(pileAffichage.get(i) + " ");
        }
        System.out.println("]");
        while (!pileTemporaire.estVide()) {
            this.Empiler(pileTemporaire.Depiler());
        }
    }

//    public int Taille(){
//        return maPile.size();
//    }

}
