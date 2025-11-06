import java.util.Scanner;

class Multiplicacio2 {
	public static void main(String[] args){
	 Scanner a = new Scanner(System.in);
	 System.out.println("Introdueix un primer nombre");
	 double Num1 = a.nextDouble();
	 Scanner b = new Scanner(System.in);
	 System.out.println("Introdueix un segon nombre");
	 double Num2 = b.nextDouble();
	 Scanner c = new Scanner(System.in);
	 System.out.println("Introdueix un tercer nombre");
	 double Num3 = c.nextDouble();

	 double resultat = Num1*Num2*Num3;
	 System.out.println("El resultat de la multiplicacio es: " + resultat);
  }
}
