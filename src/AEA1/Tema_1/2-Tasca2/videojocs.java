import java.util.Scanner;

class videojocs{
	public static void main(String[] args){
	Scanner num = new Scanner(System.in);
	System.out.println("Escriu un numero del 1 al 4: ");
	int subscripcio = num.nextInt();

	switch (subscripcio){
	case 1:
	 System.out.println("L'usuari té la subscripcio basica");
	 break;
	case 2:
	 System.out.println("L'usuari té la subscripcio Estàndard");
	 break;
	case 3:
	 System.out.println("L'usuari té la subscripcio Premium");
	 break;
	case 4:
	 System.out.println("L'usuari té la subscripcio VIP");
	 break;
	default:
	 System.out.println("Opció no valida");
  } 
 }
}