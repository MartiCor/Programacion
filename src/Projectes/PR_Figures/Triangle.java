package Projectes.PR_Figures;

public class Triangle extends Figura {
    
    private double base;
    private double h;
    private double Area;


    public Triangle() {
        super();
    }


    public Triangle(double base, double h) {
        super( "triangle");
        this.base = base;
        this.h = h;
    }


///////// SETS ////////////
    public void setBase(double novaBase) {
        base = novaBase;
    }


    public void setAltura(double novaAltura) {
        h = novaAltura;
    }


///////// GETS ////////////
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return h;
    }


    public double calcularArea(double base, double altura) {
        Area = base*altura/2;
        return Area;
    }
}


