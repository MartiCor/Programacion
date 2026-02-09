package AEA3.Tasca7;


public class Programador extends empleado {
    public Programador() {

    }

    public Programador(String nom, double Salari) {
        super(nom, Salari, "Programador", 12);
    }

    public void debug() {
        System.out.println("Estic fent debug");
    }

}
