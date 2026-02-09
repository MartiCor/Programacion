package AEA3.Tasca5;

public class Persona {

    private int id;
    private int edat;
    private String nom;
    private String cognom;
    private String adreça;

    public Persona(int id, int edat, String nom, String cognom, String adreça) {
        this.id = id;
        this.edat = edat;
        this.nom = nom;
        this.cognom = cognom;
        this.adreça = adreça;
    }

    public Persona(int id, String nom, String cognom) {
        this.id = id;
        this.nom = nom;
        this.cognom = cognom;
    }

    public void setId(int nouId) {
        id = nouId;
    }

    public int setEdat(int novaEdat) {
        if (novaEdat < 0) {
            return 1;
        }
        edat = novaEdat;
        return 0;
    }

    public void setNom(String nouNom) {
        nom = nouNom;
    }

    public void setCognom(String nouCognom) {
        cognom = nouCognom;
    }

    public void setAdreça(String novaAdreça) {
        adreça = novaAdreça;
    }

    public int getId() {
        return id;
    }

    public int getEdat() {
        return edat;
    }

    public String getNom() {
        return nom;
    }

    public String getCognom() {
        return cognom;
    }

    public String getAdreça() {
        return adreça;
    }
}
