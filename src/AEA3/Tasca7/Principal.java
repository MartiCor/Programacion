package AEA3.Tasca7;

public class Principal {
    public static void main(String[] args) {

        System.out.println("--------------Programador-------------------------");
        Programador programador1 = new Programador("Martí", 1200);
        double salariProgramador= programador1.calcularBonus(programador1.getSalari(), programador1.getBonus());
        System.out.println("El teu salari amb el bonus és: " + salariProgramador);
        programador1.debug();
        System.out.println();
        

        System.out.println("----------------Manager------------------------");
        Manager manager1 = new Manager("Martí", 1200);
        double salariManager = manager1.calcularBonus(manager1.getSalari(), manager1.getBonus());
        System.out.println("El teu salari amb el bonus és: " + salariManager);
        manager1.gestionProyecto();
        System.out.println();


        System.out.println("-----------------Desarrolador-----------------------");
        Desarrollador desarrollador1 = new Desarrollador("Martí", 1200, "Java");
        double salariDesarrolador = desarrollador1.calcularBonus(desarrollador1.getSalari(), desarrollador1.getBonus());
        System.out.println("El teu salari amb el bonus és: " + salariDesarrolador);
        desarrollador1.escribirCodigo();
        System.out.println();
    }
}
