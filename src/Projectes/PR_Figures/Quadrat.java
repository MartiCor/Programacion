package Projectes.PR_Figures;

public class Quadrat extends Figura {
    private double costat; 
    public double Area;

    public Quadrat() {
        super("quadrat");
    }

    public Quadrat(double costat ) {
        super("quadrat");
        this.costat = costat;
    }

    //sets//
    public void setCostat(double nouCostat) {
        costat = nouCostat;
    }

    //gets//

    public double getCostat() {
        return costat;
    }

    public double calcularArea(double costat) {
        Area = costat*costat;
        return Area;
    }
}
