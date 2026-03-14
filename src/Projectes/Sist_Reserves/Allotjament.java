package Projectes.Sist_Reserves;

public class Allotjament {
    private String nom;
    private int capacitat;
    private boolean disponible;
    private String tipusAllotjament;
    private double preu;
    private String info;

    public Allotjament() {
        disponible = true;
    }

    public Allotjament(String nom, int capacitat, String tipusAllotjament) {
        this.nom = nom;
        this.capacitat = capacitat;
        this.tipusAllotjament = tipusAllotjament;
        disponible = true;
    }

    public void setNom(String nouNom) {
        nom = nouNom;
        System.out.println();
    }

    public void setCapacitat(int novaCapacitat) {
        capacitat = novaCapacitat;
    }

    public void setDisponible(boolean novaDisponabilitat) {
        disponible = novaDisponabilitat;
    }

    public String getNom() {
        return nom;
    }

    public int getCapacitat() {
        return capacitat;
    }

    public boolean getDisponibilitat() {
        return disponible;
    }

    public String getTipusAllotjament() {
        return tipusAllotjament;
    }

    public double calcularPreuPerNit() {
        System.out.println("No puc calcular cap preu ja que no has especificat quin allotjament vols.");
        return preu;
    }

    public String mostrarInformacio() {
        info = "No puc mostrar-te cap informació ja que no has especificat quin allotjament vols";
        return info;
    }

    public boolean reservar() {
        disponible = false;
        return disponible;
    }

    public boolean alliberar() {
        disponible = true;
        return disponible;
    }

    public void isDisponible() {
        if (disponible == true) {
            System.out.println("L'allotjament és disponible");
        } else {
            System.out.println("L'allotjament no és disponible");
        }
    }
}