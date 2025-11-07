import java.util.Scanner;

public class primer{
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        double preuProducte = 0;
        double DesMax = 15;
        double total = 0;

        for (int i = 0; i<5; i++) {
            System.out.println("Introdueix el preu del producte " + (i+1) + ": ");
            preuProducte = a.nextDouble();
            if (preuProducte < 0) {
                System.out.println("El preu no és vàlid");
                i--;
            } else {
                if (preuProducte > 50) {
                    double descompte = (preuProducte*6/100);
                    if (descompte > DesMax) {
                        descompte = DesMax;
                    }
                preuProducte = preuProducte - descompte;  
                }
            System.out.println("El preu del producte " + (i+1) + " és: " + preuProducte);
            total = total + preuProducte;    
            }
        }
        System.out.println("El preu total és: " + total);
    }
}