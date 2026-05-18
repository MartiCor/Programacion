package EjemplosUI.EjemploCalculadora;

import javax.swing.*;
import java.awt.*;

public class CalculadoraUI extends JFrame {

    private JTextField pantalla;

    public CalculadoraUI() {
        // 1. Configuración básica de la ventana
        setTitle("Calculadora - DAM 1");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar en la pantalla
        setLayout(new BorderLayout(10, 10)); // Márgenes entre los bordes

        // 2. Configuración de la pantalla (Display)
        pantalla = new JTextField();
        pantalla.setEditable(false); // El usuario no debe escribir directamente con el teclado
        pantalla.setHorizontalAlignment(JTextField.RIGHT);
        pantalla.setFont(new Font("Arial", Font.BOLD, 28));
        pantalla.setPreferredSize(new Dimension(300, 60)); // Altura del campo de texto

        // Añadimos un pequeño margen alrededor de la pantalla
        JPanel panelPantalla = new JPanel(new BorderLayout());
        panelPantalla.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 10));
        panelPantalla.add(pantalla, BorderLayout.CENTER);

        add(panelPantalla, BorderLayout.NORTH);

        // 3. Configuración del panel de botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(4, 4, 5, 5)); // 4 filas, 4 columnas, con separación (huecos)
        panelBotones.setBorder(BorderFactory.createEmptyBorder(5, 10, 10, 10));

        // Nombres de los botones en el orden típico de una calculadora
        String[] nombresBotones = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "C", "0", "=", "+"
        };

        // Crear y añadir los botones al panel
        for (String texto : nombresBotones) {
            JButton boton = new JButton(texto);
            boton.setFont(new Font("Arial", Font.BOLD, 18));
            panelBotones.add(boton);
        }

        // Añadir el panel de botones al centro de la ventana
        add(panelBotones, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        // Ejecutar la interfaz asegurando que se carga correctamente en Swing
        SwingUtilities.invokeLater(() -> {
            CalculadoraUI calc = new CalculadoraUI();
            calc.setVisible(true);
        });
    }
}
