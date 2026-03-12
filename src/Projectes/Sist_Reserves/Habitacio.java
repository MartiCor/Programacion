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


    public double calcularPreuPerNit(int llits) {
        if(llits >= 3) {
            preu = 50 + ((llits-2)*20);
        } else {
            preu = 50;
        }
        return preu;
    }

    public String mostrarInformacio() {
        String Nom = getNom();
        String TipusAllotjament = getTipusAllotjament();
        info = TipusAllotjament + ": " + Nom + " (Llits: " + numLlits + ") - Disponible";
        return info;
    }
}
