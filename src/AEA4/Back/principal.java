package AEA4.Back;

import utilidades.recollirDades;

public class principal {
    public static void main(String[] args) {
        recollirDades recollir = new recollirDades();
        operacions operar = new operacions();
        especiales funcion = new especiales();
        double resultatActual = 0;
        boolean tancar = false;

        while (!tancar) {
            System.out.println();
            System.out.println("-------CALCULADORA EXPRES--------");
            System.out.println("Quina operacio vols fer?");
            System.out.println("1. SUMA");
            System.out.println("2. RESTA");
            System.out.println("3. MULTIPLICAR");
            System.out.println("4. DIVIDIR");
            System.out.println("5. +-");
            System.out.println("6. C");

            int opcio = recollir.numEnter();
            switch (opcio) {
                case 1:
                    if (resultatActual == 0) {
                        System.out.println("Primer num?");
                        double num1 = recollir.numReal();
                        System.out.println("Segon num");
                        double num2 = recollir.numReal();
                        resultatActual = operar.suma(num1, num2);
                        System.out.println(resultatActual);
                    } else {
                        System.out.println("segon num?");
                        double num2 = recollir.numReal();
                        resultatActual = operar.suma(resultatActual, num2);
                        System.out.println(resultatActual);
                    }
                    break;
                case 2:
                    if (resultatActual == 0) {
                        System.out.println("Primer num?");
                        double num1 = recollir.numReal();
                        System.out.println("Segon num");
                        double num2 = recollir.numReal();
                        resultatActual = operar.restar(num1, num2);
                        System.out.println(resultatActual);
                    } else {
                        System.out.println("segon num?");
                        double num2 = recollir.numReal();
                        resultatActual = operar.restar(resultatActual, num2);
                        System.out.println(resultatActual);
                    }
                    break;
                case 3:
                    if (resultatActual == 0) {
                        System.out.println("Primer num?");
                        double num1 = recollir.numReal();
                        System.out.println("Segon num");
                        double num2 = recollir.numReal();
                        resultatActual = operar.multiplicar(num1, num2);
                        System.out.println(resultatActual);
                    } else {
                        System.out.println("segon num?");
                        double num2 = recollir.numReal();
                        resultatActual = operar.multiplicar(resultatActual, num2);
                        System.out.println(resultatActual);
                    }
                    break;
                case 4:
                    if (resultatActual == 0) {
                        System.out.println("Primer num?");
                        double num1 = recollir.numReal();
                        System.out.println("Segon num");
                        double num2 = recollir.numReal();
                        resultatActual = operar.dividir(num1, num2);
                        System.out.println(resultatActual);
                    } else {
                        System.out.println("segon num?");
                        double num2 = recollir.numReal();
                        resultatActual = operar.dividir(resultatActual, num2);
                        System.out.println(resultatActual);
                    }
                    break;
                case 5:
                    resultatActual = funcion.masmenos(resultatActual);
                    System.out.println(resultatActual);
                    break;
                case 6:
                    resultatActual = funcion.resultat0(resultatActual);
                    System.out.println(resultatActual);
                    break;
                default:
                    break;
            }
        }
    }
}
