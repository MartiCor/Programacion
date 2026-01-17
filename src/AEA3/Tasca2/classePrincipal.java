package AEA3.Tasca2;

public class classePrincipal {

  public static void main(String[] args) {
    classePrincipal programa = new classePrincipal();
    programa.inici();
  }

  public void inici() {
    System.out.println("De quina figura vols calcular l'àrea?");
    System.out.println("Tens les següents opcions: triangle, quadrat, rectangle, trapezi, rombe, paralelogram o cercle.");

    SeleccionarFigura selector = new SeleccionarFigura();
    CalcularArea calcul = new CalcularArea();
    recollirDades recollir = new recollirDades();
    String Figura = selector.Figura();
    double Area = 0;

    if (Figura.equals("incorrecte")) {
      System.out.println("Figura no vàlida");
    } else {
      if (Figura.equals("triangle")) {
        System.out.println("Introdueix la base del triangle");
        double base = recollir.dada();
        System.out.println("Quina es la altura del triangle");
        double altura = recollir.dada();
        Area = calcul.AreaTriangle(base, altura);

      } else if (Figura.equals("quadrat")) {
        System.out.println("Quins valor tenen els costats del quadrat");
        double costat = recollir.dada();
        Area = calcul.AreaQuadrat(costat);

      } else if (Figura.equals("rectangle")) {
        System.out.println("Quina es la base del rectangle");
        double base = recollir.dada();
        System.out.println("Quina es la altura del triangle");
        double altura = recollir.dada();
        Area = calcul.AreaRectangle(base, altura);

      } else if (Figura.equals("trapezi")) {
        System.out.println("Quina es la primera base del trapezi");
        double base1 = recollir.dada();
        System.out.println("Quina es la segona base del trapezi?");
        double base2 = recollir.dada();
        System.out.println("Quina es l'altura del trapezi");
        double altura = recollir.dada();
        Area = calcul.AreaTrapezi(base1, base2, altura);

      } else if (Figura.equals("rombe")) {
        System.out.println("Quina es la diagonal major del rombe");
        double dM = recollir.dada();
        System.out.println("Quina es la diagonal menor del rombe");
        double dm = recollir.dada();
        Area = calcul.AreaRombe(dM, dm);

      } else if (Figura.equals("paralelogram")) {
        System.out.println("Quina es la base del paralelogram");
        double base = recollir.dada();
        System.out.println("Quina es l'altura del parelelogram");
        double altura = recollir.dada();
        Area = calcul.AreaParalelogram(base, altura);

      } else if (Figura.equals("cercle")) {
        System.out.println("Quin es el radi del cercle");
        double radi = recollir.dada();
        Area = calcul.AreaCercle(radi);
      }
      System.out.println("L'àrea del " + Figura + " és: " + Area);
    }
  }
}