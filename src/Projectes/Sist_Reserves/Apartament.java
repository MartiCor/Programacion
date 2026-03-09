package Projectes.Sist_Reserves;

public class Apartament extends Allotjament {
    private int habitacions;
    private boolean teCuina;
    private int preu;
    private String info;

    public Apartament() {

    }

    public Apartament(String nom, int capacitat, int habitacions, boolean teCuina) {
        super(nom, capacitat, "Apartament");
        this.habitacions = habitacions;
        this.teCuina = teCuina;
    }

    public void setHabitacions (int novesHabitacions) {
        habitacions = novesHabitacions;{}
    }
    public void setCuina(boolean novaCuina) {
        teCuina = novaCuina;
    }

    public int getHabitacions() {
        return habitacions;
    }
    public boolean getCuina() {
        return teCuina;
    }



    public double calcularPreuPerNit() {
        return preu;
    }

    public String mostrarInformacio(){
        info = tipusAllotjament + ": " + nom + " (Habitacions: " + habitacions + ", Cuina: Sí) - Disponible";
        return info;
    }
}
