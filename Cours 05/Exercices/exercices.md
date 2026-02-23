# Exercice — Héritage

## Consignes
1. Créez une classe **`Vehicule`** (parent) avec :
   - champs privés : `marque` (*String*), `annee` (*int*), `enMarche` (*boolean* initialement `false`)
   - constructeur `Vehicule(String marque, int annee)`
   - méthodes :
     - `demarrer()` → affiche : `"<marque> démarre."` et met `enMarche = true`
     - `arreter()` → affiche : `"<marque> s'arrête."` et met `enMarche = false`
     - `seDeplacer()` → affiche : `"<marque> se déplace."`
     - getters pour `marque`, `annee`, `enMarche`
2. Créez trois sous-classes **sans polymorphisme dans l’utilisation** :
   - **`Voiture`** : ajoute `klaxonner()` → `"<marque> klaxonne : tut tut!"`
   - **`Chaloupe`** : ajoute `ramer()` → `"<marque> avance à la rame."`
   - **`Moto`** : ajoute `cabrer()` → `"<marque> cabre brièvement."`
3. Dans un `main`, **instanciez** *chaque type concret* dans sa **propre variable** et appelez leurs méthodes **sans** les référencer via le type `Vehicule`.
4. **Interdit pour cet exercice** :
   - pas de tableau ou liste de `Vehicule`,
   - pas de `Vehicule v = new Voiture(...)`,
   - pas de dispatch dynamique via une référence parent.

---

## Solution

### `Vehicule.java`
```java
class Vehicule {
    private String marque;
    private int annee;
    private boolean enMarche;

    public Vehicule(String marque, int annee) {
        this.marque = marque;
        this.annee = annee;
        this.enMarche = false;
    }

    public void demarrer() {
        enMarche = true;
        System.out.println(marque + " démarre.");
    }

    public void arreter() {
        enMarche = false;
        System.out.println(marque + " s'arrête.");
    }

    public void seDeplacer() {
        System.out.println(marque + " se déplace.");
    }

    public String getMarque() { return marque; }
    public int getAnnee() { return annee; }
    public boolean isEnMarche() { return enMarche; }
}
```

### `Voiture.java`
```java
class Voiture extends Vehicule {
    public Voiture(String marque, int annee) {
        super(marque, annee);
    }

    public void klaxonner() {
        System.out.println(getMarque() + " klaxonne : tut tut!");
    }
}
```

### `Chaloupe.java`
```java
class Chaloupe extends Vehicule {
    public Chaloupe(String marque, int annee) {
        super(marque, annee);
    }

    public void ramer() {
        System.out.println(getMarque() + " avance à la rame.");
    }
}
```

### `Moto.java`
```java
class Moto extends Vehicule {
    public Moto(String marque, int annee) {
        super(marque, annee);
    }

    public void cabrer() {
        System.out.println(getMarque() + " cabre brièvement.");
    }
}
```

### `Main.java`
```java
public class Main {
    public static void main(String[] args) {
        // Chaque variable est du type concret correspondant (pas de référence Vehicule)
        Voiture voiture = new Voiture("Toyota", 2020);
        Chaloupe chaloupe = new Chaloupe("Pelican", 2015);
        Moto moto = new Moto("Yamaha", 2022);

        // Séquence voiture
        voiture.demarrer();
        voiture.seDeplacer();
        voiture.klaxonner();
        voiture.arreter();

        // Séquence chaloupe
        chaloupe.demarrer();
        chaloupe.seDeplacer();
        chaloupe.ramer();
        chaloupe.arreter();

        // Séquence moto
        moto.demarrer();
        moto.seDeplacer();
        moto.cabrer();
        moto.arreter();

        // Affichage d'état (via getters hérités)
        System.out.println("Voiture en marche ? " + voiture.isEnMarche());
        System.out.println("Chaloupe en marche ? " + chaloupe.isEnMarche());
        System.out.println("Moto en marche ? " + moto.isEnMarche());
    }
}
```

---

## Sortie attendue (exemple)
```
Toyota démarre.
Toyota se déplace.
Toyota klaxonne : tut tut!
Toyota s'arrête.
Pelican démarre.
Pelican se déplace.
Pelican avance à la rame.
Pelican s'arrête.
Yamaha démarre.
Yamaha se déplace.
Yamaha cabre brièvement.
Yamaha s'arrête.
Voiture en marche ? false
Chaloupe en marche ? false
Moto en marche ? false
```
