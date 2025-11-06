import java.util.Random;
import java.util.Scanner;

public class NumRandom{
    public static void main(String[] args) {

        
        int num_secret = (int) (Math.random() * 10 + 1);
        Scanner a = new Scanner(System.in);
        System.out.println("Endevina el valor entre 1 i 10.");
        int num_usuari = a.nextInt();
        int i = 2;
    

    if (num_secret != num_usuari) {
        while ( i != 0 && num_secret != num_usuari ) {
            System.out.println("Incorrecte, et queden " + i + " intents");
            i--;
            System.out.println("Endevina el valor entre 1 i 10.");
            num_usuari = a.nextInt();
             if (num_secret == num_usuari){
                System.out.println("Molt bé has encertat el numero");
             } else if (i==0) {
                    System.out.println("Incorrecte, t'has quedat sense intents");
                } else {}
        }
    } else {
        System.out.println("Molt bé has encertat el numero");
    }
  }
}