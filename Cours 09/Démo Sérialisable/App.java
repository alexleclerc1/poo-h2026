import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static final String FICHIER = "etudiants";
    public static final String DOSSIER = "data\\";

    public static void main(String[] args) throws Exception {
        List<Etudiant> etudiants = new ArrayList<>();
        etudiants.add(new Etudiant("Yann Fournier", "Informatique", 245336, 45));
        etudiants.add(new Etudiant("Étienne Mollot Bourget", "Informatique", 234553, 4));

        enregistrerListEtudiant(etudiants);

        List<Etudiant> e = chargerListEtudiant();
        for (Etudiant etudiant : e) {
            System.out.println(etudiant);
        }

        // e.setAge(67);
        // System.out.println(e);

        // enregistrerEtudiant(e);
    }

    // ---------------- Méthodes pour enregistrer et charger un étudiant unique --------------------------
    public static void enregistrerEtudiant(Etudiant etudiant) throws Exception {
        // Enregistrement
        FileOutputStream fos = new FileOutputStream(DOSSIER + FICHIER + ".ser");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(etudiant);

        oos.close();
    }

    public static Etudiant chargerEtudiant() throws Exception {
        // Chargement de l'objet
        FileInputStream fis = new FileInputStream(DOSSIER + FICHIER + ".ser");

        ObjectInputStream ois = new ObjectInputStream(fis);

        Etudiant etudiantChargé = (Etudiant) ois.readObject();

        ois.close();

        return etudiantChargé;
    }

    // ---------------- Méthodes pour enregistrer et charger une liste d'étudiants --------------------------
    public static void enregistrerListEtudiant(List<Etudiant> etudiants) throws Exception {
        // Enregistrement
        FileOutputStream fos = new FileOutputStream(DOSSIER + FICHIER + ".ser");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(etudiants);

        oos.close();
    }

    public static List<Etudiant> chargerListEtudiant() throws Exception {
        // Chargement de l'objet
        FileInputStream fis = new FileInputStream(DOSSIER + FICHIER + ".ser");

        ObjectInputStream ois = new ObjectInputStream(fis);

        List<Etudiant> etudiantsChargé = (List<Etudiant>) ois.readObject();

        ois.close();

        return etudiantsChargé;
    }

    // ------- Méthodes pour enregistrer et charger un objet de type T (type passé en paramètre) -----------------
    public static <T> void enregistrer(T objet) throws Exception {
        // Enregistrement
        FileOutputStream fos = new FileOutputStream(DOSSIER + FICHIER + ".ser");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(objet);

        oos.close();
    }

    public static <T> T charger() throws Exception {
        // Chargement de l'objet
        FileInputStream fis = new FileInputStream(DOSSIER + FICHIER + ".ser");

        ObjectInputStream ois = new ObjectInputStream(fis);

        T objetChargé = (T) ois.readObject();

        ois.close();

        return objetChargé;
    }
}
