import javax.swing.SwingUtilities;

import gui.FenetrePrincipale;

public class Launcher {
    public static void main(String[] args) throws Exception {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                FenetrePrincipale fenetrePrincipale = new FenetrePrincipale();
                fenetrePrincipale.setVisible(true);
            }
        });
    }
}
