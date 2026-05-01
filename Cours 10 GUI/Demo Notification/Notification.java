import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Point;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;
import javax.swing.Timer;

public class Notification {
    
    public static void notifie(JFrame parent, String message, int dureeMs) {
        JWindow window = new JWindow(parent);
        window.setAlwaysOnTop(true);
        window.setFocusableWindowState(false);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(50, 50, 50));
        panel.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        panel.setLayout(new BorderLayout());
        
        JLabel label = new JLabel(message);
        label.setForeground(Color.WHITE);
        label.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        panel.add(label, BorderLayout.CENTER);
        window.add(panel);
        window.pack();

        // Position : bas à droite de la fenêtre parente
        Point p = parent.getLocationOnScreen();
        int x = p.x + parent.getWidth() - window.getWidth() - 20;
        int y = p.y + parent.getHeight() - window.getHeight() - 20;
        window.setLocation(x, y);

        window.setVisible(true);

        // Fermeture automatique
        new Timer(dureeMs, e -> window.dispose()).start();
    }
}
