package aaUserinterface.aaForms;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class aaMainForm extends JFrame {
    
    // Asegúrate de tener estas clases (MenuPanel, MainPanel) creadas
    aaMenuPanel pnlMenu = new aaMenuPanel(); 
    JPanel    pnlMain = new aaMainPanel(); // Asumiendo que MainPanel extiende JPanel

    public aaMainForm(String tilteApp) {
        // customizeComponent(tilteApp); // Este método no salía en la imagen, coméntalo si da error
        super(tilteApp); // Alternativa estándar si no tienes customizeComponent
        
        // Configuración básica del Frame si customizeComponent no existe
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        // Agregar el menú al lado izquierdo (WEST) o donde corresponda en tu diseño
        // getContentPane().add(pnlMenu, BorderLayout.WEST); 

        // Eventos de los botones del menú
        pnlMenu.btnHome.addActionListener(      e -> setPanel(new aaMainPanel()));
        pnlMenu.btnLogin.addActionListener(     e -> setPanel(new aaLoginPanel()));
        pnlMenu.btnSexo.addActionListener(      e -> setPanel(new aaSexoPanel()));
        pnlMenu.btnLocalidad.addActionListener( e -> setPanel(new aaMainPanel())); // Repetido en la imagen
        
        // Botón de prueba de error
        pnlMenu.btnTest.addActionListener(e -> { 
            javax.swing.JOptionPane.showMessageDialog(this, "mensaje de error", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        });
        
        // Cargar panel inicial
        getContentPane().add(pnlMain, BorderLayout.CENTER);
        setVisible(true);
    }

    private void setPanel(JPanel formularioPanel) {
        Container container = getContentPane();
        container.remove(pnlMain);
        pnlMain = formularioPanel;
        container.add(pnlMain, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    // Configuración de la ventana (Imagen 4)
    private void customizeComponent(String titleApp) {
        setTitle(titleApp);
        setSize(930, 800);
        setResizable(false);
        setLocationRelativeTo(null); // Centrar en la pantalla
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear contenedor principal
        Container container = getContentPane();
        container.setLayout(new BorderLayout());

        // Agregar los paneles
        container.add(pnlMenu, BorderLayout.WEST);
        container.add(pnlMain, BorderLayout.CENTER);
        
        setVisible(true);
    }
}
