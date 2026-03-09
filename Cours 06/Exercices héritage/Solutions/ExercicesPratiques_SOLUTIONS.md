# SOLUTIONS AUX EXERCICES SUR L'HÉRITAGE

## Proposition de solution pour les exercices pratiques

D'autres réponses sont possibles et acceptables!

### Exercice 1 : Conception UML

Pour une bonne conception utilisant l'héritage, nous proposons une classe abstraite `Forme` comme super classe commune à `Rectangle`, `Carre`, `Triangle`, `Cercle` et `Losange`. Cela permet de partager du code commun (comme des méthodes pour calculer l'aire ou le périmètre) et d'implémenter `Comparable` et `equals` au niveau de la super classe.

- **Classe abstraite `Forme`** :
  - Attributs : aucun (ou un nom si nécessaire).
  - Méthodes abstraites : `double aire()`, `double perimetre()`, `String toString()`.
  - Implémente `Comparable<Forme>` (comparaison par aire, par exemple).
  - Redéfinit `equals(Object obj)` pour comparer les formes (par aire et type).

- **Classe `Rectangle`** (hérite de `Forme`) :
  - Attributs : `protected double largeur`, `protected double hauteur`.
  - Constructeurs : `Rectangle(double largeur, double hauteur)`.
  - Méthodes : `aire()`, `perimetre()`, `toString()`, getters/setters.

- **Classe `Carre`** (hérite de `Rectangle`) :
  - Attributs : hérite de `largeur` et `hauteur` (mais hauteur = largeur).
  - Constructeur : `Carre(double cote)` (appelle super(cote, cote)).
  - Méthodes : surcharge `toString()` si nécessaire.

- **Classe `Triangle`** (hérite de `Forme`) :
  - Attributs : `protected double base`, `protected double hauteur`, `protected double cote2`, `protected double cote3`.
  - Constructeurs : `Triangle(double base, double hauteur, double cote2, double cote3)`.
  - Méthodes : `aire()`, `perimetre()`, `toString()`.

- **Classe `Cercle`** (hérite de `Forme`) :
  - Attributs : `protected double rayon`.
  - Constructeur : `Cercle(double rayon)`.
  - Méthodes : `aire()`, `perimetre()`, `toString()`.

- **Classe `Losange`** (hérite de `Forme`) :
  - Attributs : `protected double diagonale1`, `protected double diagonale2`.
  - Constructeur : `Losange(double d1, double d2)`.
  - Méthodes : `aire()`, `perimetre()`, `toString()`.

Le diagramme UML serait représenté dans un fichier `.puml` avec les classes, héritages, attributs et méthodes.

### Exercice 2 : Implémentation

Voici un exemple d'implémentation en Java :

```java
// Forme.java
public abstract class Forme implements Comparable<Forme> {
    public abstract double aire();
    public abstract double perimetre();
    public abstract String toString();

    @Override
    public int compareTo(Forme autre) {
        return Double.compare(this.aire(), autre.aire());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Forme forme = (Forme) obj;
        return Double.compare(forme.aire(), aire()) == 0;
    }
}

// Rectangle.java
public class Rectangle extends Forme {
    protected double largeur, hauteur;

    public Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public double aire() { return largeur * hauteur; }

    @Override
    public double perimetre() { return 2 * (largeur + hauteur); }

    @Override
    public String toString() { return "Rectangle [largeur=" + largeur + ", hauteur=" + hauteur + "]"; }
}

// Carre.java
public class Carre extends Rectangle {
    public Carre(double cote) {
        super(cote, cote);
    }

    @Override
    public String toString() { return "Carre [cote=" + largeur + "]"; }
}

// Triangle.java
public class Triangle extends Forme {
    protected double base, hauteur, cote2, cote3;

    public Triangle(double base, double hauteur, double cote2, double cote3) {
        this.base = base;
        this.hauteur = hauteur;
        this.cote2 = cote2;
        this.cote3 = cote3;
    }

    @Override
    public double aire() { return (base * hauteur) / 2; }

    @Override
    public double perimetre() { return base + cote2 + cote3; }

    @Override
    public String toString() { return "Triangle [base=" + base + ", hauteur=" + hauteur + "]"; }
}

// Cercle.java
public class Cercle extends Forme {
    protected double rayon;

    public Cercle(double rayon) { this.rayon = rayon; }

    @Override
    public double aire() { return Math.PI * rayon * rayon; }

    @Override
    public double perimetre() { return 2 * Math.PI * rayon; }

    @Override
    public String toString() { return "Cercle [rayon=" + rayon + "]"; }
}

// Losange.java
public class Losange extends Forme {
    protected double diagonale1, diagonale2;

    public Losange(double d1, double d2) {
        this.diagonale1 = d1;
        this.diagonale2 = d2;
    }

    @Override
    public double aire() { return (diagonale1 * diagonale2) / 2; }

    @Override
    public double perimetre() { return 2 * Math.sqrt(diagonale1*diagonale1 + diagonale2*diagonale2); } // Approximation

    @Override
    public String toString() { return "Losange [d1=" + diagonale1 + ", d2=" + diagonale2 + "]"; }
}

// Test.java
import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        // Création d'objets
        Rectangle r1 = new Rectangle(4, 5);
        Rectangle r2 = new Rectangle(3, 6);
        Rectangle r3 = new Rectangle(2, 8);

        Carre c1 = new Carre(4);
        Carre c2 = new Carre(5);
        Carre c3 = new Carre(6);

        Triangle t1 = new Triangle(3, 4, 5, 5);
        Triangle t2 = new Triangle(4, 5, 6, 7);
        Triangle t3 = new Triangle(5, 6, 7, 8);

        // ArrayLists
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(r1); rectangles.add(r2); rectangles.add(r3);

        ArrayList<Carre> carres = new ArrayList<>();
        carres.add(c1); carres.add(c2); carres.add(c3);

        ArrayList<Triangle> triangles = new ArrayList<>();
        triangles.add(t1); triangles.add(t2); triangles.add(t3);

        // Tri
        Collections.sort(rectangles);
        Collections.sort(carres); // Erreur de compilation car Carre hérite de Rectangle, mais ArrayList<Carre> n'est pas ArrayList<Rectangle>
        // Pour trier, utiliser ArrayList<Forme> ou caster.

        // Equals
        System.out.println(r1.equals(r2)); // false
        System.out.println(c1.equals(new Carre(4))); // true
    }
}
```

**Note :** Pour le tri des `Carre` et `Triangle`, il faudrait utiliser `ArrayList<Forme>` pour bénéficier du polymorphisme.

### Exercice 3 : Maintenance

Avec la classe abstraite `Forme`, ajouter `Cercle` et `Losange` est direct : il suffit de les faire hériter de `Forme` et implémenter les méthodes abstraites. Rien n'est brisé car le code existant utilise `Forme`, et les nouvelles classes respectent le contrat.

Si on n'avait pas eu de super classe commune, il aurait fallu modifier chaque partie du code pour gérer les nouvelles classes, ce qui aurait brisé l'évolutivité. La conception avec héritage évite cela.
