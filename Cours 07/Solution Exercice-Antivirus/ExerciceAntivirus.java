import java.util.List;

import Moteurs.*;

public class ExerciceAntivirus {
    public static void main(String[] args) throws Exception {
        List<MoteurDetection> moteurs = List.of(
            new MoteurParNom(),
            new MoteurParTaille(),
            new MoteurParRegex()
        );

        for (MoteurDetection m : moteurs) {
            m.detecter(); // appel polymorphe (liaison dynamique)
        }
    }
}
