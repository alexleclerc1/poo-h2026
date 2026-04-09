package intefaces;

import java.util.ArrayList;
import articles.Article;

public interface Recherche {
    //• Trouver des articles selon le titre 
    public ArrayList<Article> rechercheArticlesParTitre(String titre);
    //• Trouver des articles selon l'éditeur 
    public ArrayList<Article> rechercheArticlesParÉditeur(String editeur);
    //• Trouver des articles selon le sujet 
    public ArrayList<Article> rechercheArticlesParSujet(String sujet);
}
