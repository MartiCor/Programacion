package Projectes.PR_Figures;

public class Rombe extends Figura {
    private double dM;
    private double dm;
    private double Area;

    public Rombe() {
        super("rombe");
    }

    public Rombe(double dM, double dm){
        super("rombe");
        this.dM = dM;
        this.dm = dm;
    }

/////// SETS //////
    public void setDM(double novaDM) {
        dM = novaDM;
    }
    public void setDm(double novaDm) {
        dm = novaDm;
    }

//////// GETS ////////
    public double getDM() {
        return dM;
    }
    public double getDm() {
        return dm;
    }

    public double calcularArea(double dM, double dm) {
        Area = dM*dm/2;
        return Area;
    }
}
