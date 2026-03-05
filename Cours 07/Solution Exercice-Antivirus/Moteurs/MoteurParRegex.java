package Moteurs;

public class MoteurParRegex extends MoteurDetection {
    public MoteurParRegex() {
        super("Anti-virus par regex");
    }

    @Override
    public void detecter() {
        System.out.println("[Détection par REGEX] Analyse du CONTENU (regex)...");
    }
}
