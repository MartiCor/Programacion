import java.util.Scanner;

public class canciones {
    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        int [] segundos = new int[20];
        double media = 0;
        int total = 0;
        int larga = -1;

        for (int i = 0; i < segundos.length; i++) {
            System.out.println("Quants segons té la cançó "+ (i+1));
            segundos[i] = a.nextInt();
            if (segundos[i] > 0) {
                if (segundos[i] > larga) {
                    larga = segundos[i];
                }
                total = total + segundos[i];
            } else {
                System.out.println("Valor no vàlid");
                i--;
            }
        }
        media = total/20;
        System.out.println("La cançó més llarga dura " + larga + " segons");
        System.out.println("La duració total de totes les cançons és: " + total + " segons");
        System.out.println("La mitjana de totes les cançons és: " + media + " segons");
    }
}