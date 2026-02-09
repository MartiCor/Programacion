package AEA3.exemples.ExClaseCotxes;

public class arona extends seat {
    private String tipoCombustible;

    public arona(String matricula, int anyFabricacio, double kmFets, String marca, String model, String color, String tipoCombustible) {
        super(matricula, anyFabricacio, kmFets, marca, model, color);
        this.tipoCombustible = tipoCombustible;
    }    

    public void setTipusCombustible(String nouTipoCombustible) {tipoCombustible = nouTipoCombustible;}

    public String getTipuscombustible() {return tipoCombustible;}
}
