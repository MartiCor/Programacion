package AEA3.exemples.animals;

public class principal {
    public static void main(String[] args) {
        animal animal1 = new animal("conill", "gris", 6);
        animal1.sound();

        gos gos1 = new gos("gos", "blanc", 2024, "nose", 2);
        gos1.sound();

        gat gat1 = new gat("gat", "negre" , 2020, "nose", 6);
        gat1.sound();
    }
}
