package AEA3.Examen;
import utilidades.recollirDades;


public class Examen2 {

    public static double[] notes = new double[50];
    public int MARCA_NOTES = -1;
    public int NUM_NOTES = 0;
    public String MARCA_FI = "fi";
    private boolean fi = false;
    public double max = 0;
    public double min = 10;
    public double mitj = 0;
    recollirDades recollir = new recollirDades();


    private final CalculArrays calculador = new CalculArrays();
    //private final CercaDicotomica cerca = new CercaDicotomica(); //no la uso
    private final NotaAText transformar = new NotaAText();


    public static void main(String[] args) {
        Examen2 programa = new Examen2();
        programa.inici();
    }

    public void inici(){
        PreguntarNotes();
        ImprimirArrayNotes();
        while (!fi) {
            MostrarMenu();
            String opcio = recollir.string().toLowerCase();
            if(opcio.equals(MARCA_FI)) {
                fi = true;
                System.out.println("Gràcies per utilitzar el programa!");
            } else {
                TractarOpcio(opcio);
                boolean hiha8 = MirarSiAlgu8();
                if (hiha8 == true) {
                    System.out.println("A més, hi ha un 8 entre les notes! Felicitats");
                } else {
                    System.out.println("No hi ha ningun 8 entre les notes.");
                }
            }
        }
    }

    //Param. entr:no en té
    //Param. sort:no en té
    //FUNCIÓ: llegir les notes
    private void PreguntarNotes() {
        System.out.println("Abans de començar, escriu tantes notes Enteres com vulguis");
        System.out.println();
        System.out.println("Quan hagis acabat d'escriure les notes, escriu un -1.");
        System.out.println("---------------------------------------------------");

        for(int i = 0; i < notes.length; i++) {
            int nota = recollir.numEnter();
            if (nota == -1) {
                break;
            } else if (nota >= 0 && nota <= 10) {
                notes[i] = nota;
                NUM_NOTES++;
            } else {
                System.out.println("Has d'intorduir una nota que estigui entre el 0-10 o un -1 per acabar d'escriure notes.");
                i--;
                NUM_NOTES--;
            }
        }
        //OPCIÓ 1 --> Les dades les definim DIRECTAMENT al programa
        //Desenvolupeu el vostre codi aquí


        // -----------------------

        //OPCIÓ 2 --> PUNTUACIÓ EXTRA (1p+). Agafem les dades de terminal
        //Comenceu per l'opció 1!!
        //System.out.println("\nAbans de començar, escriu tantes notes ENTERES com vulguis.");
        //System.out.println("\nQuan hagis acabat d'escriure les notes, escriu un -1.");
        //System .out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");
        //Desenvolupeu el vostre codi aquí
    }

    //Param. entr: no hay
    //Param. sort: no hay
    //FUNCIÓ: imprimir l'array de les notes just després que les haguem llegit
    private void ImprimirArrayNotes() {
        System.out.print("L'array de notes avaluat és: ");
        System.out.print(" [");
        for(int i = 0; i < NUM_NOTES; i++) {
            System.out.print(notes[i] + ", ");
        }
        System.out.print("]");

    }

    //Param. entr: no hay
    //Param. sort: no hay
    private void MostrarMenu() {
        System.out.println("\nBenvinguda al càlcul de notes de classe.");
        System .out.println("------------------------------");
        System.out.println("[MAX] Saber la nota màxima de classe");
        System.out.println("[MIN] Saber la nota mínima de classe");
        System.out.println("[MIT] Saber la nota mitjana de classe");
        System.out.println("[FI] Sortir.");
        System.out.print("Opció: ");
    }

    //Param. entr: opcion escogida
    //Param. sort:  no hay
    //FUNCIÓ: tractar cadascuna de les opcions que l'usuari pot triar
    private void TractarOpcio(String opcio) {
        if (opcio.equals("max")) {
            double notaMax = calculador.calcularMaxim(notes, NUM_NOTES);
            String text = transformar.notaAText(notaMax);
            ImprimirResultat(notaMax, text, "MAX");
        } else if(opcio.equals("min")) {
            double notaMin = calculador.calcularMinim(notes, NUM_NOTES);
            String text = transformar.notaAText(notaMin);
            ImprimirResultat(notaMin, text, "MIN");
        } else if (opcio.equals("mit")) {
            double notaMit = calculador.calcularMitjana(notes, NUM_NOTES);
            String text = transformar.notaAText(notaMit);
            ImprimirResultat(notaMit, text, "MIT");
        } else if (opcio.equals("fi")) {
            System.out.println("Gracies per utilitzar el programa.");
        } else {
            System.out.println("Opció no vàlida");
        }
    }

    //Param. entr: la nota que volem transformar en text
    //Param. sort: la nota JA transformada en text i si modificar la variable per saber si algú ha tret un 8.
    //FUNCIÓ: Cridem la funció que ens transforma en text la notra nota.
    /*private String PrepararSortida(double valor) {
        // 
    }*/

    //Param. entr: no hay
    //Param. sort: devuelve si hay 8 true y si no false
    //FUNCIÓ: buscar si algú ha tret un 8 utilitzant una funció ja creada no utilizo la otra funciona rara esa
    private boolean MirarSiAlgu8() {
        boolean esVuit = false;
        for (int i =0; i < NUM_NOTES; i++ ) {
            if(notes[i] == 8){
                esVuit = true;
                break;
            }
        }
        return esVuit;
    }

    //Param. entr: nota max/min/mit, si es suspenso o aprovado o notable... i por ultimo la opcion
    //Param. sort: no hay
    //FUNCIÓ: imprimir el resultat de l'opció que l'usuari ha triat.
    private void ImprimirResultat(double valornota, String text, String opcio) {
        String opcioescollida = "";
        if (opcio.equalsIgnoreCase("MAX")){
            opcioescollida = "màxim";
        }
        else if (opcio.equalsIgnoreCase("MIN")){
            opcioescollida = "mínim";
        }
        else {
            opcioescollida = "mitjà";
        }
        System.out.print("El valor " + opcioescollida +" de l'array que has escrit és " + valornota);
        System.out.println(" que equival a un " + text + ".\n");
    }

}
