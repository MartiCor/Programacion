import java.util.Scanner;

public class taula {
    public static void main(String[] args) {


        Scanner a = new Scanner(System.in);
        System.out.println("Fins a quina taula de multiplicar vols conèixer?");
        int taules = a.nextInt();
        int i = 1;
        int j = 1;
        int multiplicacio = 0;
    
        while (i <= taules) {
            while (j <= 10) {
                multiplicacio = i * j;
                System.out.println(i + " x " + j + " = " + multiplicacio);
                j++;
            }
        System.out.println("--------------------------");
        i++;
        j = 1; 
        }
    }
}