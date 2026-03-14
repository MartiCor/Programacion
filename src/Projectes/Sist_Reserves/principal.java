package Projectes.Sist_Reserves;

import utilidades.recollirDades;

public class principal {
    public static void main(String[] args) {
        boolean acabar = false;
        int opcio;
        menus mostrar = new menus();
        recollirDades recollir = new recollirDades();
        Habitacio habitacio1 = new Habitacio("Habitació 101", 3, 5);
        Apartament apartament1 = new Apartament("Apartament Blue", 4, 2, false);
        CasaRural casa1 = new CasaRural("Masia Verda", 8, true, false);
        Habitacio habitacio2 = new Habitacio("Habitació 202", 2, 1);
        CasaRural casa2 = new CasaRural("Can Soler", 1, true, true);

        while (!acabar) {
            mostrar.menu();
            System.out.println("Quina opció vols fer?");
            opcio = recollir.numEnter();
            switch (opcio) {
                case 1:
                    System.out.println("------- Allotjaments Disponibles -------");
                    if (habitacio1.getDisponibilitat() == true) {
                        String info1 = habitacio1.mostrarInformacio();
                        System.out.println(info1);
                    }
                    if (apartament1.getDisponibilitat() == true) {
                        String info2 = apartament1.mostrarInformacio();
                        System.out.println(info2);
                    }
                    if (casa1.getDisponibilitat()) {
                        String info3 = casa1.mostrarInformacio();
                        System.out.println(info3);
                    }
                    if (habitacio2.getDisponibilitat() == true) {
                        String info4 = habitacio2.mostrarInformacio();
                        System.out.println(info4);
                    }
                    if (casa2.getDisponibilitat() == true) {
                        String info5 = casa2.mostrarInformacio();
                        System.out.println(info5);
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    System.out.print("Escriu el nom del allotjament que vols reservar: ");
                    String allotjament = recollir.string().toLowerCase();
                    if (allotjament.equals("habitacio 101")) {
                        System.out.println("Has reservat l'Habitació 101.");
                        habitacio1.reservar();
                    } else if (allotjament.equals("apartament blue")) {
                        System.out.println("Has reservat l'Apartament Blue");
                        apartament1.reservar();
                    } else if (allotjament.equals("masia verda")) {
                        System.out.println("Has reservat Masia Verda");
                        casa1.reservar();
                    } else if (allotjament.equals("habitacio 202")) {
                        System.out.println("Has reservat l'Habitació 202.");
                        habitacio2.reservar();
                    } else if (allotjament.equals("can soler")) {
                        System.out.println("Has reservat Can Soler");
                        casa2.reservar();
                    } else {
                        System.out.println(
                                "Has introduït el nom del allotjament de forma incorrecte. Revisa que l'hagis escrit be o prova a escriur-el sense accents.");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    System.out.print("Escriu el nom del allotjament reservat que vols alliberar: ");
                    String alliberar = recollir.string().toLowerCase();
                    if (alliberar.equals("habitacio 101")) {
                        System.out.println("Has alliberat l'Habitació 202");
                        habitacio1.alliberar();
                    } else if (alliberar.equals("apartament blue")) {
                        System.out.println("Has alliberat l'Apartament Blue.");
                        apartament1.alliberar();
                    } else if (alliberar.equals("masia verda")) {
                        System.out.println("Has alliberat la Masiva Verda.");
                        casa1.alliberar();
                    } else if (alliberar.equals("habitacio 202")) {
                        System.out.println("Has alliberat l'Habitació 202.");
                        habitacio2.alliberar();
                    } else if (alliberar.equals("can soler")) {
                        System.out.println("Has alliberat Can Soler.");
                        casa2.alliberar();
                    } else {
                        System.out.println(
                                "Has introduït el nom del allotjament de forma incorrecte. Revisa que l'hagis escrit be o prova a escriur-el sense accents.");
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Gràcies per utilitzar el programa.");
                    acabar = true;
                    break;
                default:
                    System.out.println("Aquesta opció no és vàlida");
                    break;
            }
        }
    }
}