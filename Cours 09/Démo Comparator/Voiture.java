public class Voiture {
    public String marque;
    public int année;

    public Voiture(String marque, int année) {
        this.marque = marque;
        this.année = année;
    }

    @Override
    public String toString() {
        return marque + " " + année;
    }
}
