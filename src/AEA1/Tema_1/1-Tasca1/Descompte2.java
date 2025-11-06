import java.util.Scanner;

class Descompte2 {
	public static void main(String[] args){
		Scanner a = new Scanner(System.in);
		System.out.println("Introdueix el preu del producte:");
		double preu = a.nextDouble();
		double descompte = preu*8/100;
		double preuDescompte = preu-descompte;
		double preuPenalitzacio = preu+2;

		if (preu > 0 ){
			if (preu >= 100) {
				System.out.println("S'ha aplicat un descompte del 8%");
				System.out.println("El preu final és:" + preuDescompte);
			} else if (preu <= 30) {
				System.out.println("S'ha aplicat una penalitzacio de 2 euros");
				System.out.println("El preu final és: " + preuPenalitzacio);
			} else {
				System.out.println("No hi ha descompte ni penalitzacio");
				System.out.println("El preu final és: " + preu);
			}
		} else {
			System.out.println("El preu es incorrecte");
		}
	}
}