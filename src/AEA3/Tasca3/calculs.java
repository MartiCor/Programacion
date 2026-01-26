package AEA3.Tasca3;

public class calculs {

    public double maxim(double [] notes, int total) {
        double notaMaxima = notes[0];
        for (int i = 0; i< notes.length; i++) {
            if (notes[i] > notaMaxima) {
                notaMaxima = notes[i];
            }
        }
        return notaMaxima;
    }
    

    public double minim(double [] notes, int total) {
        double notaMinima = notes[0];
        for (int i = 0; i < total ; i++) {
            if(notes[i] < notaMinima) {
                notaMinima = notes[i];
            }
        }
        return notaMinima;
    }

    public double mitjana(double [] notes, int total) {
        double mitja = 0; 
        double suma = 0;
        for (int i = 0; i <total; i++ ) {
            suma =+ suma + notes[i];
        }
        mitja = suma/total;
        return mitja;
    } 
}
