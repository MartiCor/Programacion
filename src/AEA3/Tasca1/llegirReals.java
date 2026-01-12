package AEA3.Tasca1;
import java.util.Scanner;

public class llegirReals {
    
    public static void main(String[] args) {
        llegirReals programa = new llegirReals();
        programa.inici();
    }

    public void inici() {
    System.out.println("LLegiu un numero real per teclat");
    Double Num = LlegirNum();
    System.out.println("El nombre real es el següent: " + Num);
    System.out.println("Llegiu un altre enter pel teclat");
    Num = LlegirNum();
    System.out.println("El segon nombre és: "+ Num);

    }

    public double LlegirNum() {
        Scanner a = new Scanner(System.in);
        double Real = 0;
        boolean llegit = false;
        while (!llegit) {
            llegit = a.hasNextDouble();
            if (llegit) {
                Real = a.nextDouble();
            }
            else {
                System.out.println("Numero no valid, torna-ho a intentar");
                a.next();
            }
        }
        a.nextLine();
        return Real;
    }
}
