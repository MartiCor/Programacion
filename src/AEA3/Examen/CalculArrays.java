package AEA3.Examen;

public class CalculArrays {
    //Param. entr: el array y la cantidad de notes
    //Param. sort: devuelve cual es la nota max
    //Mejora Martí: añadir cantidad notas
    public double calcularMaxim(double[] array, int NumNotes) {
        double max = array[0];
        for (int i = 1; i < NumNotes; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    //Param. entr: array y num notas
    //Param. sort: nota min
    //Mejora Martí: añadir cantidad notes
    public double calcularMinim(double[] array, int NumNotes) {
        double min = array[0];
        for (int i = 1; i < NumNotes; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    //Param. entr: array notas y num notas
    //Param. sort: nota media
    public double calcularMitjana(double[] array, int NumNotes) {
        double suma = 0;
        for (int i = 0; i < NumNotes; i++) {
            suma = suma + array[i];
        }
        return suma/NumNotes;
    }
}