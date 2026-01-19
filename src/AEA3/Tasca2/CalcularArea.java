package AEA3.Tasca2;

public class CalcularArea {
    private double area = 0;

    public double AreaTriangle(double base, double altura) {
        area = base * altura/2;
        return area;    
    }

    public double AreaRectangle(double base, double altura) {
        area = base * altura;
        return area;
    }

    public double AreaQuadrat(double costat) {
        area = costat * costat;
        return area;
    }

    public double AreaTrapezi(double base1, double base2, double altura) {
        area = (base1+base2)*altura/2;
        return area;
    }

    public double AreaRombe(double dM, double dm) {
        area = dM*dm/2;
        return area;
    }

    public double AreaParalelogram(double base, double altura) {
        area = base * altura;
        return area;
    }

    public double AreaCercle(double radi) {
        area = radi*radi*3.1415;
        return area;
    }
}