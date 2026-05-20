package ProjecteCalculadora.Back;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

public class CalculadoraBackend {

    private final JTextField pantalla;
    private final JTextField pantallaHistorial;
    
    private String primerOperandoStr = "0";
    private String operador = "";
    private String segundoOperandoStr = "";
    private String historialStr = "";
    private boolean nuevoNumero = true;

    public CalculadoraBackend(JTextField pantalla, JTextField pantallaHistorial) {
        this.pantalla = pantalla;
        this.pantallaHistorial = pantallaHistorial;
    }

    /**
     * Este método recibe un botón, mira su texto y le asigna 
     * su listener individual y personalizado.
     */
    public void asignarListener(JButton boto) {
        String texto = boto.getText();

        // 1. LISTENERS PARA NÚMEROS Y COMA
        if ((texto.charAt(0) >= '0' && texto.charAt(0) <= '9') || texto.equals(",")) {
            boto.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (primerOperandoStr.equals("Error")) {
                        primerOperandoStr = "0";
                        nuevoNumero = true;
                    }
                    if (historialStr.endsWith("=")) {
                        historialStr = "";
                    }
                    if (operador.isEmpty()) {
                        if (nuevoNumero) {
                            primerOperandoStr = texto.equals(",") ? "0," : texto;
                            nuevoNumero = false;
                        } else {
                            if (texto.equals(",") && primerOperandoStr.contains(",")) return;
                            primerOperandoStr += texto;
                        }
                    } else {
                        if (nuevoNumero) {
                            segundoOperandoStr = texto.equals(",") ? "0," : texto;
                            nuevoNumero = false;
                        } else {
                            if (texto.equals(",") && segundoOperandoStr.contains(",")) return;
                            segundoOperandoStr += texto;
                        }
                    }
                    actualitzarPantalla();
                }
            });
        }
        // 2. LISTENER PARA EL BOTÓN "AC"
        else if (texto.equals("AC")) {
            boto.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    primerOperandoStr = "0";
                    operador = "";
                    segundoOperandoStr = "";
                    historialStr = "";
                    nuevoNumero = true;
                    actualitzarPantalla();
                }
            });
        }
        // 3. LISTENER PARA EL BOTÓN "+/-"
        else if (texto.equals("+/-")) {
            boto.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (primerOperandoStr.equals("Error")) return;

                    if (historialStr.endsWith("=")) {
                        historialStr = "";
                    }

                    if (!operador.isEmpty() && !segundoOperandoStr.isEmpty()) {
                        double val = parseDouble(segundoOperandoStr) * -1;
                        segundoOperandoStr = formatDouble(val);
                    } else if (operador.isEmpty()) {
                        double val = parseDouble(primerOperandoStr) * -1;
                        primerOperandoStr = formatDouble(val);
                    }
                    actualitzarPantalla();
                }
            });
        }
        // 4. LISTENER PARA EL BOTÓN "%"
        else if (texto.equals("%")) {
            boto.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (primerOperandoStr.equals("Error")) return;

                    if (historialStr.endsWith("=")) {
                        historialStr = "";
                    }

                    if (!operador.isEmpty() && !segundoOperandoStr.isEmpty()) {
                        double val = parseDouble(segundoOperandoStr) / 100;
                        segundoOperandoStr = formatDouble(val);
                        nuevoNumero = true;
                    } else if (operador.isEmpty()) {
                        double val = parseDouble(primerOperandoStr) / 100;
                        primerOperandoStr = formatDouble(val);
                        nuevoNumero = true;
                    }
                    actualitzarPantalla();
                }
            });
        }
        // 5. LISTENER PARA EL BOTÓN "DEL"
        else if (texto.equals("\u232B")) {
            boto.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (primerOperandoStr.equals("Error")) {
                        primerOperandoStr = "0";
                        historialStr = "";
                        nuevoNumero = true;
                        actualitzarPantalla();
                        return;
                    }

                    if (historialStr.endsWith("=")) {
                        historialStr = "";
                    }

                    if (nuevoNumero && !operador.isEmpty() && segundoOperandoStr.isEmpty()) {
                        // Cancelar la operación activa y mantener el primer operando editable
                        operador = "";
                        historialStr = "";
                        nuevoNumero = false;
                    } else if (!operador.isEmpty()) {
                        // Borrar el último dígito del segundo operando
                        if (!segundoOperandoStr.isEmpty()) {
                            segundoOperandoStr = segundoOperandoStr.substring(0, segundoOperandoStr.length() - 1);
                            if (segundoOperandoStr.isEmpty() || segundoOperandoStr.equals("-")) {
                                segundoOperandoStr = "";
                                nuevoNumero = true;
                            } else {
                                nuevoNumero = false;
                            }
                        }
                    } else {
                        // Borrar el último dígito del primer operando
                        if (!primerOperandoStr.equals("0")) {
                            primerOperandoStr = primerOperandoStr.substring(0, primerOperandoStr.length() - 1);
                            if (primerOperandoStr.isEmpty() || primerOperandoStr.equals("-")) {
                                primerOperandoStr = "0";
                                nuevoNumero = true;
                            } else {
                                nuevoNumero = false;
                            }
                        }
                    }
                    actualitzarPantalla();
                }
            });
        }
        // 6. LISTENER PARA EL BOTÓN "="
        else if (texto.equals("=")) {
            boto.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (primerOperandoStr.equals("Error")) return;

                    if (!operador.isEmpty() && !segundoOperandoStr.isEmpty()) {
                        realizarCalculo();
                    }
                }
            });
        }
        // 7. LISTENERS INDIVIDUALES PARA LOS OPERADORES (+, -, X, /)
        else {
            boto.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (primerOperandoStr.equals("Error")) return;

                    if (!operador.isEmpty()) {
                        if (!segundoOperandoStr.isEmpty()) {
                            realizarCalculoIntermedio(texto);
                        } else {
                            // Cambiar operador activo
                            operador = texto;
                            historialStr = primerOperandoStr + " " + operador;
                        }
                    } else {
                        operador = texto;
                        historialStr = primerOperandoStr + " " + operador;
                        nuevoNumero = true;
                    }
                    actualitzarPantalla();
                }
            });
        }
    }

    // --- Métodos de operaciones matemáticas auxiliares ---

    private void actualitzarPantalla() {
        if (operador.isEmpty()) {
            pantallaHistorial.setText(historialStr);
            pantalla.setText(primerOperandoStr);
        } else {
            if (segundoOperandoStr.isEmpty()) {
                pantallaHistorial.setText(primerOperandoStr + " " + operador);
                pantalla.setText(primerOperandoStr);
            } else {
                pantallaHistorial.setText(primerOperandoStr + " " + operador + " " + segundoOperandoStr);
                pantalla.setText(segundoOperandoStr);
            }
        }
    }

    private void realizarCalculo() {
        try {
            double op1 = parseDouble(primerOperandoStr);
            double op2 = parseDouble(segundoOperandoStr);
            double result = calcularValores(op1, operador, op2);
            historialStr = primerOperandoStr + " " + operador + " " + segundoOperandoStr + " =";
            primerOperandoStr = formatDouble(result);
            operador = "";
            segundoOperandoStr = "";
            nuevoNumero = true;
        } catch (ArithmeticException e) {
            primerOperandoStr = "Error";
            operador = "";
            segundoOperandoStr = "";
            historialStr = "";
            nuevoNumero = true;
        }
        actualitzarPantalla();
    }

    private void realizarCalculoIntermedio(String newOperator) {
        try {
            double op1 = parseDouble(primerOperandoStr);
            double op2 = parseDouble(segundoOperandoStr);
            double result = calcularValores(op1, operador, op2);
            primerOperandoStr = formatDouble(result);
            operador = newOperator;
            segundoOperandoStr = "";
            historialStr = primerOperandoStr + " " + operador;
            nuevoNumero = true;
        } catch (ArithmeticException e) {
            primerOperandoStr = "Error";
            operador = "";
            segundoOperandoStr = "";
            historialStr = "";
            nuevoNumero = true;
        }
        actualitzarPantalla();
    }

    private double calcularValores(double op1, String op, double op2) throws ArithmeticException {
        switch (op) {
            case "+" -> { return op1 + op2; }
            case "-" -> { return op1 - op2; }
            case "x" -> { return op1 * op2; }
            case "/" -> {
                if (op2 == 0) {
                    throw new ArithmeticException("Error");
                }
                return op1 / op2;
            }
            default -> { return op1; }
        }
    }

    private double parseDouble(String str) {
        try {
            return Double.parseDouble(str.replace(",", "."));
        } catch (Exception e) {
            return 0;
        }
    }

    private String formatDouble(double res) {
        if (res == (long) res) {
            return String.valueOf((long) res);
        } else {
            return String.valueOf(res).replace(".", ",");
        }
    }
}