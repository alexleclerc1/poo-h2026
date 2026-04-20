import java.util.Scanner;

import biblio.Bibliotheque;
import biblio.Compte;
import biblio.Etat;

public class App {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        Bibliotheque bibliotheque = new Bibliotheque();

        // Input numéro de compte
        System.out.println("---- Bienvenue dans la bibliothèque ----");
        System.out.print("Entrer votre numéro de compte : ");
        String input = scanner.nextLine();
        int numéroCompte;
        
        // Vérifications pour le numéroCompte
        try {
            numéroCompte = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Entrée invalide!");
            return;
        }

        Compte compte;
        try {
            compte = bibliotheque.getCompte(numéroCompte);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }

        if (compte.getEtatCompte() == Etat.Actif) {
            MenuCompte.menuPrincipalCompte(bibliotheque, compte);
        }
    }
}
