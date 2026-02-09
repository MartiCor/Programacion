package AEA3.Tasca6;

public class empleado {
    private String nom;
    private String direccio;
    private double salari;
    private String llocTreball;

    public empleado(String nombre, String direccio, double salari, String llocTreball) {
        this.nom = nom;
        this.direccio = direccio;
        this.salari = salari;
        this.llocTreball = llocTreball;
    }

    public void setNombre(String nouNom) {
        nom = nouNom;
    }

    public void setDireccio(String novaDireccio) {
        direccio = novaDireccio;
    }

    public void setSalari(double nouSalari) {
        salari = nouSalari;
    }

    public void setLlocTreball(String nouLlocTreball) {
        llocTreball = nouLlocTreball;
    }


    public String getNom() {
        return nom;
    }

    public String getDireccio() {
        return direccio;
    }

    public double getSalari() {
        return salari;
    }

    public String getLlocTreball() {
        return llocTreball;
    }
}
