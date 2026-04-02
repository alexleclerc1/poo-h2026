import java.io.Serializable;

public class Etudiant implements Serializable {
    private static final long serialVersionUID = -2700879061632927918L;
    private String nom;
    private String département;
    private int matricule;
    private int age;
    private String test = "Test";

    public Etudiant(String nom, String département, int matricule, int age) {
        this.nom = nom;
        this.département = département;
        this.matricule = matricule;
        this.age = age;
    }

    @Override
    public String toString() {
        return "[" + matricule + "]" + nom + " " + département + " " + age + " " + test;
    }

    public String getNom() {
        return nom;
    }

    public String getDépartement() {
        return département;
    }

    public int getMatricule() {
        return matricule;
    }

    public int getAge() {
        return age;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDépartement(String département) {
        this.département = département;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
