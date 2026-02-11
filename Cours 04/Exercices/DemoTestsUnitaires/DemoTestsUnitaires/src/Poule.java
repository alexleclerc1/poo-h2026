public class Poule {
    private String nom;
    private int nbOeufs;
    private int energie;

    public Poule(String nom) {
        this.nom = nom;
        this.nbOeufs = 50;
        this.energie = 50;
    }

    public void pondre() {
        if (energie >= 10) {
            nbOeufs++;
            energie -= 10;
        }
    }

    public void manger(int grammes) {
        energie += grammes;
    }

    public int getNbOeufs() {
        return nbOeufs;
    }

    public int getEnergie() {
        return energie;
    }

    public String getNom() {
        return nom;
    }
}
