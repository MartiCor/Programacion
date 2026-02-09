package AEA3.Tasca5;

public class Estudiant extends Persona {

    private String curs;
    private String [] assignatures;
    private String escola;
    private double [] notes;

    public Estudiant(int id, int edat, String nom, String cognom, String adreça, String curs, String escola) {
        super(id, edat, nom, cognom, adreça);
        this.curs = curs;
        this.escola = escola;
    }

    public Estudiant(int id, String nom, String cognom, String curs, String escola) {
        super(id, nom, cognom);
        this.curs = curs;
        this.escola = escola;
    }

    public Estudiant(int id, String nom, String cognom) {
        super(id, nom, cognom);
    }
    
    public void setCurs(String nouCurs) {
        curs = nouCurs;
    }

    public void setAssignatures(String [] novesAssignatures) {
        for (int i = 0; i < assignatures.length; i++) {
            assignatures[i] = novesAssignatures[i];
        }
    }

    public void setEscola(String novaEscola) {
        escola = novaEscola;
    }

    public void setNotes(double [] novesNotes) {
        for(int i = 0; i < notes.length; i++) {
            notes[i] = novesNotes[i];
        }
    }

    public String getCurs() {
        return curs;
    }

    public String [] getAssignatures() {
        return assignatures;
    }

    public String getEscola() {
        return escola;
    }

    public double [] getNotes() {
        return notes;
    }
}
