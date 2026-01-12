package AEA3.Tasca1;

public class imprimirChars {

    public static void main(String[] args) {
        imprimirChar('*', 5);
        imprimirChar('#', 3);
        imprimirChar('A', 4);
    }

    public static void imprimirChar(char c, int a){
        for (int i = 0; i < a; i++) {
            System.out.print(c);
        }
        System.out.println();
    }
    
}
