package Projectes.PR_Figures;

public class Cercle extends Figura {
    private double radi;
    private double Area;

    public Cercle() {
        super("cercle");
    }

    public Cercle(double radi) {
        super("cercle");
        this.radi = radi;
    }

//////// SETS ///////
    public void setRadi(double nouRadi) {
        radi = nouRadi;
    }

//////// GETS ////////
    public double getRadi() {
        return radi;
    }

    public double calcularArea(double radi) {
        Area = radi*radi*3.1415;
        return Area;
    }
}
