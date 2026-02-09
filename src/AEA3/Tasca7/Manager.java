package AEA3.Tasca7;

public class Manager extends empleado{
    private int numTreballadors = 0;

    public Manager() {

    }

    public Manager(String nom, double salari) {
        super(nom, salari, "Manager", 15);
        ++numTreballadors;
    }

    public void setNumTreballador(int nouTreballadors) {
        numTreballadors = nouTreballadors;
    }

    public int getNumTreballadors() {
        return numTreballadors;
    }

    public void gestionProyecto() {
        System.out.println("Estic gestionant un projecte");
    }
}
