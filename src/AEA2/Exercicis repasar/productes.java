import java.util.Scanner;

public class productes {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int [] existencies = new int[15];
        int baixes = 0;

        for (int i = 0; i < existencies.length; i++) {
            System.out.println("Quantes existencies queden del producte " + (i+1));
            existencies[i] = a.nextInt();
            if (existencies[i] < 0) {
                System.out.println("Valor no vàlid");
                i--;
            } else {
                if (existencies[i]<5){
                    baixes = baixes + 1;
                }
            }
        }
    System.out.println("En total hi ha " + baixes + " productes amb menys de 5 existencies");
    }
}