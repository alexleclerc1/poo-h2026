package Moteurs;

public class MoteurParTaille extends MoteurDetection {
    public MoteurParTaille() {
        super("Anti-virus par taille");
    }

    @Override
    public void detecter() {
        System.out.println("[Détection par TAILLE] Vérification de la TAILLE du fichier...");
    }
}
