package aaApp.aaDesktopApp.aaForms;

import aaInfrastructure.aaAppStyle;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class aaMainPanel extends JPanel {
    
    public aaMainPanel() {
        customizeComponent();
    }

    private void customizeComponent() {
        setLayout(new BorderLayout());
        setBackground(Color.WHITE); // O Color.lightGray
        
        try {
            // Cargar imagen de bienvenida
            ImageIcon imgMain = new ImageIcon(aaAppStyle.URL_MAIN);
            JLabel lblImage = new JLabel(imgMain);
            lblImage.setHorizontalAlignment(JLabel.CENTER);
            add(lblImage, BorderLayout.CENTER);
        } catch (Exception e) {
            JLabel lblText = new JLabel("Bienvenido al Sistema");
            lblText.setFont(aaAppStyle.FONT_BOLD);
            lblText.setHorizontalAlignment(JLabel.CENTER);
            add(lblText, BorderLayout.CENTER);
        }
    }
}
