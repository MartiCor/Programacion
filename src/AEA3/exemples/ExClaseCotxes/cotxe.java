package AEA3.exemples.ExClaseCotxes;

public class cotxe {
    private String matricula;
    private int anyFabricacio;
    private double kmFets;
    private String marca;

    public cotxe(String matricula, int anyFabricacio, double kmFets, String marca) {
        this.matricula = matricula;
        this.anyFabricacio = anyFabricacio;
        this.kmFets = kmFets;
        this.marca = marca;
    }

    public void setMatricula(String novaMatricula) {matricula = novaMatricula;}
    public void setAnyFabricacio(int nouAnyFabricacio) {anyFabricacio = nouAnyFabricacio;}
    public void setKmFets(double nouKmFets) {kmFets = nouKmFets;}
    public void setMarca(String novaMarca) {marca = novaMarca;}

    public String getMatricula() {return matricula;}
    public int getAnyFabricacio() {return anyFabricacio;}
    public double getKmFets() {return kmFets;}
    public String getMarca() {return marca;}
}
