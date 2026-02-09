package AEA3;

public class PPrinciapal {
    
    public static void main(String[] args) {
        
        persona persona1 = new persona("12345678a", "Martí", (short)18);

        persona persona2 = new persona("Alex", (short)21);
        persona2.setDni("98765421a");

        persona persona3 = new persona((short)20, "74185296k");
        persona3.setNom("Alejandro");

        persona persona4 = new persona("36925814i");
        persona4.setNom("Adria");
        persona4.setEdat(20);

        persona persona5 = new persona((short)23);
        persona5.setNom("aaaa");
        persona5.setDni("34561278l");


        System.out.println(persona5.getNom());
    }
}
