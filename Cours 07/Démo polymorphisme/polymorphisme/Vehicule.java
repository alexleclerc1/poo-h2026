package polymorphisme;

public abstract class Vehicule {
    String marque;
    String modele;
    Vehicule(String m, String mo){ marque=m; modele=mo; }

    public abstract String klaxon();
    public abstract double vitesseMax();
}
