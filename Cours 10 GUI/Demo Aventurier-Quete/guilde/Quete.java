package guilde;

public class Quete {
    private String titre;
    private int niveau;
    Aventurier aventurier;

    public Quete() {
        titre = "Quete facile";
        niveau = 1;
        aventurier = null;
    }

    public boolean demarrerQuete(Aventurier aventurier) {
        if (this.aventurier != null) {
            // ATTENTION, diviser la logique de l'affichage! 
            //System.err.println("Un aventurier s'occupe déjà de la quête!");
            return false;
        }

        // ATTENTION, diviser la logique de l'affichage! 
        //System.out.println("L'aventurier " + aventurier + " s'occupe de la quete " + this);
        this.aventurier = aventurier;
        return true;
    }
    
    public String getTitre() {
        return titre;
    }

    public int getNiveau() {
        return niveau;
    }

    @Override
    public String toString() {
        return titre + " - Niveau" + niveau;
    }
}
