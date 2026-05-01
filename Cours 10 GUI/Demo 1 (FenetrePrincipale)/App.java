import javax.swing.*;

import gui.FenetrePrincipale;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) throws Exception {
        
        // 1. Créer les objets qui représentent les éléments graphiques
        JFrame fenetre = new JFrame("Ma première application Swing!");
        JFrame fenetre2 = new JFrame("Une seconde fenêtre.");
        JPanel paneau = new JPanel();
        JButton bouton = new JButton("Afficher la 2e fenetre!");

        // 2. Faire des configurations sur les objets
        fenetre.setBounds(700, 300, 300, 200);
        fenetre2.setBounds(1400, 400, 500, 300);
        fenetre.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        fenetre2.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        // ajouter une action au bouton
        bouton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("Bonjour tout le monde!"); // Ajouter du code à réaliser
                fenetre.setVisible(false);
                fenetre2.setVisible(true);
            }
        });

        // Ajouter le bouton au paneau, ensuite le paneau à la fenetre
        paneau.add(bouton);
        fenetre.add(paneau);

        // 3. Montrer à l'écran (rendre visibile) l'objet ou les objets graphiques
        fenetre.setVisible(true);


        // BONNE MÉTHODE (avec les classes)
        FenetrePrincipale fenetrePrincipale = new FenetrePrincipale();
    }
}
