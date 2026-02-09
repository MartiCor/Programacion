package AEA3.Tasca7;

public class Desarrollador extends empleado {
    private String llenguatgeProgramacio;

    public Desarrollador() {

    }

    public Desarrollador(String nom, double Salari, String llenguatgeProgramacio) {
        super(nom, Salari, "Desarrolador", 10);
        this.llenguatgeProgramacio = llenguatgeProgramacio;
    }

    public void setLlenguatgeProgramacio(String nouLlenguatgeProgramacio) {
        llenguatgeProgramacio = nouLlenguatgeProgramacio;
    }

    public String getLlenguatgeProgramacio() {
        return llenguatgeProgramacio;
    }

    public void escribirCodigo() {
        System.out.println("Estic escrivint codigo!!");
    }

}
