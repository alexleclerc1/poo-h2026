import javax.swing.*;

import gui.FenetrePrincipale;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) throws Exception {

        // BONNE MÉTHODE (avec les classes)
        FenetrePrincipale fenetrePrincipale = new FenetrePrincipale();
        fenetrePrincipale.setVisible(true);
    }
}
