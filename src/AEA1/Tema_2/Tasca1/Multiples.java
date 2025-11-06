1import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.println("Fins a quin valor vols sumar multiples de 3? ");
        int lim = a.nextInt();
        int i = 0;
        int suma = 0;

        while (i < lim) {
            if(i%3 == 0){
                System.out.println(i);
                suma = suma + i;
            }
            i++;
        }
         System.out.println("La suma dels multiples és: " + suma);
    }
}