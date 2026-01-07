package aaUserinterface.aaForms;

import aaUserinterface.aaResourse.IAStyle;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class aaMenuPanel extends JPanel {
    
    // Botones públicos para que MainForm pueda usarlos
    public JButton btnHome      = new JButton("Home");
    public JButton btnLogin     = new JButton("Login");
    public JButton btnSexo      = new JButton("Sexo");
    public JButton btnLocalidad = new JButton("Localidad");
    public JButton btnTest      = new JButton("Test Error");

    public aaMenuPanel() {
        customizeComponent();
    }

    private void customizeComponent() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS)); // Botones uno debajo del otro
        setPreferredSize(new Dimension(250, 100)); // Ancho del menú
        setBackground(Color.WHITE);
        setBorder(IAStyle.createBorderRect());

        // Agregar Logo o Imagen arriba
        try {
            ImageIcon logo = new ImageIcon(IAStyle.URL_LOGO);
            // Redimensionar logo si es muy grande
            Image img = logo.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            JLabel lblLogo = new JLabel(new ImageIcon(img));
            lblLogo.setAlignmentX(CENTER_ALIGNMENT);
            add(lblLogo);
        } catch (Exception e) {
            System.out.println("No se encontró el logo");
        }
        
        // Agregar espacio
        add(new JLabel(" ")); 

        // Configurar y agregar botones
        addBtn(btnHome);
        addBtn(btnLogin);
        addBtn(btnSexo);
        addBtn(btnLocalidad);
        addBtn(btnTest);
    }

    private void addBtn(JButton btn) {
        // Estilo del botón usando tu clase IAStyle
        btn.setFont(IAStyle.FONT_BOLD);
        btn.setForeground(IAStyle.COLOR_FONT);
        btn.setBackground(Color.WHITE);
        btn.setCursor(IAStyle.CURSOR_HAND);
        btn.setAlignmentX(CENTER_ALIGNMENT);
        btn.setMaximumSize(new Dimension(200, 40)); // Tamaño fijo para uniformidad
        btn.setFocusPainted(false);
        
        add(btn);
        add(new JLabel(" ")); // Espacio entre botones
    }
}