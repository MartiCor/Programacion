package AEA3.Tasca7;

public class empleado {
    private String nom;
    private String direccio;
    private Double salari;
    private String puestoTrabajo;
    private Double bonus;
    private Double SalariBonus;

    public empleado() {
        
    }

    public empleado(String nom, String direccio, Double salari, String puestoTrabajo) {
        this.nom = nom;
        this.direccio = direccio;
        this.salari = salari;
        this.puestoTrabajo = puestoTrabajo;
    }

    public empleado(String nom, double salari, String puestoTrabajo, double bonus) {
        this.nom = nom;
        this.salari = salari;
        this.puestoTrabajo = puestoTrabajo;
        this.bonus = bonus;
    }
    
    ////////set///////// 
    public void setNom(String nouNom) {
        nom = nouNom;
    }
    public void setDireccio(String novaDireccio) {
        direccio = novaDireccio;
    }
    public void setSalari(double nouSalari) {
        salari = nouSalari;
    }
    public void setPuestoTrabajo(String nouPuestoTrabajo) {
        puestoTrabajo = nouPuestoTrabajo;
    }
    public void setBonus(double nouBonus) {
        bonus = nouBonus;
    }

    /////////get//////////
    public String getNOm() {
        return nom;
    }
    public String getDireccio() {
        return direccio;
    }
    public double getSalari() {
        return salari;
    }
    public String getPuestoTrabajo() {
        return puestoTrabajo;
    }
    public double getBonus(){
        return bonus;
    }
    public double calcularBonus(double Salari, double Bonus) {
        bonus = Salari*Bonus/100;
        SalariBonus = Salari + bonus;
        return SalariBonus;
    }

    public String generarReport() {
        String report = "este es el reporte";
        return report;
    }
}
