package Projectes.Sist_Reserves;

public class Habitacio extends Allotjament {
    private int numLlits;
    private double preu;
    private String info;

    public Habitacio() {

    }
    public Habitacio(String nom, int capacitat, int numLlits) {
        super(nom, capacitat, "Habitació");
        this.numLlits = numLlits;
    }

    public void setNumLlits(int nouNumLlits){
        numLlits = nouNumLlits;
    }

    public int getNumLlits() {
        return numLlits;
    }


    public double calcularPreuPerNit() {
        return preu;
    }

    public String mostrarInformacio() {
        info = tipusAllotjament + ": " + nom + " (Llits: " + numLlits + ") - Disponible";
        return info;
    }
}
