import java.util.Comparator;

public class TrieVoitureParAnnee implements Comparator {
    public int compare(Object obj1, Object obj2) {

        // On va laisser sans vérification avec un cast "dangereux"
        Voiture a = (Voiture) obj1;
        Voiture b = (Voiture) obj2;

        // Comparaison pour donner: -1, 1 ou 0
        if (a.année < b.année) return -1;
        if (a.année > b.année) return 1;
        return 0; // Les années sont égales
    }
}
