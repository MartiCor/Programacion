package Projectes.PR_Figures;

public class principal {
        public static void main(String[] args) {
            Quadrat quadrat1 = new Quadrat(5);
            double AreaQuadrat = quadrat1.calcularArea(quadrat1.getCostat());
            quadrat1.setArea(AreaQuadrat);
            quadrat1.imprimirDades();
            System.out.println();

            Quadrat quadrat2 = new Quadrat(5);
            double AreaQuadrat2 = quadrat2.calcularArea(quadrat1.getCostat());
            quadrat2.setArea(AreaQuadrat2);
            quadrat2.imprimirDades();
            System.out.println();

            Triangle triangle1 = new Triangle(7, 3);
            double AreaTriangle = triangle1.calcularArea(triangle1.getBase(), triangle1.getAltura());
            triangle1.setArea(AreaTriangle);
            triangle1.imprimirDades();
            System.out.println();

            Rectangle rectangle1 = new Rectangle();
            rectangle1.setCostat1(6);
            rectangle1.setCostat2(4);
            double AreaRectangle = rectangle1.calcularArea(rectangle1.getCostat1(), rectangle1.getCostat2());
            rectangle1.setArea(AreaRectangle);
            rectangle1.imprimirDades();
            System.out.println();

            Paralelogram paralelogram1 = new Paralelogram(10, 6);
            double AreaParalelogram = paralelogram1.calcularArea(paralelogram1.getBase(), paralelogram1.getAltura());
            paralelogram1.setArea(AreaParalelogram);
            paralelogram1.imprimirDades();
            System.out.println();

            Rombe rombe1 = new Rombe(6, 8);
            double AreaRombe = rombe1.calcularArea(rombe1.getDM(), rombe1.getDM());
            rombe1.setArea(AreaRombe);
            rombe1.imprimirDades();
            System.out.println();

            Cercle cercle1 = new Cercle(5);
            double AreaCercle = cercle1.calcularArea(cercle1.getRadi());
            cercle1.setArea(AreaCercle);
            cercle1.imprimirDades();
            System.out.println();

            Trapezi trapezi1 = new Trapezi(3, 4, 5);
            double AreaTrapezi = trapezi1.calcularArea(trapezi1.getBase1(), trapezi1.getBase2(), trapezi1.getAltura());
            trapezi1.setArea(AreaTrapezi);
            trapezi1.imprimirDades();
            System.out.println();
    }
}
