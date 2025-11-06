import java.util.Scanner;

public class menu {
    public static void main(String[] args){

        Scanner a = new Scanner(System.in);
        int num_menu = 1;

        while (num_menu <=3 && num_menu >=1) {
            System.out.println("1. Mostrar missatge de benvinguda.");
            System.out.println("2. Mostrar la data actual.");
            System.out.println("3. Realitzar una suma.");
            System.out.println("4. Sortir del Sistema.");
            System.out.println("Tria una opció");
            num_menu = a.nextInt();

            if (num_menu >= 1 && num_menu <= 4) {
                if (num_menu != 4) {
                    if (num_menu == 1){
                        System.out.println("Benvingut al programa"); 
                        System.out.println("-------------------------");
                    } else if (num_menu == 2) {
                        System.out.println("La data és: 02/03/2007");
                        System.out.println("-------------------------");
                    } else if (num_menu == 3) {
                        System.out.println("Introdueix el primer numero de la suma:");
                        int num_suma = a.nextInt();
                        System.out.println("Introdueix el segon numero de la suma:");
                        int num_suma2 = a.nextInt();
                        int suma = num_suma + num_suma2;
                        System.out.println(num_suma + " + " + num_suma2 + " = " + suma);
                        System.out.println("-------------------------");
                    }
                }
                if (num_menu == 4) {
                System.out.println("Gràcies per utilitzar el programa, fins aviat.");
                }
            } else {
                System.out.println("Numero no valid.");
            }
        }
    }
}