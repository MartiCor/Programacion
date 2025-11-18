import java.util.Scanner;

public class partit {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int [] gols = new int[12];
        int total = 0;
        double mitjana = 0;
        int MesGols = -1;

        for (int i = 0; i < gols.length; i++) {
            System.out.println("Quans gols ha tingut el partit " + (i+1));
            gols[i] = a.nextInt();
            if (gols[i] > 0) {
                if (gols[i] > MesGols) {
                    MesGols = gols[i];
                }
                total = total + gols[i];
            } else {
                System.out.println("Valor no vàlid");
                i--;
            }
        }
    mitjana = total/12;
    System.out.println("La quantitat total de gols ha estat : " + total);
    System.out.println("La quantitat mitjana de gols ha estat: " + mitjana);
    System.out.println("El partit amb més gols ha tingut un total de " + MesGols + " gols");
    }
}