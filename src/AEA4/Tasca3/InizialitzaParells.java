package AEA4.Tasca3;

public class InizialitzaParells {
    public static void main(String[] args) {
        // Caldrà emmagatzemar 100 enters.
        try {
            int[] arrayParells = new int[100];
            // Anem omplint cada posició.
            for (int i = 0; i < arrayParells.length; i++) {
                arrayParells[i] = 2 * i;
            }
            System.out.println("El programa ha funcionat correctament");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No existeix la posició 100 dintre del Array.");
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("El programa ha finalitzat independentment de si hi ha error o no");
        }
    }
}
