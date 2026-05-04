package guilde;

public class Aventurier {
    private String nom;
    private int niveau;

    public Aventurier() {
        nom = "Etienne";
        niveau = 1;
    }
    
    public String getNom() {
        return nom;
    }

    public int getNiveau() {
        return niveau;
    }

    @Override
    public String toString() {
        return nom + " - Niveau " + niveau;
    }
}
