import java.util.Scanner;

public class temperatura {
    public static void main(String[] args){

        Scanner a = new Scanner(System.in);
        double [] notes = new double[7];
        double suma_temp = 0;

        for (int i = 0; i<notes.length; i++){
            System.out.println("Introdueix la temperatura del dia " + (i+1) + ": ");
            notes[i] = a.nextDouble();
            suma_temp = suma_temp + notes[i];
        }
    System.out.println("La temperatura mitja d'aquests dies ha estat: " + (suma_temp/7));
    }
}