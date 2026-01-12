import java.util.Scanner;

public class examen{
    public static void main (String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.println("Introdueix la longitud dels vectors");
        int i = a.nextInt();
        int [] vector = new int[i];
        int [] vector2 = new int[i];
        int [] suma = new int[i];


        System.out.println("Introdueix els valors del primer vector");
        for (i = 0; i < vector.length; i++) {
            System.out.println("Introdueix el valor de la posicio " + i + " del vector 1:");
            vector[i] = a.nextInt();
        }
        System.out.println("Introdueix els valors del segon vector");
        for (i = 0; i < vector2.length; i++) {
            System.out.println("Introdueix el valor de la posicio " + i + " del vector 2:");
            vector2[i] = a.nextInt();
        }
        System.out.println("La suma dels vectors és la següent");
        for (i = 0; i < vector.length; i++) {
            suma[i] = vector[i] + vector2[i];
            System.out.print(suma[i] + " ");
        }       
    }
}
