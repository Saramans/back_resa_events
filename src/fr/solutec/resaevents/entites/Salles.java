package fr.solutec.resaevents.entites;

public class Salles {
    private int id;
    private int capacite;
    private String nom;

    public void setNom(String nom){
        this.nom = nom;
    }
    public String getNom() {
        return this.nom;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }

    public void setCapacite(int capacite){
        this.capacite = capacite;
    }
    public int getCapacite(){
        return this.capacite;
    }

}
