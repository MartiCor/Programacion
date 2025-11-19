import java.util.Scanner;

public class notas {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        double [] nota = new double[30];
        int aprovats = 0;
        int suspesos = 0;
        double mitja = 0;
        double Millor = -1;
        double Pitjor = 11;
        double total = 0;

        for (int i = 0; i < nota.length; i++) {
            System.out.println("Introdueix la nota " +(i+1));
            nota[i] = a.nextDouble();
            if (nota[i] >= 0 && nota[i] <= 10) {
                total = total + nota[i];
                if (nota[i] > Millor) {
                    Millor = nota[i];
                }
                if (nota[i] < Pitjor) {
                    Pitjor = nota[i];
                }
                if (nota[i] >= 5) {
                    aprovats = aprovats + 1;
                } else {
                    suspesos = suspesos + 1;
                }
            } else {
                System.out.println("Nota no vàlida");
                i--;
            }
        }
        mitja = total/30;
        System.out.println("La nota mitjana és: " + mitja);
        System.out.println("La nota més alta és: " + Millor);
        System.out.println("La nota més baixa és: " + Pitjor);
    }
}