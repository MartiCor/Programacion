import java.util.Scanner;

public class taula {
    public static void main(String[] args) {

    Scanner a = new Scanner(System.in);
    System.out.println("Quina taula de multiplicar vols? ");
    int taula = a.nextInt();
    int i = 10;

        while (i > 0) {
            int resultat = i*taula;
            System.out.println(i + " * " + taula + " = " + resultat);
            i--;
        }
    System.out.println("Aquesta es la taula del " + taula + " al reves");
  }
}