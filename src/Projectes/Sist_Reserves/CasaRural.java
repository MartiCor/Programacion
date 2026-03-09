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
    public void setPisccina(boolean novaPiscina) {
        tePiscina = novaPiscina;
    }

    public boolean getJardi() {
        return teJardi;
    }
    public boolean getPiscina() {
        return tePiscina;
    }


    public double calcularPreuPerNit() {
        return preu;
    }

    public String mostrarInformacio() {
        info = tipusAllotjament + ": " + nom + " (Jardí: Sí, PIscina: Sí) - Disponible";
        return info;
    }
}
