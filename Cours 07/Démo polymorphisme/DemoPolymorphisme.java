/** 
 * Copier cette classe, ainsi que le package 'polymorphisme' dans le dossier
 * /src d'un projet Java existant
 */

import java.util.ArrayList;
import java.util.List;
import polymorphisme.*;

public class DemoPolymorphisme {

    public static void main(String[] args) {
        Tracteur t1 = new Tracteur("Kioti", "CK25");
        t1.travailler(50.5);
        Tracteur t2 = new Tracteur("Kioti", "CK40");
        t2.travailler(44.8);

        Moto m1 = new Moto("Honda", "CRZ100");
        m1.rouler(155.5);
        Moto m2 = new Moto("Vespa", "Scooter");
        m2.rouler(233.8);

        Voiture a1 = new Voiture("Toyota", "Yaris");
        a1.rouler(203.1);
        Voiture a2 = new Voiture("Mazda", "B4000");
        a2.rouler(1013.9);

        List<Vehicule> flotte = new ArrayList<>();
        flotte.add(t1);
        flotte.add(t2);

        flotte.add(a1);
        flotte.add(a2);

        flotte.add(m1);
        flotte.add(m2);

        for (Vehicule v : flotte) {
            // Comportement propre à TOUS les véhicules
            System.out.println(v.klaxon()); // chacun sa version
            
            // Seulement les Voiture + Moto, c'est à dire les Kilometrique
            if(v instanceof Voiture || v instanceof Moto) {
                Kilometrique obj; // type commun aux Moto et Voiture!
                if(v instanceof Voiture) {
                    obj = (Voiture)v;   // transtypage!
                }
                else {
                    obj = (Moto)v;      // transtypage!
                }
                System.out.printf("Odomètre = %.1f%n", obj.getOdometre());
            }

            // Les Tracteur (ou Horaire)
            if(v instanceof Tracteur) {
                ((Horaire)v).travailler(10.0);              // transtypage avec interface pour appeler .travailler()!
                double h = ((Tracteur)v).getHorametre();    // transtypage + appel de méthode!
                System.out.printf("Horamètre = %.1f%n", h);
            }
        }
    }

}
