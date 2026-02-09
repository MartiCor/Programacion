package AEA3;

public class persona {

    private String dni;
    private String nom;
    private short edat;

    public persona(String dni, String nom, short edat) {
        this.dni = dni;
        this.nom = nom;
        this.edat = edat;
    }

    public persona(String nom, short edat) {
        this.nom = nom;
        this.edat = edat;
    }

    public persona(short edat, String dni) {
        this.edat = edat;
        this.dni = dni;
    }   

    public persona(String dni) {
        this.dni = dni;
    }

    public persona(short edat) {
        this.edat = edat;
    }

    public persona() {
        
    }


    public int setDni(String nouDni) {
        dni = nouDni;
        return 0;
    }

    public void setNom(String nouNom) {
        nom = nouNom;
    }

    public int setEdat(int novaEdat) {
        if (novaEdat < 0) {
            return 1;
        }
        if (novaEdat > Short.MAX_VALUE){
            return 2;
        }
        edat = (short) novaEdat;
        return 0;
    }

    public String getDni() {
        return dni;
    }

    public String getNom() {
        return nom;
    }

    public short getEdat() {
        return edat;
    }


    public void visualitzar() {
        System.out.println("Dni...........:" + dni);
        System.out.println("Nom...........:" + nom);
        System.out.println("Edat..........:" + edat);
    }
    

}
    

