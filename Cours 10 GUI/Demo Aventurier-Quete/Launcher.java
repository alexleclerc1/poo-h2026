
import javax.swing.SwingUtilities;

import gui.FenetrePrincipale;

public class Launcher {
    public static void main(String[] args) throws Exception {

        // BONNE MÉTHODE (avec les classes)
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                FenetrePrincipale fenetrePrincipale = new FenetrePrincipale();
                fenetrePrincipale.setVisible(true);
            }
        });
    }
}
