package Moteurs;

public class MoteurParNom extends MoteurDetection {
    public MoteurParNom() {
        super("Anti-virus par nom");
    }

    @Override
    public void detecter() {
        System.out.println("[Détection par NOM] Vérification du NOM du fichier...");
    }
}
