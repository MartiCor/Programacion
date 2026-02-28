package Projectes.PR_Figures;

public class Paralelogram extends Figura {
    private double base;
    private double altura;
    private double Area;

    public Paralelogram() {
        super("paralelogram");
    }

    public Paralelogram(double base, double altura) {
        super("paralelogram");
        this.base = base;
        this.altura = altura;
    }

/////// SETS ////////
    public void setBase(double novaBase) {
        base = novaBase;
    }
    public void setAltura(double novaAltura) {
        altura = novaAltura;
    }

/////// GETS /////////
    public double getBase() {
        return base;
    }
    public double getAltura() {
        return altura;
    }

    public double calcularArea(double base, double altura) {
        Area = base * altura;
        return Area;
    }
}
