package Projectes.PR_Figures_10;

public class Figura {
    private static int id;
    private String figura;
    private double Area;

    public Figura() {
        id++;
    }

    public Figura(String figura) {
        id++;
        this.figura = figura;
    }

///////// SETS ////////////
    public void setId(int nouid) {
        id = nouid;
    }
    public void setFigura(String novaFigura) {
        figura = novaFigura;
    }
    public void setArea(double NovaArea) {
        Area = NovaArea;
    }

///////// GETS ///////////
    public int getId() {
        return id;
    }
    public String getFigura() {
        return figura;
    }
    public double getArea() {
        return Area;
    }


    public double calcularArea() {
        System.out.println("No puc calcular cap area ja que no soc cap figura en Especific");
        return Area;
    }


    public void imprimirDades() {
        System.out.println("----------- " + figura + " -----------");
        System.out.println("L'area del " + figura + " és: " + Area + " m2.");
        System.out.println("El ID de la figura és: " + id + ".");
        System.out.println();
    }
}
