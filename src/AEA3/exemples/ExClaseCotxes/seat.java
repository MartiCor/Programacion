package AEA3.exemples.ExClaseCotxes;

public class seat extends cotxe {
    private String model;
    private String color;

    public seat(String matricula, int anyFabricacio, double kmFets, String marca, String model, String color) {
        super(matricula, anyFabricacio, kmFets, marca);
        this.model = model;
        this.color = color;
    }

    public void setModel(String nouModel) {model = nouModel;}
    public void setColor(String nouColor) {color = nouColor;}

    public String getModel() {return model;}
    public String getColor() {return color;}
}
