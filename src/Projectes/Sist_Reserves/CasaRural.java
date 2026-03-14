package Projectes.Sist_Reserves;

public class CasaRural extends Allotjament {
    private boolean teJardi;
    private boolean tePiscina;
    private double preu;
    private String info;

    public CasaRural() {

    }

    public CasaRural(String nom, int capacitat, boolean teJardi, boolean tePiscina) {
        super(nom, capacitat, "Casa Rural");
        this.teJardi = teJardi;
        this.tePiscina = tePiscina;
    }

    public void setJardi(boolean nouJardi) {
        teJardi = nouJardi;
    }

    public void setPiscina(boolean novaPiscina) {
        tePiscina = novaPiscina;
    }

    public boolean getJardi() {
        return teJardi;
    }

    public boolean getPiscina() {
        return tePiscina;
    }

    public double calcularPreuPerNit(boolean piscina) {
        if (piscina == true) {
            preu = 150 + 50;
        } else {
            preu = 150;
        }
        return preu;
    }

    public String mostrarInformacio() {
        String Nom = getNom();
        String TipusAllotjament = getTipusAllotjament();
        String piscina;
        String jardi;

        if (tePiscina == true) {
            piscina = "Sí";
        } else {
            piscina = "No";
        }

        if (teJardi == true) {
            jardi = "Sí";
        } else {
            jardi = "No";
        }

        info = TipusAllotjament + ": " + Nom + " (Jardí: " + jardi + ", Piscina: " + piscina + " ) - Disponible";
        return info;
    }
}
