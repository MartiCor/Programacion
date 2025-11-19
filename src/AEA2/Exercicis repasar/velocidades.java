import java.util.Scanner;

public class velocidades {
    public static void main (String[] args) {

        Scanner a = new Scanner(System.in);
        double [] velocidad = new double[5];
        double Vmax = 0;
        int limite = 0;
        double mitjana = 0;
        double total = 0;

        for (int i = 0; i < velocidad.length; i++) {
            System.out.println("Introdueix la velocitat del vehícle " + (i+1));
            velocidad[i] = a.nextDouble();
            if (velocidad[i] >= 0) {
                total += velocidad[i];
                if (velocidad[i] > Vmax) {
                    Vmax = velocidad[i];
                }
                if (velocidad[i] > 90) {
                    limite++;
                }
            } else {
                System.out.println("Velocitat no vàlida");
                i--;
            }
        }
        mitjana = total/5;
        System.out.println("La mitjana de velocitats és: " + mitjana);
        System.out.println("La velocitat màxima ha estat: " + Vmax);
        System.out.println("Hi ha un total de " + limite + " cotxes que han superat els 90 km/h");
    }
}