package Projectes.PR_Figures_10;

public class Trapezi extends Figura {
    private double base1;
    private double base2;
    private double altura;
    private double Area;

    public Trapezi() {
        super("trapezi");
    }

    public Trapezi(double base1, double base2, double altura) {
        super("trapezi");
        this.base1 = base1;
        this.base2 = base2;
        this.altura = altura;
    }

//////// SETS ////////
    public void setBase1(double novaBase) {
        base1 = novaBase;
    }
    public void setBase2(double novaBase) {
        base2 = novaBase;
    }
    public void setAltura(double novaAltura) {
        altura = novaAltura;
    }

//////// GETS ///////
    public double getBase1() {
        return base1;
    }
    public double getBase2() {
        return base2;
    }
    public double getAltura() {
        return altura;
    }


    public double calcularArea(double base1, double base2, double altura) {
        Area = (base1+base2)*altura/2;
        return Area;
    }
}
