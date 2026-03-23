package AEA3.Examen;

public class NotaAText {


    //Param. entr: la nota que volem transformar a text
    //Param. sort: la nota transformada en text
    public String notaAText(double nota) {
        String a = "" + nota;
        if (nota >= 0 && nota < 5) {
            a = "suspes";
        } else if (nota >= 5 && nota < 7) {
            a = "aprovat";
        } else if (nota >= 7 && nota < 9) {
            a = "notable";
        } else if (nota >= 9 && nota <= 10) {
            a = "excel·lent";
        }
        return a;
    }
}
