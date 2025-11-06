import java.util.Scanner;

class areaFigura{
    public static void main(String[] args){

    Scanner a = new Scanner(System.in);
    System.out.println("Escull entre: triangle, cercle, trapezi, rombe o paral·lelogram");
    String figura = a.nextLine();

    if (figura.equals("triangle")) {
     Scanner b = new Scanner(System.in);
     System.out.println("Quina es la base del triangle?");
     double base = b.nextDouble();
     Scanner c = new Scanner(System.in);
     System.out.println("Quina es la altura del triangle)");
     double altura = c.nextDouble(); 
     double area = base*altura/2;
     System.out.println("L'area del " + figura + " és " + area);
        } else if (figura.equals("cercle")) {
     Scanner d = new Scanner(System.in);
     System.out.println("Quin és el radi del cercle?");
     double radi = d.nextDouble();
     double area = 3.1415*radi*radi;
     System.out.println("L'area del " + figura + " és " + area);
        } else if (figura.equals("trapezi")) {
     Scanner e = new Scanner(System.in);
     System.out.println("Quina és la primera base del trapezi?");
     double base1 = e.nextDouble();
     Scanner f = new Scanner(System.in);
     System.out.println("Quina és la segona base del trapezi?");
     double base2 = f.nextDouble();
     Scanner g = new Scanner(System.in);
     System.out.println("Quina es la altura del trapezi?");
     double altura = g.nextDouble();
     double area = (base1+base2)*altura/2;
     System.out.println("L'area del " + figura + " és " + area);
        } else if (figura.equals("rombe")) {
     Scanner h = new Scanner(System.in);
     System.out.println("Quina és la diagonal major del rombe?");
     double DiagonalM = h.nextDouble();
     Scanner i = new Scanner(System.in);
     System.out.println("Quina és la diagonal menor del rombe?");
     double Diagonalm = i.nextDouble();
     double area = DiagonalM*Diagonalm/2;
     System.out.println("L'area del " + figura + " és " + area);
        } else if (figura.equals("parallelogram")) {
     Scanner j = new Scanner(System.in);
     System.out.println("Quina es la base del paral·lelogram?");
     double base = j.nextDouble();
     Scanner k = new Scanner(System.in);
     System.out.println("Quina és l'altura del paral·lelogram?");
     double altura = k.nextDouble();
     double area = base*altura;
     System.out.println("L'area del " + figura + " és " + area);
        } else {
     System.out.println("Figura no valida");
    }
 }
}