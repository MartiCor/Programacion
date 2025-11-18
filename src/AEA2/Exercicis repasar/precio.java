import java.util.Scanner;

public class precio {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        double [] preu = new double[25];
        double preuMax = -1;
        double preuMin = 999999;
        double mitjana = 0;
        int grans = 0;
        double total = 0;

        for (int i = 0; i < preu.length; i++){
            System.out.println("Introdueix el preu del producte " + (i + 1));
            preu[i] = a.nextDouble();
            if (preu[i] > 0) {
                if (preu[i] > preuMax) {
                    preuMax = preu[i];
                }
                if (preu[i] < preuMin) {
                    preuMin = preu[i];
                }
                if (preu[i] > 10) {
                    grans = grans + 1;
                }
                total = total + preu[i];
            } else {
                System.out.println("Preu no vàlid");
                i--;
            }
        }
        mitjana = total/25;
        System.out.println("El preu més gran és: " + preuMax);
        System.out.println("El preu més petit és: " + preuMin);
        System.out.println("El preu mitja és: " + mitjana);
        System.out.println("Hi ha un total de " + grans + " productes que costen més de 10 euros");      
    }
}