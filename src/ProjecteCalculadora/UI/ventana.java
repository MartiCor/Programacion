package ProjecteCalculadora.UI;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicButtonUI;

import ProjecteCalculadora.Back.CalculadoraBackend;

public class ventana extends JFrame {

    private static final int UI_AMPLADA = 520;
    private static final int UI_ALTURA = 720;
    private static final int MARGE = 16;
    private static final int ENTRE_BOTONS_H = 8;
    private static final int ENTRE_BOTONS_V = 8;

    private static final int PANTALLA_ALT = 92;
    private static final int SEP_PANTALLA_TECLAT = 10;
    private static final int MARGE_INFERIOR = 20;

    private static final int RESERVA_AMPLADA_CLIENT = 8;
    private static final int RESERVA_ALÇADA_CLIENT = 52;

    private JTextField pantalla;
    private JTextField pantallaHistorial;

    public ventana() {
        this.setSize(UI_AMPLADA, UI_ALTURA);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("CALCULADORAAAAAA");
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.BLACK);
        this.getContentPane().add(panel);

        int ampleTeclat = UI_AMPLADA - 2 * MARGE - RESERVA_AMPLADA_CLIENT;

        pantallaHistorial = new JTextField("");
        pantallaHistorial.setBounds(MARGE, MARGE, ampleTeclat, 30);
        pantallaHistorial.setBackground(Color.BLACK);
        pantallaHistorial.setForeground(new Color(160, 160, 160)); // color gris claro
        pantallaHistorial.setCaretColor(Color.BLACK);
        pantallaHistorial.setHorizontalAlignment(SwingConstants.RIGHT);
        pantallaHistorial.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
        pantallaHistorial.setBorder(BorderFactory.createEmptyBorder(2, 12, 0, 16));
        pantallaHistorial.setOpaque(true);
        pantallaHistorial.setEditable(false);
        panel.add(pantallaHistorial);

