package AEA3.Tasca5;

import utilidades.recollirDades;

public class Principal {

    public static void main(String[] args) {

        recollirDades recollir = new recollirDades();

        Persona persona1 = new Persona(01, 18, "Martí", "Corrales", "carrer pujades");

        Persona persona2 = new Persona(02, "Adriana", "Amettler");
        persona2.setEdat(21);
        persona2.setAdreça("aaaaaaa");

        Estudiant estudiant1 = new Estudiant(03, "Leo", "Messi", "Primero DAM", "PratFP");
        String [] assignatures = new String[5];
        for(int i = 0; i < assignatures.length; i++) {
            assignatures [i] = recollir.string();
        }
        double [] notes = new double[5];
        for(int i = 0; i < notes.length; i++) {
            notes [i] = recollir.numReal();
        }
        estudiant1.setAssignatures(assignatures);
        estudiant1.setNotes(notes);
        estudiant1.setEdat(38);
        estudiant1.setAdreça("Miami");

        Estudiant estudiant2 = new Estudiant(04, 22, "AAAA", "BBBB", "Badalona", "Segundo de DAM", "PratFP");
        estudiant2.setAssignatures(assignatures);
        estudiant2.setNotes(notes);

        Estudiant estudiant3 = new Estudiant(05, "BBBBB", "CCCCCCc" );
        estudiant3.setEdat(55);
        estudiant3.setAdreça("Pamplona");
        estudiant3.setCurs("Primero de Marqueting");
        estudiant3.setEscola("PratFP");
        estudiant2.setAssignatures(assignatures);
        estudiant2.setNotes(notes);

        System.out.println(estudiant3.getAdreça());

    } 
}
