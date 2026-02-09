package AEA3.exemples.animals;

public class animal {
    private String quinAnimal;
    private String color;
    private int anyNaixament;

    public animal(String quinAnimal, String color, int anyNaixament) {
        this.quinAnimal = quinAnimal;
        this.color = color;
        this.anyNaixament = anyNaixament;
    }

    public void setAnimal(String nouAnimal) {quinAnimal = nouAnimal;}
    public void setColor(String nouColor) {color = nouColor;}
    public void setAnynaixament(int nouAny) {anyNaixament = nouAny;}

    public String getAnimal() {return quinAnimal;}
    public String getColor() {return color;}
    public int getAnynaixament() {return anyNaixament;}

    public void sound() {
        System.out.println("No tinc cap soroll!!");
    }
}
