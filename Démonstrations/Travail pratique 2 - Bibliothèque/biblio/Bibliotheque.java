package biblio;

import java.util.ArrayList;

import articles.Article;
import articles.Format;
import intefaces.Gestion;
import intefaces.Recherche;

public class Bibliotheque implements Recherche, Gestion {
    private ArrayList<Article> articles;
    private ArrayList<Compte> comptes;

    public Bibliotheque() {
        
        // À ce moment qu'on pourrait aller chercher les objets sérialisés
        // ou initialiser des listes par défaut
        comptes = new ArrayList<Compte>();
        articles = new ArrayList<Article>();
        comptes.add(new Compte(1111, "Aujourd'hui", "Étienne Demers", "123 rue du Cégep", Etat.Actif));
        articles.add(new Article("Test", "test", "test", "test", "test", "test"));
    }

    public Compte getCompte(int numéroCompte) throws IllegalArgumentException {

        for (Compte c : comptes) {
            if (c.getNuméroCompte() == numéroCompte) {
                return c;
            }
        }

        throw new IllegalArgumentException("Compte introuvable!");
    }


    @Override
    public void creerLivre(String titre, String sujet, String apercu, String editeur, String date, String langue,
            String ISBN, String auteur, int nbrPages, Format format) throws IllegalArgumentException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'creerLivre'");
    }

    @Override
    public void creerMusique(String titre, String sujet, String apercu, String editeur, String date, String langue,
            String compositeur, int dureeSecondes, int nbrDisques) throws IllegalArgumentException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'creerMusique'");
    }

    @Override
    public void creerFilm(String titre, String sujet, String apercu, String editeur, String date, String langue,
            String directeur, String studio, int dureeMinutes) throws IllegalArgumentException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'creerFilm'");
    }

    @Override
    public void creerJeuVideo(String titre, String sujet, String apercu, String editeur, String date, String langue,
            String développeur, String consoleDeJeu, int nombreDeJoueurs) throws IllegalArgumentException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'creerJeuVideo'");
    }

    @Override
    public Article trouverArticle(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'trouverArticle'");
    }

    @Override
    public void supprimerArticle(String id) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'supprimerArticle'");
    }

    @Override
    public void modifierTitre(String id, String titre) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modifierTitre'");
    }

    @Override
    public void modifierSujet(String id, String sujet) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modifierSujet'");
    }

    @Override
    public void modifierApercu(String id, String apercu) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modifierApercu'");
    }

    @Override
    public void modifierEditeur(String id, String Editeur) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modifierEditeur'");
    }

    @Override
    public void modifierDate(String id, String date) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modifierDate'");
    }

    @Override
    public void modifierLangue(String id, String langue) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modifierLangue'");
    }

    @Override
    public void modifierISBN(String id, String ISBN) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modifierISBN'");
    }

    @Override
    public void modifierAuteur(String id, String auteur) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modifierAuteur'");
    }

    @Override
    public void modifierNbrPages(String id, int NbrPages) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modifierNbrPages'");
    }

    @Override
    public void modifierFormat(String id, Format format) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modifierFormat'");
    }

    @Override
    public void modifierCompositeur(String id, String compositeur) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modifierCompositeur'");
    }

    @Override
    public void modifierDureeSecondes(String id, int dureeSecondes) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modifierDureeSecondes'");
    }

    @Override
    public void modifierNbrDisques(String id, int nbrDisques) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modifierNbrDisques'");
    }

    @Override
    public void modifierDirecteur(String id, String directeur) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modifierDirecteur'");
    }

    @Override
    public void modifierStudio(String id, String studio) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modifierStudio'");
    }

    @Override
    public void modifierDureeMinutes(String id, int dureeMinutes) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modifierDureeMinutes'");
    }

    @Override
    public void modifierDeveloppeur(String id, String developpeur) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modifierDeveloppeur'");
    }

    @Override
    public void modifierConsoleDeJeu(String id, String ConsoleDeJeu) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modifierConsoleDeJeu'");
    }

    @Override
    public void modifierNbrJoueurs(String id, int nbrJoueurs) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modifierNbrJoueurs'");
    }

    @Override
    public ArrayList<Article> rechercheArticlesParTitre(String titre) {
        ArrayList<Article> correspondances = new ArrayList<>();

        for (Article a : articles) {
            if (a.getTitre().equals(titre)) {
                correspondances.add(a);
            }
        }

        return correspondances;
    }

    @Override
    public ArrayList<Article> rechercheArticlesParÉditeur(String editeur) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'rechercheArticlesParÉditeur'");
    }

    @Override
    public ArrayList<Article> rechercheArticlesParSujet(String sujet) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'rechercheArticlesParSujet'");
    }

}
