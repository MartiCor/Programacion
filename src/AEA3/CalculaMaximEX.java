package AEA3;

public class CalculaMaximEX {
    
    public static void main(String[] args) {
        int numMax = CalculaMaxim(7, 9);
        System.out.println(numMax);
        
    }

    public static int CalculaMaxim(int num1, int num2) {
        int max = num1;
        if (num2 > num1) {
            max = num2;
        }
        return max;
    }

}


