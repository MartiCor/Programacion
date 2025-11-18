import java.util.Scanner;

public class encuesta {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int [] valoracio = new int[20];
        int exc = 0;
        int sus = 0;

        for (int i = 0; i < valoracio.length; i++) {
            System.out.println("Quina és la valoració de la persona "+ (i+1));
            valoracio[i] = a.nextInt();
            if (valoracio[i] < 0 || valoracio[i] > 5){
                System.out.println("Nota no vàlida");
                i--;
            } else {
                if (valoracio[i] == 5) {
                    exc = exc + 1;
                }
                if (valoracio[i] < 3) {
                    sus = sus + 1;
                }
            }   
        }
    System.out.println("La quantitat de 5 ha estat: " + exc);
    System.out.println("La quantitat de valoraciones més baixes de 3 ha estat: " + sus);
    }
}