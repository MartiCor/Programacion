import java.util.Scanner;

public class suspes {
    public static void main(String [] args) {

        Scanner a = new Scanner(System.in);
        System.out.println("Quantes notes vols introduir? ");
        int Qnotes = a.nextInt();
        while (Qnotes <= 0 ) {
            System.out.println("Valor no vàlid, tora a introduir-lo: ");
            Qnotes = a.nextInt();
        }

        double[] nota = new double[Qnotes];
        int i = 0;
        boolean suspes = false;

        for (i = 0; i < nota.length; i++) {
            System.out.println("Introdueix la nota: " + (i+1));
            nota[i] = a.nextDouble();
            if (nota[i] < 5 && nota[i] >= 0){
                suspes = true;
                break;
            } else if (nota[i] < 0 || nota[i] > 10 ){
                System.out.println("La nota no es valida.");
                i--;
            }
        }
        if (suspes) {
            System.out.println("Almenys un alumne ha suspès");
        } else {
            System.out.println("Cap alumne ha suspès");
        }
    }
}