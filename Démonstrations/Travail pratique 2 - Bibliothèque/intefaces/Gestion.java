package intefaces;

import articles.Article;
import articles.Format;

public interface Gestion {

// • Créer un Livre 
public void creerLivre(String titre, String sujet, String apercu, String editeur, String date, String langue, String ISBN, String auteur, int nbrPages, Format format) throws IllegalArgumentException;
// • Créer une Musique 
public void creerMusique(String titre, String sujet, String apercu, String editeur, String date, String langue,  String compositeur, int dureeSecondes, int nbrDisques) throws IllegalArgumentException;
// • Créer un Film 
public void creerFilm(String titre, String sujet, String apercu, String editeur, String date, String langue,  String directeur, String studio, int dureeMinutes) throws IllegalArgumentException;
// • Créer un JeuVidéo 
public void creerJeuVideo(String titre, String sujet, String apercu, String editeur, String date, String langue,  String développeur, String consoleDeJeu, int nombreDeJoueurs) throws IllegalArgumentException;

// Selon l'ID d'un article, on peut: 
// • Trouver un article par ID 
public Article trouverArticle(String id);
// • Supprimer un article par ID 
public void supprimerArticle(String id) throws Exception;
// • Modifier son titre 
public void modifierTitre(String id, String titre) throws Exception;
// • Modifier son sujet 
public void modifierSujet(String id, String sujet) throws Exception;
// • Modifier son aperçu 
public void modifierApercu(String id, String apercu) throws Exception;
// • Modifier son éditeur 
public void modifierEditeur(String id, String Editeur) throws Exception;
// • Modifier la date de publication 
public void modifierDate(String id, String date) throws Exception;
// • Modifier la langue
public void modifierLangue(String id, String langue) throws Exception;

// Livre! Donc si l'id ne correspond pas à un article livre, EXCEPTION!
// • L'ID est ce qu'on appel l'ISBN, qui est un numéro de 13 chiffres. 
public void modifierISBN(String id, String ISBN) throws Exception;
// • Auteur 
public void modifierAuteur(String id, String auteur) throws Exception;
// • Nombre de pages 
public void modifierNbrPages(String id, int NbrPages) throws Exception;
// • Format (Enum: Papier, PDF, Audio)
public void modifierFormat(String id, Format format) throws Exception;


//  Compositeur 
public void modifierCompositeur(String id, String compositeur) throws Exception;
// • Durée en secondes 
public void modifierDureeSecondes(String id, int dureeSecondes) throws Exception;
// • Nombre de disques
public void modifierNbrDisques(String id, int nbrDisques) throws Exception;

// Directeur 
public void modifierDirecteur(String id, String directeur) throws Exception;
// • Studio 
public void modifierStudio(String id, String studio) throws Exception;
// • Durée en minutes 
public void modifierDureeMinutes(String id, int dureeMinutes) throws Exception;

// Développeur 
public void modifierDeveloppeur(String id, String developpeur) throws Exception;
// • Console de jeu 
public void modifierConsoleDeJeu(String id, String ConsoleDeJeu) throws Exception;
// • Nombre de joueurs 
public void modifierNbrJoueurs(String id, int nbrJoueurs) throws Exception;
}
