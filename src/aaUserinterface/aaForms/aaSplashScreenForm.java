package aaUserinterface.aaForms;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

import aaUserinterface.aaResourse.IAStyle;


public abstract class aaSplashScreenForm {
    
    private static JFrame frmSplash;
    private static JProgressBar prbLoading; // Corregí "prbLoaging" a "prbLoading"
    private static ImageIcon icoImagen;
    private static JLabel lblSplash;

    public static void show() {
        // Cargar imagen y recursos
        icoImagen  = new ImageIcon(IAStyle.URL_SPLASH);
        lblSplash  = new JLabel(icoImagen);
        prbLoading = new JProgressBar(0, 100);

        prbLoading.setStringPainted(true); // Muestra el % numérico

        // Configuración de la ventana
        frmSplash = new JFrame();
        frmSplash.setUndecorated(true);
        frmSplash.getContentPane().add(lblSplash, BorderLayout.CENTER);
        frmSplash.add(prbLoading, BorderLayout.SOUTH);
        frmSplash.setSize(icoImagen.getIconWidth(), icoImagen.getIconHeight());
        frmSplash.setLocationRelativeTo(null); 

        // 1. Mostrar la ventana
        frmSplash.setVisible(true);

        // 2. Simular carga (0 a 100%)
        for (int i = 0; i <= 100; i++) {
            try {
                Thread.sleep(50); // Espera 50 milisegundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            prbLoading.setValue(i); // Actualizar la barra
        }

        // 3. Ocultar la ventana al terminar
        frmSplash.setVisible(false);
        // Opcional: frmSplash.dispose(); // Para destruir el objeto completamente
    }
}
