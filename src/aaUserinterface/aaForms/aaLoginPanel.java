package aaUserinterface.aaForms;

import aaUserinterface.aaResourse.IAStyle;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class aaLoginPanel extends JPanel {
    
    public JTextField txtUsuario = new JTextField(15);
    public JPasswordField txtClave = new JPasswordField(15);
    public JButton btnIngresar = new JButton("Ingresar");

    public aaLoginPanel() {
        customizeComponent();
    }

    private void customizeComponent() {
        setLayout(new GridBagLayout()); // Centra todo
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Margen entre componentes
        
        // Título
        JLabel lblTitulo = new JLabel("INICIAR SESIÓN");
        lblTitulo.setFont(IAStyle.FONT_BOLD);
        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 2;
        add(lblTitulo, gbc);

        // Usuario
        gbc.gridwidth = 1; gbc.gridy = 1;
        gbc.gridx = 0; add(new JLabel("Usuario:"), gbc);
        gbc.gridx = 1; add(txtUsuario, gbc);

        // Clave
        gbc.gridy = 2;
        gbc.gridx = 0; add(new JLabel("Contraseña:"), gbc);
        gbc.gridx = 1; add(txtClave, gbc);

        // Botón
        gbc.gridy = 3; gbc.gridx = 0; gbc.gridwidth = 2;
        btnIngresar.setBackground(IAStyle.COLOR_FONT);
        btnIngresar.setForeground(Color.WHITE);
        add(btnIngresar, gbc);
    }
}
