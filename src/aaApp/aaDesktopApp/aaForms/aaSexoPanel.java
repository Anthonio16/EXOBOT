package aaApp.aaDesktopApp.aaForms;

import aaInfrastructure.aaAppStyle;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class aaSexoPanel extends JPanel {

    public aaSexoPanel() {
        customizeComponent();
    }

    private void customizeComponent() {
        setLayout(new BorderLayout());
        
        JLabel lblTitulo = new JLabel("Gestión de Tipos de Sexo");
        lblTitulo.setFont(aaAppStyle.FONT_BOLD);
        lblTitulo.setHorizontalAlignment(JLabel.CENTER);
        lblTitulo.setBorder(aaAppStyle.createBorderRect());
        
        add(lblTitulo, BorderLayout.NORTH);
        
        // Aquí podrías agregar una tabla más adelante
        JLabel lblContenido = new JLabel("Aquí irá la tabla de datos...");
        lblContenido.setHorizontalAlignment(JLabel.CENTER);
        add(lblContenido, BorderLayout.CENTER);
    }
}
