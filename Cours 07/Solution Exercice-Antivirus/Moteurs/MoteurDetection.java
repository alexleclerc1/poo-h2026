package Moteurs;

public abstract class MoteurDetection {
    protected String nom;

    public MoteurDetection(String nom) {
        this.nom = nom;
    }

    public abstract void detecter();
}
