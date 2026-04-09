package biblio;

import java.util.ArrayList;

import articles.Article;

public class Compte {
    int numéroCompte;
    String dateOuverture;
    String nomComplet;
    String adresse;
    Etat etatCompte; // Enum Etat
    
    ArrayList<Article> articlesLoués;

    public Compte(int numéroCompte, String dateOuverture, String nomComplet, String adresse, Etat etatCompte) {
        this.numéroCompte = numéroCompte;
        this.dateOuverture = dateOuverture;
        this.nomComplet = nomComplet;
        this.adresse = adresse;
        this.etatCompte = etatCompte;
        articlesLoués = new ArrayList<>();
    }

    public void louerUnArticle(Article article) throws Exception {
        // Ici qu'on fait les vérification nécessaires
        // max 12
        if (articlesLoués.size() >= 12) {
            throw new Exception("Vous avez atteint le maximum d'item loué!");
        }

        articlesLoués.add(article); // On a loué l'article!
    }


    public int getNuméroCompte() {
        return numéroCompte;
    }

    public Etat getEtatCompte() {
        return etatCompte;
    }

    @Override
    public String toString() {
        String message = "";
        message += nomComplet + "\n";

        for (Article a : articlesLoués) {
            message += a.toString();
        }

        return message;
    }
}
