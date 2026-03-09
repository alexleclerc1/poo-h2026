package polymorphisme;

public class Moto extends Vehicule implements Kilometrique {
    double odometre;
    public Moto(String marque, String modele) {
        super(marque, modele);
        odometre = 0;
    }

    public String klaxon(){ return "pin pin"; }
    public double vitesseMax(){ return 180; }

    public void rouler(double km){ odometre += km; }
    public double getOdometre(){ return odometre; }
}
