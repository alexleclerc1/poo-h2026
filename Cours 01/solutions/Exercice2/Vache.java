package Exercice2;
public class Vache {

    private String nom;
    private Integer age;
    private String couleur;

    public Vache(String nom, Integer age, String couleur) {
        setNom(nom);
        setAge(age);
        setCouleur(couleur);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if (nom == null || nom.trim().isEmpty()) {
            throw new IllegalArgumentException("Le nom ne doit pas être vide");
        }
        this.nom = nom;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age == null || age < 0 || age > 100) {
            throw new IllegalArgumentException("L'âge doit être entre 0 et 100");
        }
        this.age = age;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        if (couleur == null || couleur.trim().isEmpty()) {
            throw new IllegalArgumentException("La couleur ne doit pas être vide");
        }
        this.couleur = couleur;
    }

    public void crier() {
        System.out.println("Meuh !");
    }
}