import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Voiture> mesVoitures = new ArrayList<Voiture>();
        mesVoitures.add(new Voiture("BMW", 1999));
        mesVoitures.add(new Voiture("Honda", 2006));
        mesVoitures.add(new Voiture("Ford", 1970));

        // Code pour trier par année (classe comparator)
        Comparator<Voiture> trieVoitureParAnnee = new TrieVoitureParAnneePropre();
        Collections.sort(mesVoitures, trieVoitureParAnnee);

        // Code pour trier par année (expression lambda)
        Collections.sort(mesVoitures, (Voiture obj1, Voiture obj2) -> {
            if (obj1.année < obj2.année) return -1;
            if (obj1.année > obj2.année) return 1;
            return 0;
        });

        // Code pour trier par marque
        Collections.sort(mesVoitures, (Voiture a, Voiture b) -> {
            return String.CASE_INSENSITIVE_ORDER.compare(a.marque, b.marque);
        });

        for (Voiture v : mesVoitures) {
            System.out.println(v);
        }
    }
}
