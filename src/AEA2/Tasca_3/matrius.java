import java.util.Scanner;

public class matrius{
    public static void main(String[] args){

        Scanner a = new Scanner(System.in);
        System.out.println("Introdueix cuantes files vols en la teva matriu: ");
        int i = a.nextInt();
        System.out.println("Introdueix cuantes columnes vols en la teva matriu: ");
        int j = a.nextInt();
        int [][] matriu = new int [i][j];
        int major = -999;
        int menor = 999;
        //int fila = matriu.length;
        //int columna = matriu[i].length;

        // System.out.println(fila);
        // System.out.println(columna);

        for (i = 0; i < matriu.length; i++) {
            for (j = 0; j < matriu[i].length; j++) {
                System.out.println("Quin valor vols en la fila " + i + " i en la columna "+ j);
                matriu[i][j] = a.nextInt();
                if (matriu [i][j] > major) {
                    major = matriu[i][j];
                }
                if (matriu[i][j] < menor) {
                    menor = matriu[i][j];
                } 
            }
        }
        System.out.println("------------");
        for (i = 0; i < matriu.length; i++) {
            for (j = 0; j < matriu[i].length; j++) {
                System.out.print(matriu[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("El nombre més gran de la matriu és: " + major);
        System.out.println("El nombre més petit de la matriu és: " + menor);
    }
}