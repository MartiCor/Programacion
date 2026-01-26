package AEA3.Tasca3;

import utilidades.recollirDades;

public class principal {
    public static void main(String[] args) {
        principal programa = new principal();
        programa.inici();
    }

    public void inici() {

        boolean acabar = false;
        mostrarMenu mostrar = new mostrarMenu();
        recollirDades recollir = new recollirDades();
        calculs calcul = new calculs();
        double [] notes = new double[100];
        int totalNotes = 0;

        while(!acabar) {
            mostrar.menu();    
            int opcio = recollir.numEnter();
            switch (opcio) {
                case 1:
                    for (int i = 0 + totalNotes; i < 5 + totalNotes; i++) {
                        System.out.println("Quina és la nota " + (i+1) + "?");
                        notes[i] = recollir.numReal();
                        if (notes[i] < 0 || notes [i] > 10) {
                            System.out.println("Valor incorrecte, la nota ha d'estar entre el 0 i el 10!");
                            i--;
                            totalNotes--;
                        }
                    }
                    totalNotes = totalNotes + 5;
                    break;
                case 2: 
                    double notaMaxima = calcul.maxim(notes, totalNotes);
                    System.out.println("La nota màxima és: " + notaMaxima);
                    System.out.println();
                    break;
                case 3:
                    double notaMinima = calcul.minim(notes, totalNotes);
                    System.out.println("La nota mínima és: " + notaMinima);
                    System.out.println();
                    break;
                case 4:
                    double mitjana = calcul.mitjana(notes, totalNotes);
                    System.out.println("La nota mitjana és " + mitjana);
                    System.out.println();
                    break;
                case 5:
                    acabar programa = new acabar();
                    acabar = programa.Acabar();
                    break;
                default:
                    System.out.println("Valor no vàlid, tria entre les opcions 1-5!");
                    break;
            }        
        }
    }
}