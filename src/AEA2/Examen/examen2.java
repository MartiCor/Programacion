import java.util.Scanner;

public class examen2 {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.println("Introdueix la longitud del vector");
        int i = a.nextInt();
        int [] array = new int[i];
        boolean trobat = false;
        int usuari = 0;
        int posicion = -1;

        for (i = 0; i < array.length; i++) {
            System.out.println("Introdueix el valor de la posició " + i);
            array[i] = a.nextInt();
        }
        System.out.println("Introdueix el valor a buscar: ");
        usuari = a.nextInt();

        for (i = 0; i < array.length; i++) {
            if (usuari == array[i]){
                trobat = true;
                posicion = i;
                break;
            }
        }

        if (trobat) {
            System.out.println("El valor " + usuari + " s'ha trobat en la posició " + posicion);
        } else {
            System.out.println("No s'ha trobat el valor " + usuari + " en el vector");
        }
    }
}