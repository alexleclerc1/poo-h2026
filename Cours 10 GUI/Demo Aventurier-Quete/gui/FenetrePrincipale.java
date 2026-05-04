package gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.WindowConstants;

import guilde.Aventurier;
import guilde.Guilde;
import guilde.Quete;

public class FenetrePrincipale extends JFrame {

    Guilde guilde;
    JPanel paneauPrincipal;

    public FenetrePrincipale() {
        // Configurations par défaut désirées pour notre programme
        // concernant la fenetre principale
        super("Ma fenetre principale");
        this.setBounds(300, 300, 500, 300);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        paneauPrincipal = new JPanel();
        this.add(paneauPrincipal);

        // Ajout des listes d'aventuriers et de quêtes
        guilde = new Guilde();

        // Liste aventuriers
        DefaultListModel<Aventurier> modelAventuriers = new DefaultListModel<>();
        for (Aventurier aventurier : guilde.getAventuriers()) {
            modelAventuriers.addElement(aventurier);
        }
        JList<Aventurier> jListAventurier = new JList<>(modelAventuriers);
        jListAventurier.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrollPanelAventuriers = new JScrollPane(jListAventurier);
        scrollPanelAventuriers.setPreferredSize(new Dimension(150,70));

        // Liste quêtes
        DefaultListModel<Quete> modelQuetes = new DefaultListModel<>();
        for (Quete quete : guilde.getQuetes()) {
            modelQuetes.addElement(quete);
        }
        JList<Quete> jListQuete = new JList<>(modelQuetes);
        jListQuete.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrollPanelQuetes = new JScrollPane(jListQuete);
        scrollPanelQuetes.setPreferredSize(new Dimension(150,70));

        // Bouton démarrer quête
        JButton boutonDemarrer = new JButton("Démarrer quête");

        boutonDemarrer.addActionListener((ActionEvent e) -> {
            Aventurier aventurier = jListAventurier.getSelectedValue();
            Quete quete = jListQuete.getSelectedValue();

            if (aventurier == null || quete == null) {
                // System.err.println("Il vous manque de sélection un aventurier et une quête!"); // Si on veut console
                JOptionPane.showMessageDialog(this, "Il vous manque de sélection un aventurier et une quête!", "Erreur!", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (quete.demarrerQuete(aventurier)) {
                JOptionPane.showMessageDialog(this, "L'aventurier " + aventurier + " s'occupe de la quete " + quete, "Succès", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {
                JOptionPane.showMessageDialog(this, "Un aventurier s'occupe déjà de la quête!", "Erreur!", JOptionPane.ERROR_MESSAGE);
                return;
            }
        });


        // ajouter des composants à la fenêtre principale
        paneauPrincipal.add(scrollPanelAventuriers);
        paneauPrincipal.add(boutonDemarrer);
        paneauPrincipal.add(scrollPanelQuetes);
    }
}
