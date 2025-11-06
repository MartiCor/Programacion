import java.util.Scanner;

public class mitjana{
    public static void main(String[] args){

        Scanner a = new Scanner(System.in);
        System.out.println("Quants valors vols introduir? ");
        int Qnotes = a.nextInt();
        while (Qnotes < 0) {
            System.out.println("Valor no vàlid, torn a introduir-lo: ");
            Qnotes = a.nextInt();
        }

        double[] notes = new double[Qnotes];
        double suma = 0;
        int i = 0;
    
        for(i = 0; i < notes.length; i++) {
            System.out.println("Introdueix la nota " + (i+1));
            notes[i] = a.nextDouble();
            if (notes[i] >= 0 || notes[i] <= 10){
                suma = suma + notes[i];
            } else {
                System.out.println("La nota no es valida");
                i--;
            }
        }
        System.out.println("La nota mitjana és " + suma/Qnotes);    
    }
}