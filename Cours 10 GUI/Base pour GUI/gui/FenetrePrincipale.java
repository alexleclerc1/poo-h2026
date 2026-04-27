package gui;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class FenetrePrincipale extends JFrame {

    JPanel paneau;
    JButton bouton;

    public FenetrePrincipale() {
        super("La fenêtre principale!");
        this.setBounds(500, 300, 800, 600);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        paneau = new JPanel();
        this.add(paneau);

        bouton = new JButton("Bouton principal");
        paneau.add(bouton);
        bouton.addActionListener(new ActionBonjour());

        // Action unique définie rapidement
        // bouton.addActionListener((ActionEvent e) -> {
        //     System.out.println("Action rapide!");
        // });
    }
}
