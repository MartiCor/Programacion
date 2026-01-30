package AEA3.Tasca4;

public class tipusProducte {
    
    String nom;
    int codiIdentificador;
    double preu;
    int estoc;
    boolean alaVenda;

    public tipusProducte(String nom, int codiIdentificador, double preu, int estoc, boolean alaVenda) {
        this.nom = nom;
        this.codiIdentificador = codiIdentificador;
        this.preu = preu;
        this.estoc = estoc;
        this.alaVenda = alaVenda;
    }
}
