package fr.solutec.resaevents.entites;

public class Gestionnaire {
    private int id;
    private String nom;

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }

    public void setNom(String nom){
        this.nom = nom;
    }
    public String getNom() {
        return this.nom;
    }
}
