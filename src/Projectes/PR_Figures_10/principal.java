package Projectes.PR_Figures_10;

import utilidades.recollirDades;
import java.util.Random;

public class principal {
    public static void main(String[] args) {
        boolean acabar = false;
        int opcio;
        int figura;
        menus mostrar = new menus();
        recollirDades recollir = new recollirDades();
        Random random = new Random();       

        while(!acabar) {
            mostrar.Menu();
            opcio = recollir.numEnter();
            switch (opcio) {
                case 1:
                    mostrar.MenuFigures();
                    figura = recollir.numEnter();
                    int azar = random.nextInt(2);
                    System.out.println(azar);
                    switch (figura) {
                        case 1:
                            System.out.println("Quin és el radi del cercle?");
                            double radi = recollir.numReal();
                            if (azar == 0 ) {
                                Cercle cercle = new Cercle(radi);
                                double AreaCercle = cercle.calcularArea(cercle.getRadi());
                                cercle.setArea(AreaCercle);
                                cercle.imprimirDades();
                            } else if (azar == 1) {
                                Cercle cercle = new Cercle();
                                cercle.setRadi(radi);
                                double AreaCercle = cercle.calcularArea(cercle.getRadi());
                                cercle.setArea(AreaCercle);
                                cercle.imprimirDades();
                            }
                            break;
                        case 2: 
                        System.out.println("Quina és la base del triangle?");
                        double base = recollir.numReal();
                        System.out.println("Quina és l'altura del triangle");
                            double altura = recollir.numReal();
                            if (azar == 0) {
                                Triangle triangle = new Triangle(base, altura);
                                double AreaTriangle = triangle.calcularArea(triangle.getBase(), triangle.getAltura());
                                triangle.setArea(AreaTriangle);
                                triangle.imprimirDades();
                            } else if (azar == 1) {
                                Triangle triangle = new Triangle();
                                triangle.setBase(base);
                                triangle.setAltura(altura);
                                double AreaTriangle = triangle.calcularArea(triangle.getBase(), triangle.getAltura());
                                triangle.setArea(AreaTriangle);
                                triangle.imprimirDades();
                            }
                            break;
                        case 3:
                            System.out.println("Quins són els costats del quadrat?");
                            double costat = recollir.numReal();
                            if (azar == 0 ) {
                                Quadrat quadrat = new Quadrat(costat);
                                double AreaQuadrat = quadrat.calcularArea(quadrat.getCostat());
                                quadrat.setArea(AreaQuadrat);
                                quadrat.imprimirDades();
                            } else if (azar == 1) {
                                Quadrat quadrat = new Quadrat();
                                quadrat.setCostat(costat);
                                double AreaQuadrat = quadrat.calcularArea(quadrat.getCostat());
                                quadrat.setArea(AreaQuadrat);
                                quadrat.imprimirDades();
                            }
                            break;
                        case 4:
                            System.out.println("Quina és la base del rectangle? ");
                            double baseRectangle = recollir.numReal();
                            System.out.println("Quina és l'altura del rectangle?");
                            double alturaRectangle = recollir.numReal();
                            if (azar == 0 ) {
                                Rectangle rectangle = new Rectangle(baseRectangle, alturaRectangle);
                                double areaQuadrat = rectangle.calcularArea(rectangle.getCostat1(), rectangle.getCostat2());
                                rectangle.setArea(areaQuadrat);
                                rectangle.imprimirDades();
                            } else if (azar == 1) {
                                Rectangle rectangle = new Rectangle();
                                rectangle.setCostat1(baseRectangle);
                                rectangle.setCostat2(alturaRectangle);
                                double AreaQuadrat = rectangle.calcularArea(rectangle.getCostat1(), rectangle.getCostat2());
                                rectangle.setArea(AreaQuadrat);
                                rectangle.imprimirDades();
                            }
                            break;
                        case 5:
                            System.out.println("Quina és la base 1 del trapezi? ");
                            double base1 = recollir.numReal();
                            System.out.println("Quina és la base 2 del trapezi? ");
                            double base2 = recollir.numReal();
                            System.out.println("Quina és l'altura del trapezi? ");
                            double alturaTrapezi = recollir.numReal();
                            if (azar == 0) {
                                Trapezi trapezi = new Trapezi(base1, base2, alturaTrapezi);
                                double AreaTrapezi = trapezi.calcularArea(trapezi.getBase1(), trapezi.getBase2(), trapezi.getAltura());
                                trapezi.setArea(AreaTrapezi);
                                trapezi.imprimirDades();
                            } else if (azar == 1) {
                                Trapezi trapezi = new Trapezi();
                                trapezi.setBase1(base1);
                                trapezi.setBase2(base2);
                                trapezi.setAltura(alturaTrapezi);
                                double AreaTrapezi = trapezi.calcularArea(trapezi.getBase1(), trapezi.getBase2(), trapezi.getAltura());
                                trapezi.setArea(AreaTrapezi);
                                trapezi.imprimirDades();
                            }
                            break;
                        case 6:
                            System.out.println("Quina és la diagonal major del rombe");
                            double DM = recollir.numReal();
                            System.out.println("Quina és la diagonal menor del rombe");
                            double dm = recollir.numReal();
                            if (azar == 0) {
                                Rombe rombe = new Rombe(DM, dm);
                                double AreaRombe = rombe.calcularArea(rombe.getDM(), rombe.getDm());
                                rombe.setArea(AreaRombe);
                                rombe.imprimirDades();
                            } else if (azar == 1) {
                                Rombe rombe = new Rombe();
                                rombe.setDM(DM);
                                rombe.setDm(dm);
                                double AreaRombe = rombe.calcularArea(rombe.getDM(), rombe.getDm());
                                rombe.setArea(AreaRombe);
                                rombe.imprimirDades();
                            }
                            break;
                        case 7:
                            System.out.println("Quina és la base del paralelogram? ");
                            double baseParalelogram = recollir.numReal();
                            System.out.println("Quina és l'altura del paralelogram? ");
                            double alturaParalelogram = recollir.numReal();
                            if (azar == 0) {
                                Paralelogram paralelogram = new Paralelogram(baseParalelogram, alturaParalelogram);
                                double AreaParalelogram = paralelogram.calcularArea(paralelogram.getBase(), paralelogram.getAltura());
                                paralelogram.setArea(AreaParalelogram);
                                paralelogram.imprimirDades();
                            } else if (azar == 1) {
                                Paralelogram paralelogram = new Paralelogram();
                                paralelogram.setBase(baseParalelogram);
                                paralelogram.setAltura(alturaParalelogram);
                                double AreaParalelogram = paralelogram.calcularArea(paralelogram.getBase(), paralelogram.getAltura());
                                paralelogram.setArea(AreaParalelogram);
                                paralelogram.imprimirDades();
                            }
                            break;
                        default:
                            System.out.println("Aquesta figura no és vàlida!");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Gràcies per utilitzar el programa.");
                    acabar = true;
                    break;
                default:
                    System.out.println("Opció no vàlida!");
                    break;
            }
        }
    }
}