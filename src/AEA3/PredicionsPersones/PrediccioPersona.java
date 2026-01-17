package AEA3.PredicionsPersones;

public class PrediccioPersona {
    public static void main(String[] args) {
        PrediccioPersona programa = new PrediccioPersona();
        programa.inici();
    }

    public void inici() {

        boolean acabar = false;
        mostrarMenu mostrar = new mostrarMenu();
        recollirDades recollir = new recollirDades();
        System.out.println("Quines d'aquestes opcions vols fer?");


        while (!acabar) {
            mostrar.menu();
            System.out.println("Quines d'aquestes opcions vols fer?");
            int opcio = recollir.numEnter();
            switch (opcio) {
                case 1:
                    System.out.print("\n");
                    System.out.println("Gener Febrer Marc");
                    System.out.println("Abril Maig Juny");
                    System.out.println("Juliol Agost Setembre");
                    System.out.println("Octubre Novembre Desembre");
                    System.out.println();
                    System.out.println("Escriu el mes en què vas nèixer.");


                    String mesNaixement = recollir.string();
                    System.out.println("Com et dius?");

                    String nom = recollir.string();
                    System.out.println("Per acabar, quants anys tens?");

                    int edat = recollir.numEnter();
                    prediccio fer = new prediccio();
                    String resultat = fer.Prediccio(mesNaixement, nom, edat);
                    System.out.println(resultat);
                    break;
                case 2:
                    acabarPrograma decisio = new acabarPrograma();
                    System.out.println("Gràcies per utilitzar el programa, fins aviat.");
                    acabar = decisio.Fi();
                    break;
                default:
                    System.out.println("Valor incorrecte, escull entre el 1 i el 2");
                    break;
            }
        }
    }
}
