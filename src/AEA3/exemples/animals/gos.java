package AEA3.exemples.animals;

public class gos extends animal { 
    private String raça;
    private int edad;
    
    public gos(String quinAnimal, String color, int anyNaixament, String raça, int edad) {
        super(quinAnimal, color, anyNaixament);
        this.raça = raça;
        this.edad = edad;
    }

    public void setRaça(String novaraça) {raça = novaraça;}
    public void setEdad(int novaEdad) {edad = novaEdad;}

    public String getRaça() {return raça;}
    public int getEdad() {return edad;}
    
    public void sound() {
        bark();
    }

    public void bark() {
        System.out.println("Bof, bof");
    }
}
