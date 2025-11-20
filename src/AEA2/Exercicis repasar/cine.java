import java.util.Scanner;

public class cine {
    public static void main (String[] args) {

        Scanner a = new Scanner(System.in);
        int [][] sala = new int [2][3];
        int reserva = 1;

        int libres = 0;
        int ocupadas = 0;

        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[i].length; j++) {
                System.out.println("Introdueix 0 si esta lliure, introdueix 1 si esta ocupada i introdueix 2 si esta reservada");
                sala[i][j] = a.nextInt();
                if (sala[i][j] != 0 && sala[i][j] != 1 && sala[i][j] != 2) {
                    System.out.println("Valor no vàlid no vàlida");
                    j--;
                } else {
                    if (sala[i][j] == 0) {
                        libres++;
                    } else if (sala[i][j] == 1) {
                        ocupadas++;
                    }
                }
            }
        }
        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[i].length; j++) {
                System.out.print(sala[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Queden un total de " + libres + " lliures");
        System.out.println("Hi ha un total de " + ocupadas + " Ocupats");

        while (reserva != 2) {
            System.out.println("Vols fer una reserva?\n1 --> Si\n2 --> No");
            reserva = a.nextInt();
            if (reserva == 1){
                System.out.println("Quina fila vols reservar? ");
                int i = a.nextInt();
                System.out.println("Quina columna vols reservar? ");
                int j = a.nextInt();
                if (sala[i][j] == 1 || sala[i][j] == 2) {
                    System.out.println("El seient esta ocupat");
                } else {
                    sala[i][j] = 2;
                    libres--;
                    for (i = 0; i < sala.length; i++) {
                        for (j = 0; j < sala[i].length; j++) {
                            System.out.print(sala[i][j] + " ");
                            }
                        System.out.println();
                    }
                }
            } else if (reserva == 2) {
                break;
            } else {
                System.out.println("Valor no vàlid");
            }
        }
        System.out.println("Queden un total de " + libres + " lliures");
        System.out.println("Hi ha un total de " + ocupadas + " Ocupats");
    } 
}