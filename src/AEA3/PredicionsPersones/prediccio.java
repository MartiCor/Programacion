package AEA3.PredicionsPersones;

import java.util.Scanner;

public class prediccio {
    
    public String Prediccio(String mes, String nom, int edat) {
        int numSort = 0;
        String equipFutbol = "";
        String llenguatgeProgramacio = "";
        String a = "";
        boolean equivocat = false;

        if (mes.equals("Gener") || mes.equals("gener")) {
            numSort = edat * 3/2;
            equipFutbol = "Bayern de Munich";
            llenguatgeProgramacio = "C++";
        }
        else if (mes.equals("Febrer")|| mes.equals("febrer")){
            numSort = edat - 4;
            equipFutbol = "Atlético de Madrid";
            llenguatgeProgramacio = "Python";
        }
        else if (mes.equals("Marc")|| mes.equals("marc")){
            numSort = edat / 2;
            equipFutbol = "Chelsea";
            llenguatgeProgramacio = "JavaScript";
        }
        else if (mes.equals("Abril")|| mes.equals("abril")){
            numSort = edat % 4;
            equipFutbol = "Manchester city";
            llenguatgeProgramacio = "Node.js";
        }
        else if (mes.equals("Maig")|| mes.equals("maig")){
            numSort = edat * 3/6;
            equipFutbol = "Liverpool";
            llenguatgeProgramacio = "React";
        }
        else if (mes.equals("Juny")|| mes.equals("juny")){
            numSort = edat + edat;
            equipFutbol = "Real Madrid";
            llenguatgeProgramacio = "C#";
        }
        else if (mes.equals("Juliol")|| mes.equals("juliol")){
            numSort = edat * edat / 5;
            equipFutbol = "BVB";
            llenguatgeProgramacio = "Swift";
        }
        else if (mes.equals("Agost")|| mes.equals("agost")){
            numSort = edat * 1/2 * edat;
            equipFutbol = "FCB";
            llenguatgeProgramacio = "Java";
        }
        else if (mes.equals("Setembre")|| mes.equals("setembre")){
            numSort = edat / edat;
            equipFutbol = "Juve";
            llenguatgeProgramacio = "PHP";
        }
        else if (mes.equals("Octubre")|| mes.equals("octubre")){
            numSort = edat * 4 / 3;
            equipFutbol = "PSG";
            llenguatgeProgramacio = "R";
        }
        else if (mes.equals("Novembre")|| mes.equals("novembre")){
            numSort = edat % 2 + 23;
            equipFutbol = "Sevilla CF";
            llenguatgeProgramacio = "Go";
        }
        else if (mes.equals("Desembre")|| mes.equals("desembre")){
            numSort = (edat + edat) / 2;
            equipFutbol = "Manchester United";
            llenguatgeProgramacio = "Ruby";
        }
        else {
            equivocat = true;
        }
        
        if (equivocat) {
            a = "T'has equivocat escribint el teu més de naixement, torna-ho a intentar";
        } else {
            a = "Segons les dades introduiedes el teu numero de la sort és " + numSort + ", el teu equipo de Futbol és " + equipFutbol + "i el teu llenguatge de programacio preferit és " + llenguatgeProgramacio + ".";
        }
        return a;
    }
}
