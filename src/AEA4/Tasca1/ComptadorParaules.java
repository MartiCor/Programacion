package AEA4.Tasca1;

import java.util.Scanner;
import java.io.File;
import java.io.PrintStream;

public class ComptadorParaules {
    public static void main(String[] args) throws Exception {

        File f = new File("C:/Users/marti/Documents/GitHub repo/Programacion/src/AEA4/Tasca1/entrada.txt");
        String a = llegirFitxer(f);
        int paraules = contarParaules(a);
        System.out.println(paraules);

        escriure(paraules);

    }

    public static String llegirFitxer(File Doc) {
        String MARCA_FI = ".";
        if (!Doc.exists()) {
            String noTrobat = "Missatge informatiu: L'arxiu '" + Doc.getPath() + "' no s'ha trobat.";
            return noTrobat;
        }
        try {
            Scanner a = new Scanner(Doc);
            String texto = "";
            boolean llegir = true;
            while (llegir && a.hasNext()) {
                String paraula = a.next();
                if (MARCA_FI.equals(paraula)) {
                    llegir = false;
                } else {
                    texto = texto + paraula + " ";
                }
            }
            a.close();
            return texto;
        } catch (Exception e) {
            String error = ("Error: " + e);
            return error;
        }
    }

    public static int contarParaules(String text) {
        try {
            String[] paraules = text.trim().split(" ");
            return paraules.length;

        } catch (Exception e) {
            System.out.println("Error: " + e);
            return 0;
        }
    }

    public static void escriure(int paraules) {
        try {
            // PrintStream crea l'arxiu si no existeix, i el sobreescriu si ja existeix
            File arxiuSortida = new File(
                    "C:/Users/marti/Documents/GitHub repo/Programacion/src/AEA4/Tasca1/sortida.txt");
            PrintStream escriptor = new PrintStream(arxiuSortida);

            // Escrivim la dada
            escriptor.println("El arxiu té " + paraules + " palabras.");
            System.out
                    .println("Procés finalitzat. S'ha sobreescrit o creat l'arxiu: '" + arxiuSortida.getPath() + "'.");
            escriptor.close();

        } catch (Exception e) {
            System.out.println("Error escrivint l'arxiu: " + e);
        }
    }
}
