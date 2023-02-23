package tp2_array;

import java.util.Arrays;

public class PileEntiers extends Pile{


//    public PileEntiers(int taille) {
//        super(taille);
//    }
    // Redéfinition de la méthode Depiler pour retenir u Integer
    public Integer Depiler() {
        Object valeur = super.Depiler();
        if (valeur instanceof Integer) {
            return (Integer) valeur;
        } else {
            return null;
        }
    }
}
