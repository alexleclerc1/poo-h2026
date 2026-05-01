package gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class FenetrePrincipale extends JFrame {

    JPanel paneau;
    JButton bouton;
    JCheckBox caseCoche;
    JTextField champTexte;
    JLabel etiquette;

    public FenetrePrincipale() {
        super("Démo composants");
        this.setBounds(500, 300, 800, 600);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        //paneau = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 20)); // FlowLayout par défaut
        //paneau = new JPanel(new GridLayout(2, 2, 30, 30)); // Grille de i x j
        paneau = new JPanel(new BorderLayout()); // Ajouter le placement lors de .add
        this.add(paneau);

        // Composants interfactifs
        JPanel paneauNom = new JPanel();

        JLabel image = new JLabel(new ImageIcon("/Background.jpg"));
        paneau.add(image);

        etiquette = new JLabel("Entrer votre nom :");
        paneauNom.add(etiquette);

        champTexte = new JTextField(15);
        paneauNom.add(champTexte);

        paneau.add(paneauNom, BorderLayout.NORTH);

        caseCoche = new JCheckBox("Dire bonjour");
        paneau.add(caseCoche);

        bouton = new JButton("Valider");
        paneau.add(bouton, BorderLayout.SOUTH);

        bouton.addActionListener((ActionEvent e) -> {
            String nom = champTexte.getText();
            if (caseCoche.isSelected()) {
                System.out.println("Bonjour " + nom + " !");
            } else {
                System.out.println("Nom saisi : " + nom);
            }
        });
    }
}
