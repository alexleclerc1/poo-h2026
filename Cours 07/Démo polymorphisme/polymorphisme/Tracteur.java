package polymorphisme;

public class Tracteur extends Vehicule implements Horaire {
    double horametre = 0;
    public Tracteur(String marque, String modele) {
        super(marque, modele);
        horametre = 0;
    }
    public String klaxon(){ return "BRAAAP"; }
    public double vitesseMax(){ return 40; }

    public void travailler(double h){ horametre += h; }
    public double getHorametre(){ return horametre; }
}
