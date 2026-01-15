package AEA3.Tasca2;

public class CalculArees {

  public static void main(String[] args) {
    CalculArees programa = new CalculArees();
    programa.inici();
  }

  public void inici() {
    System.out.println("De quina figura vols calcular l'area?");
    System.out.println("Tens les següents opcions: triangle, quadrat, rectangle, trapezi, rombe, paralelogram o cercle.");

    SeleccionarFigura selector = new SeleccionarFigura();
    CalcularArea calcul = new CalcularArea();
    String Figura = selector.Figura();

    if (Figura.equals("incorrecte")) {
      System.out.println("Figura no vàlida");
    } else {
      double Area = calcul.Area(Figura);
      System.out.println("L'area del " + Figura + " és: " + Area);
    }

  }
}