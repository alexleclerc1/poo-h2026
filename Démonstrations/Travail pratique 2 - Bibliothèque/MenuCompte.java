import java.util.Scanner;

import biblio.Bibliotheque;
import biblio.Compte;
import intefaces.Recherche;
import java.util.ArrayList;
import articles.Article;

public class MenuCompte {
    private static Compte compte;
    private static Scanner scanner = new Scanner(System.in);

    public static void menuPrincipalCompte(Bibliotheque bibliotheque, Compte c) {
        compte = c;
        System.out.println("Menu principal compte....");

        // Menu...
        
        // Recherche par titre
            // case 1:
        ArrayList<Article> articles = chercherDesArticles(bibliotheque);
                // Menu louer ou réserver
        louerUnArticle(articles);
        // reserverUnArticle
    }


    private static ArrayList<Article> chercherDesArticles(Recherche recherche) {
        // Menu différentes méthodes de recherche
        // Input du titre
        System.out.print("Entrer le titre rechercher : ");
        String titre = scanner.nextLine();

        ArrayList<Article> articles = recherche.rechercheArticlesParTitre(titre);

        int compteur = 0;
        for (Article a : articles) {
            System.out.print(compteur + "."); // 0. 1. 2.
            System.out.println(a);
        }

        return articles;
    } 


    private static void louerUnArticle(ArrayList<Article> articles) {
        System.out.print("Entrer l'index de l'article à louer : ");
        String input = scanner.nextLine();
        int index;
        
        try {
            index = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Entrée invalide!");
            return;
        }

        Article article = articles.get(index);

        try {
            compte.louerUnArticle(article);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(compte);

        System.out.println();
    }
}
