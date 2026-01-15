package AEA3.Tasca2;

public class CalcularArea {
    public double Area(String Figura) {
        double area = 0;
        if (Figura.equals("triangle")) {
            double b = 23.0;
            double h = 8.0;
            area = (b*h)/2;
        } else if(Figura.equals("quadrat")) {
            double b = 37.0;
            area = b*b;
        } else if(Figura.equals("rectange")) {
            double b = 68;
            double h = 39;
            area = b*h;
        } else if (Figura.equals("trapezi")) {
            double a = 35;
            double b = 16;
            double h = 5;
            area = ((a*b)*h)/2;
        } else if (Figura.equals("rombe")) {
            double dM = 75;
            double dm = 30;
            area = (dM+dm)/2;
        } else if (Figura.equals("paralelogram")) {
            double b = 45;
            double h = 13;
            area = b*h;
        } else if (Figura.equals("cercle")) {
            double radi = 14;
            area = radi*radi*3.1415;
        }
    return area;    
    }
}
