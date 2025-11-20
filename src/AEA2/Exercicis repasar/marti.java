import java.util.Scanner;
import java.util.Arrays;

public class marti {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int[] array = new int[10];
        int total = 0;




        for (int i = 0; i < array.length; i++) {
            System.out.println("Introdueix el preu del producte " + (i+1));
            if (!a.hasNextInt()) {
                System.out.println("No és un valor vàlid");
                a.next();
                i--;
                continue;
            } else {
                array[i] = a.nextInt();
                if (array[i] < 0 ){
                    System.out.println("Nota no vàlida");
                    i--;
                } else {
                    total += array[i];
                }
            }
        }

        int maxim = array[0];
        int minim = array[0];
        double mitjana = (double)total/array.length;
        System.out.println(mitjana);
        System.out.println(total);
        System.out.println(array.length);
        for (int i = 0; i<array.length; i++) {
            if (array[i] > maxim) {
                maxim = array[i];
            }
            if (array[i] < minim) {
                minim = array[i];
            }
        }

        Arrays.sort(array);
        System.out.println(mitjana);
        System.out.println("La nota mitjana és: " + mitjana);
        System.out.println("La nota mínima és: " + minim);
        System.out.println("La nota màxima és: " + maxim);

        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}