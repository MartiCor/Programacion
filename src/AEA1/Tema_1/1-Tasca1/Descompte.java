import java.util.Scanner;

class Descompte {
	public static void main(String[] args){
		Scanner a = new Scanner(System.in);
		System.out.println("Introdueix el preu del producte:");
		double preu = a.nextDouble();
		
		
		if (preu > 0) {
			if (preu >= 95) {
				double descompte = preu*15/100;
				preu = preu-descompte;
				System.out.println("S'ha aplicat el descompte");
			} else {
				System.out.println("No s'ha aplicat descompte");
			}  
			System.out.println("El preu final és: " + preu);
		} else {
			System.out.println("Preu incorrecte");
			}
	}
}
