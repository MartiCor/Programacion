package AEA3.Tasca2;

import java.util.Scanner;

public class SeleccionarFigura {
    public String Figura() {
        Scanner a = new Scanner(System.in);
        String figura = a.nextLine();
        String escollit = "";
        if (figura.equals("triangle")) {
            escollit = figura; 
        } else if(figura.equals("rectangle")) {
            escollit = figura;
        } else if(figura.equals("quadrat")) {
            escollit = figura;
        } else if(figura.equals("trapezi")) {
            escollit = figura;
        } else if(figura.equals("rombe")) {
            escollit = figura;
        } else if(figura.equals("paralelogram"))  {
            escollit = figura;
        } else if(figura.equals("cercle")) {
            escollit = figura;
        } else {
            escollit = "incorrecte";
        } 
    return escollit;
    }
}