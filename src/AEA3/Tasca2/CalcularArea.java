package AEA3.Tasca2;

public class CalcularArea {
    public double AreaTriangle(double base, double altura) {
        double area = base * altura/2;
        return area;    
    }

    public double AreaRectangle(double base, double altura) {
        double area = base * altura;
        return area;
    }

    public double AreaQuadrat(double costat) {
        double area = costat * costat;
        return area;
    }

    public double AreaTrapezi(double base1, double base2, double altura) {
        double area = (base1+base2)*altura/2;
        return area;
    }

    public double AreaRombe(double dM, double dm) {
        double area = dM*dm/2;
        return area;
    }

    public double AreaParalelogram(double base, double altura) {
        double area = base * altura;
        return area;
    }

    public double AreaCercle(double radi) {
        double area = radi*radi*3.1415;
        return area;
    }
}