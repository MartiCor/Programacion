package AEA3.Tasca2;

import java.util.Scanner;

public class recollirDades {
    
    public double dada() {
        Scanner a = new Scanner(System.in);
        double dato = 0;
        while (!a.hasNextDouble()) {
            System.out.println("valor no vàlid");
            a.next();
            
        }
        dato = a.nextDouble();
        return dato;
    }
}
