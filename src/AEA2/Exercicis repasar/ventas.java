import java.util.Scanner;
import java.util.Arrays;

public class ventas {
    public static void main (String[] args) {

        Scanner a = new Scanner(System.in);
        double [] venta = new double[10];
        double Pmax = -1;
        double Pmen = 9999;
        double mitjana = 0;
        double total = 0;
        

        for (int i = 0; i < venta.length; i++) {
            System.out.println("Introdueix el preu de la venta " + (i+1));
            venta[i] = a.nextDouble();
            if (venta[i] >= 0){
                total += venta[i];
                if (venta[i] > Pmax) {
                    Pmax = venta[i];
                }
                if (venta[i] < Pmen) {
                    Pmen = venta[i];
                }
            } else {
                System.out.println("Preu no vàlid");
                i--;
            }
        }
        Arrays.sort(venta);
        for (int i = venta.length-1; i>=0; i--) {
            System.out.print(venta[i]+ " ");
        }
        System.out.println();
        mitjana = total/10;
        System.out.println("El preu mitja ha estat: " + mitjana);
        System.out.println("El preu més gran ha estat: " + Pmax);
        System.out.println("El preu més petit ha estat: " + Pmen);
    }
}