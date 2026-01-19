package AEA3.PredicionsPersones;

public class prediccions {
    
    public String equip(String mes, String nom, int edat) {
        String equipFutbol = "";

        if (mes.equals("Gener") || mes.equals("gener")) {
            equipFutbol = "Bayern de Munich";
        }
        else if (mes.equals("Febrer")|| mes.equals("febrer")){
            equipFutbol = "Atlético de Madrid";
        }
        else if (mes.equals("Marc")|| mes.equals("marc")){
            equipFutbol = "Chelsea";
        }
        else if (mes.equals("Abril")|| mes.equals("abril")){
            equipFutbol = "Manchester city";
        }
        else if (mes.equals("Maig")|| mes.equals("maig")){
            equipFutbol = "Liverpool";
        }
        else if (mes.equals("Juny")|| mes.equals("juny")){
            equipFutbol = "Real Madrid";
        }
        else if (mes.equals("Juliol")|| mes.equals("juliol")){
            equipFutbol = "BVB";
        }
        else if (mes.equals("Agost")|| mes.equals("agost")){
            equipFutbol = "FCB";
        }
        else if (mes.equals("Setembre")|| mes.equals("setembre")){
            equipFutbol = "Juve";
        }
        else if (mes.equals("Octubre")|| mes.equals("octubre")){
            equipFutbol = "PSG";
        }
        else if (mes.equals("Novembre")|| mes.equals("novembre")){
            equipFutbol = "Sevilla CF";
        }
        else if (mes.equals("Desembre")|| mes.equals("desembre")){
            equipFutbol = "Manchester United";
        }
        else {
            equipFutbol = "incorrecte";
        }
        return equipFutbol;
    }
    
    public String llenguatge(String mes, String nom, int edat) {
        String llenguatgeProgramacio = "";

        if (mes.equals("Gener") || mes.equals("gener")) {
            llenguatgeProgramacio = "C++";
        }
        else if (mes.equals("Febrer")|| mes.equals("febrer")){
            llenguatgeProgramacio = "Python";
        }
        else if (mes.equals("Marc")|| mes.equals("marc")){
            llenguatgeProgramacio = "JavaScript";
        }
        else if (mes.equals("Abril")|| mes.equals("abril")){
            llenguatgeProgramacio = "Node.js";
        }
        else if (mes.equals("Maig")|| mes.equals("maig")){
            llenguatgeProgramacio = "React";
        }
        else if (mes.equals("Juny")|| mes.equals("juny")){
            llenguatgeProgramacio = "C#";
        }
        else if (mes.equals("Juliol")|| mes.equals("juliol")){
            llenguatgeProgramacio = "Swift";
        }
        else if (mes.equals("Agost")|| mes.equals("agost")){
            llenguatgeProgramacio = "Java";
        }
        else if (mes.equals("Setembre")|| mes.equals("setembre")){
            llenguatgeProgramacio = "PHP";
        }
        else if (mes.equals("Octubre")|| mes.equals("octubre")){
            llenguatgeProgramacio = "R";
        }
        else if (mes.equals("Novembre")|| mes.equals("novembre")){
            llenguatgeProgramacio = "Go";
        }
        else if (mes.equals("Desembre")|| mes.equals("desembre")){
            llenguatgeProgramacio = "Ruby";
        }
        else {
            llenguatgeProgramacio = "a";
        }
        return llenguatgeProgramacio;
    }

    public int num(String mes, String nom, int edat) {
        int num = 0;

        if (mes.equals("Gener") || mes.equals("gener")) {
            num = edat * 3/2;
        }
        else if (mes.equals("Febrer")|| mes.equals("febrer")){
            num = edat - 4;
        }
        else if (mes.equals("Marc")|| mes.equals("marc")){
            num = edat / 2;
        }
        else if (mes.equals("Abril")|| mes.equals("abril")){
            num = edat % 4;
        }
        else if (mes.equals("Maig")|| mes.equals("maig")){
            num = edat * 3/6;
        }
        else if (mes.equals("Juny")|| mes.equals("juny")){
            num = edat + edat;
        }
        else if (mes.equals("Juliol")|| mes.equals("juliol")){
            num = edat * edat / 5;
        }
        else if (mes.equals("Agost")|| mes.equals("agost")){
            num = edat * 1/2 * edat;
        }
        else if (mes.equals("Setembre")|| mes.equals("setembre")){
            num = edat / edat;
        }
        else if (mes.equals("Octubre")|| mes.equals("octubre")){
            num = edat * 4 / 3;
        }
        else if (mes.equals("Novembre")|| mes.equals("novembre")){
            num = edat % 2 + 23;
        }
        else if (mes.equals("Desembre")|| mes.equals("desembre")){
            num = (edat + edat) / 2;
        }
        else {
            num = 0;
        }
        return num;
    }

}
