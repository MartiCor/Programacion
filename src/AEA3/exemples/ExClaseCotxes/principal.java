package AEA3.exemples.ExClaseCotxes;

public class principal {
    public static void main(String[] args) {
        cotxe cotxe1 = new cotxe("1234yhn", 2015, 8000, "Ferrari");
        seat seat1 = new seat("9874msn", 2020, 1250, "seat", "Ateca", "gris");
        arona arona1 = new arona("2584ñpo", 2022, 2500, "seat", "arona", "blau", "gasolina");

        System.out.println(cotxe1.getAnyFabricacio());
        System.out.println(seat1.getMatricula());
        System.out.println(arona1.getColor());
    }
}
