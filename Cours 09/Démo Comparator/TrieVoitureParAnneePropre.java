import java.util.Comparator;

public class TrieVoitureParAnneePropre implements Comparator<Voiture> {
    public int compare(Voiture voiture1, Voiture voiture2) {

        // Pas besoin de faire de cast ici
        // Voiture a = (Voiture) obj1;
        // Voiture b = (Voiture) obj2;

        // Comparaison pour donner: -1, 1 ou 0
        if (voiture1.année < voiture2.année) return -1;
        if (voiture1.année > voiture2.année) return 1;
        return 0; // Les années sont égales
    }
}
