import java.util.Scanner;

public class notes {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.println("Quantes notes vols introduir? ");
        int Qnotes = a.nextInt();
        while (Qnotes < 0) {
            System.out.println("Valor no vàlid, torna a introduir-lo");
            Qnotes = a.nextInt();
        }

        double[] nota = new double[Qnotes];
        boolean exc = false;
        int i= 0;

        for (i = 0; i < nota.length; i++) {
            System.out.println("Introdueix la nota " + (i+1));
            nota[i] = a.nextDouble();
            if (nota[i] == 10){
                exc = true;
            } else if (nota[i] < 0 || nota[i] > 10) {
                System.out.println("Nota no vàlida");
                i--;
            }
        }
    if (exc == true) {
        System.out.println("Sí, hi ha almenys un alumne amb un 10");
    } else {
        System.out.println("No, no hi ha cap alumne amb un 10");
    }
    }
}