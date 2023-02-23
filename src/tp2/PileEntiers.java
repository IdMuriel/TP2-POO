package tp2;

public class PileEntiers extends Pile {

    // Redéfinition de la méthode Depiler pour retenir u Integer
    public Integer Depiler() {
        Object valeur = super.depiler();
        if (valeur instanceof Integer) {
            return (Integer) valeur;
        } else {
            return null;
        }
    }
}
