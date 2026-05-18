package EjemplosUI.ventana;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ventana extends JFrame {
    public ventana() {
        this.setSize(500, 700); // Aqui decimos el tamaño de la ventana.
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Cerrar programa cuando cerremos ventana
        setTitle("CALCULADORA"); // Titulo Ventana

        iniciarComponentes();
    }

    private void iniciarComponentes() {
        JPanel panel = new JPanel(); // crear panel
        panel.setLayout(null); // Desactivando diseño
        panel.setBackground(Color.DARK_GRAY); // Damos color al panel
        this.getContentPane().add(panel);

        JLabel etiqueta = new JLabel();
        etiqueta.setText("Hola, me llamo Martí"); // Establecer texto etiqueta.
        etiqueta.setBounds(200, 200, 150, 50); // Establecer posición etiqueta.
        etiqueta.setForeground(Color.orange); // Establecer color letra
        etiqueta.setOpaque(true); // dar posiblidad de pintar el fondo de la etiqueta
        etiqueta.setBackground(Color.white);
        panel.add(etiqueta);
    }
}