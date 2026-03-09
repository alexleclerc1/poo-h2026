package polymorphisme;

public class Voiture extends Vehicule implements Kilometrique {
    double odometre;
    public Voiture(String marque, String modele) {
        super(marque, modele);
        odometre = 0;
    }

    public String klaxon(){ return "pouet pouet"; }
    public double vitesseMax(){ return 210; }

    public void rouler(double km){ odometre += km; }
    public double getOdometre(){ return odometre; }
}
