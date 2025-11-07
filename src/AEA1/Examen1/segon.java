import java.util.Scanner;

public class segon {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int suspes = 0;
        int aprovat = 0;
        boolean excelent = false;
        double nota = 0;
        double sumaNotes = 0;
        double notaMax = 0;
        String alumne = "";
        String alumneMax = "";

        for (int i = 0; i < 5; i++) {
            System.out.println("Introdueix el nom de l'alumne:");
            alumne = a.nextLine();
            System.out.println("Introdueix la nota de l'alumne:");
            nota = a.nextDouble();
            a.nextLine(); 
            
            if (nota >= 0 && nota <= 10) {
                sumaNotes += nota;
                if (nota > notaMax) {
                    notaMax = nota;
                    alumneMax = alumne;
                }

                if (nota >= 5) {
                    aprovat++;
                    if (nota == 10) {
                        excelent = true;
                    }
                } else {
                    suspes++;
                }
            } else {
                System.out.println("Nota invàlida. Si us plau, introdueix una nota entre 0 i 10.");
                i--; 
            }
        }

        System.out.println("----Resultats----");
        System.out.println("Mitjana de les notes: " + (sumaNotes / 5));
        System.out.println("Nombre d'aprovats: " + aprovat);
        System.out.println("Nombre de suspesos: " + suspes);
        System.out.println("Alumne amb la nota més alta: " + alumneMax);
        if (excelent) {
            System.out.println("Hi ha almenys un alumne amb nota excel·lent (10): " + alumneMax);
        } else {
            System.out.println("No hi ha cap alumne amb un 10");
        }

    }
}