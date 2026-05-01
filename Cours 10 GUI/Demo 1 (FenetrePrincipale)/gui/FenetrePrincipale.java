package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class FenetrePrincipale extends JFrame {

    JPanel paneauPrincipal;

    public FenetrePrincipale() {
        super("Ma fenetre principale");

        // Configurations par défaut désirées pour notre programme
        // concernant la fenetre principale
        this.setBounds(300, 300, 1000, 700);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        paneauPrincipal = new JPanel();
        this.add(paneauPrincipal);

        // ajouter des composants à la fenêtre principale
        paneauPrincipal.add(new JButton("Le bouton"));
    }
}