        pantalla = new JTextField("0");
        pantalla.setBounds(MARGE, MARGE + 30, ampleTeclat, PANTALLA_ALT - 30);
        pantalla.setBackground(Color.BLACK);
        pantalla.setForeground(Color.WHITE);
        pantalla.setCaretColor(Color.WHITE);
        pantalla.setHorizontalAlignment(SwingConstants.RIGHT);
        pantalla.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 38));
        pantalla.setBorder(BorderFactory.createEmptyBorder(0, 12, 4, 16));
        pantalla.setOpaque(true);
        pantalla.setEditable(false);
        panel.add(pantalla);

        CalculadoraBackend backend = new CalculadoraBackend(pantalla, pantallaHistorial);

        afegirBotonsEnReixa(panel, backend);
    }

    private void afegirBotonsEnReixa(JPanel panel, CalculadoraBackend backend) {
        final int cols = 4;
        final int files = 5;

        int ampleTeclat = UI_AMPLADA - 2 * MARGE - RESERVA_AMPLADA_CLIENT;
        int amplada = (ampleTeclat - (cols - 1) * ENTRE_BOTONS_H) / cols;
        int pasX = amplada + ENTRE_BOTONS_H;
        int origenX = MARGE;

        int origenY = MARGE + PANTALLA_ALT + SEP_PANTALLA_TECLAT;
        int alcadaTeclat = UI_ALTURA - origenY - MARGE_INFERIOR - RESERVA_ALÇADA_CLIENT;
        int alcada = (alcadaTeclat - (files - 1) * ENTRE_BOTONS_V) / files;
        int pasY = alcada + ENTRE_BOTONS_V;

        String[][] teclas = {
                { "AC", "+/-", "%", "/" },
                { "7", "8", "9", "x" },
                { "4", "5", "6", "-" },
                { "1", "2", "3", "+" },
                { "\u232B", "0", ",", "=" },
        };

        for (int fila = 0; fila < teclas.length; fila++) {
            for (int col = 0; col < teclas[fila].length; col++) {
                String text = teclas[fila][col];
                JButton boto = "AC".equals(text) || "+/-".equals(text) ||
                        "%".equals(text) || text.equals("7") || text.equals("8") ||
                        text.equals("9") || text.equals("4") || text.equals("5") ||
                        text.equals("6") || text.equals("1") || text.equals("2") ||
                        text.equals("3") || text.equals("0") || text.equals(",") ||
                        text.equals("x") || text.equals("-") || text.equals("+") ||
                        text.equals("=") || text.equals("/") || text.equals("\u232B") ? new BotoAcCercle(text)
                                : new JButton(text);
                boto.setBounds(origenX + col * pasX, origenY + fila * pasY, amplada, alcada);
                boto.setActionCommand(text);
                if (text.equals("AC") || text.equals("+/-") || text.equals("%")) {
                    personalitzarBotoGris(boto);
                } else if (text.equals("7") || text.equals("8") || text.equals("9") || text.equals("4")
                        || text.equals("5") || text.equals("6") || text.equals("1") || text.equals("2")
                        || text.equals("3") || text.equals("0") || text.equals(",")) {
                    personalitzarBotoFosc(boto);
                } else if (text.equals("x") || text.equals("-") || text.equals("+") || text.equals("=")
                        || text.equals("\u232B") || text.equals("/")) {
                    personalitzarBotoTaronja(boto);
                } else {

                }
                panel.add(boto);
                registrarEfecteRatoli(boto);
                backend.asignarListener(boto);
            }
        }
    }

    /**
     * Ilumina una mica el fons en passar el ratolí i el fosc mentre el botó està
     * premut
     * (el model de Swing actualitza isPressed encara que es deixi anar fora del
     * botó).
     */
    private void registrarEfecteRatoli(JButton boto) {
        final Color base = boto.getBackground() != null ? boto.getBackground() : new Color(200, 200, 200);
        boto.setBackground(base);
        final boolean[] ratoliSobre = { false };
        ButtonModel model = boto.getModel();

        Runnable actualitzarFons = () -> {
            if (model.isPressed()) {
                boto.setBackground(base.darker());
            } else if (ratoliSobre[0]) {
                boto.setBackground(lleugeramentMesClar(base));
            } else {
                boto.setBackground(base);
            }
            boto.repaint();
        };

        model.addChangeListener(e -> actualitzarFons.run());

        boto.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                ratoliSobre[0] = true;
                actualitzarFons.run();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                ratoliSobre[0] = false;
                actualitzarFons.run();
            }
        });
    }

    private static Color lleugeramentMesClar(Color c) {
        float[] hsb = Color.RGBtoHSB(c.getRed(), c.getGreen(), c.getBlue(), null);
        return Color.getHSBColor(hsb[0], Math.max(0f, hsb[1] - 0.05f), Math.min(1f, hsb[2] + 0.1f));
    }

    private void personalitzarBotoGris(JButton boto) {
        Color grisClar = new Color(128, 128, 128);
        boto.setBackground(grisClar);
        boto.setForeground(Color.WHITE);
        boto.setFont(boto.getFont().deriveFont(Font.BOLD, 16f));
        boto.setFocusPainted(false);
        boto.setOpaque(false);
        boto.setContentAreaFilled(false);
        boto.setUI(new BasicButtonUI());
        Border marge = BorderFactory.createEmptyBorder(2, 2, 2, 2);
        boto.setBorder(marge);
    }

    private void personalitzarBotoFosc(JButton boto) {
        Color grisFosc = new Color(44, 44, 44);
        boto.setBackground(grisFosc);
        boto.setForeground(Color.WHITE);
        boto.setFont(boto.getFont().deriveFont(Font.BOLD, 16f));
        boto.setFocusPainted(false);
        boto.setOpaque(false);
        boto.setContentAreaFilled(false);
        boto.setUI(new BasicButtonUI());
        Border marge = BorderFactory.createEmptyBorder(2, 2, 2, 2);
        boto.setBorder(marge);
    }

    private void personalitzarBotoTaronja(JButton boto) {
        Color Taronja = new Color(255, 159, 10);
        boto.setBackground(Taronja);
        boto.setForeground(Color.WHITE);
        boto.setFont(boto.getFont().deriveFont(Font.BOLD, 16f));
        boto.setFocusPainted(false);
        boto.setOpaque(false);
        boto.setContentAreaFilled(false);
        boto.setUI(new BasicButtonUI());
        Border marge = BorderFactory.createEmptyBorder(2, 2, 2, 2);
        boto.setBorder(marge);
    }

    /**
     * Botó AC amb forma circular. El fons es pinta aquí (abans del text) perquè
     * un {@code Border} que omple el cercle es dibuixa després del text i el
     * tapava.
     */
    private static class BotoAcCercle extends JButton {

        BotoAcCercle(String text) {
            super(text);
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            int w = getWidth();
            int h = getHeight();
            int d = Math.min(w, h) - 1;
            int ox = (w - d) / 2;
            int oy = (h - d) / 2;

            g2.setColor(getBackground());
            g2.fill(new Ellipse2D.Float(ox, oy, d, d));
            g2.setColor(getBackground().darker());
            g2.draw(new Ellipse2D.Float(ox, oy, d, d));
            g2.dispose();

            super.paintComponent(g);
        }
    }
}