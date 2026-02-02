package Exercices;

public class tracteur {
    private String marque;
    private String modele;
    private int annee;
    private double poidsKg;
    private boolean etatMoteur;

    public tracteur(String marque, String Modele, int annee, double poidsKg, boolean etatMoteur) {
        this.marque = marque;
        this.modele = Modele;
        this.annee = annee;
        this.poidsKg = poidsKg;
        this.etatMoteur = etatMoteur;
    }

    @Override
    public String toString() {
        return "tracteur [marque=" + marque + ", modele=" + modele + ", annee=" + annee + ", poidsKg=" + poidsKg
                + ", etatMoteur=" + etatMoteur + ", horametreHeures=" + horametreHeures + ", temperatureMoteurCelcius="
                + temperatureMoteurCelcius + ", getMarque()=" + getMarque() + ", getModele()=" + getModele()
                + ", getAnnee()=" + getAnnee() + ", getPoidsKg()=" + getPoidsKg() + ", isEtatMoteur()=" + isEtatMoteur()
                + ", getHorametreHeures()=" + getHorametreHeures() + ", getTemperatureMoteurCelcius()="
                + getTemperatureMoteurCelcius() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
                + ", toString()=" + super.toString() + "]";
    }

    public String getMarque() {
        return marque;
    }
    public void setMarque(String marque) {
         if(marque.isBlank() || marque == null) {
            throw new IllegalArgumentException(String.format("La marque ne peut pas être vide ou null."));
         }
        this.marque = marque;
    }
    public String getModele() {
        return modele;
    }
    public void setModele(String modele) {
        if (modele.isBlank() || modele == null) {
            throw new IllegalArgumentException(String.format("Le modèle ne peut pas être vide ou null."));
        }
        this.modele = modele;
    }
    public int getAnnee() {
        return annee;
    }
    public void setAnnee(int annee) {
        if (annee <= 1950) {
            throw new IllegalArgumentException(String.format("L'année du tracteur doit être au moins 1950."));
        }
        this.annee = annee;
    }
    public double getPoidsKg() {
        return poidsKg;
    }
    public void setPoidsKg(double poidsKg) {
        if (poidsKg <= 0) {
            throw new IllegalArgumentException(String.format("Le poids doit être plus grand que 0."));
        }
        this.poidsKg = poidsKg;
    }
    public boolean isEtatMoteur() {
        return etatMoteur;
    }
    private void setEtatMoteur(boolean etatMoteur) {
        this.etatMoteur = etatMoteur;
    }
    public double getHorametreHeures() {
        return horametreHeures;
    }
    public void setHorametreHeures(double horametreHeures) {
        if (horametreHeures < 0) {
            throw new IllegalArgumentException(String.format("L'horametre doit être plus grand ou égal à 0 (s'il est neuf)"));
        }
        this.horametreHeures = horametreHeures;
    }
    public double getTemperatureMoteurCelcius() {
        return temperatureMoteurCelcius;
    }
    public void setTemperatureMoteurCelcius(double temperatureMoteurCelcius) {
        if (temperatureMoteurCelcius <) {
            
        }
        this.temperatureMoteurCelcius = temperatureMoteurCelcius;
    }
    private double horametreHeures;
    private double temperatureMoteurCelcius;
}
