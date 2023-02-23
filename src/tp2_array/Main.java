package tp2_array;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("\t****On est dans le main****");

        // Création
        PileEntiers P1 = new PileEntiers();
        PileEntiers P2 = new PileEntiers();
        PileEntiers P3 = new PileEntiers();

        // Remplissage de la pile P1 avec 5 entiers aléatoires
        for(int i=0; i< 5; i++){
            int entier = (int) (Math.random() * 100);
            System.out.println("Empilage de " + entier + " dans P1");
            P1.Empiler(entier);
        }
        PileEntiers P = P1;
        // Empilage des nombres pairs et impairs dans P2 et P3
        while (!P1.estVide()){
            int entier = P1.Depiler();
            if (entier % 2 == 0) {
                System.out.println("Dépilage de " + entier + " de P1");
                System.out.println("Empilage de " + entier + " dans P2");
                P2.Empiler(entier);
            } else {
                System.out.println("Dépilage de " + entier + " de P1");
                System.out.println("Empilage de " + entier + " dans P3");
                P3.Empiler(entier);
            }
        }

        System.out.print("Contenu de P1 : " );
        P.Affiche();
        System.out.println();
        System.out.print("Contenu de P2 (nombres pairs) : ");
        P2.Affiche();
        System.out.println();
        System.out.print("Contenu de P3 (nombres impairs) : ");
        P3.Affiche();
        System.out.println();

    }
}

