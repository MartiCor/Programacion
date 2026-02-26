package Projectes.PR_Figures_10;

public class Rectangle extends Figura {
    private double costat1;
    private double costat2;
    private double Area;

    public Rectangle() {
        super("rectangle");
    }

    public Rectangle(double costat1, double costat2) {
        super( "rectangle");
        this.costat1 = costat1;
        this.costat2 = costat2;
    }

/////////// SETS //////////
    public void setCostat1(double nouCostat) {
        costat1 = nouCostat;
    }

    public void setCostat2(double nouCostat) {
        costat2 = nouCostat;
    }

////////// GETS //////////
    public double getCostat1() {
        return costat1;
    }

    public double getCostat2() {
        return costat2;
    }

    public double calcularArea(double costat1, double costat2) {
        Area = costat1 * costat2;
        return Area;
    }
}
