package articles;

public class Article {
    String id;
    String titre;
    String sujet;
    String apercu;
    String editeur;
    String date;
    String langue;


    public Article(String titre, String sujet, String apercu, String editeur, String date, String langue) {
        id = "test";
        this.titre = titre;
        this.sujet = sujet;
        this.apercu = apercu;
        this.editeur = editeur;
        this.date = date;
        this.langue = langue;
    }

    @Override
    public String toString() {
        return id + ": " + titre;
    }

    public String getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public String getSujet() {
        return sujet;
    }

    public String getApercu() {
        return apercu;
    }

    public String getEditeur() {
        return editeur;
    }

    public String getDate() {
        return date;
    }

    public String getLangue() {
        return langue;
    }
}
