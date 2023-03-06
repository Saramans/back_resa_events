package fr.solutec.resaevents.entites;

public class Places {
    private int id;
    private int prix;
    private String libelle;
/*
    private Salles salles;

 */


    public void setLibelle(String libelle){
        this.libelle = libelle;
    }
    public String getLibelle() {
        return this.libelle;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }

    public void setPrix(int prix){
        this.prix = prix;
    }
    public int getPrix(){
        return this.prix;
    }
/*
    public void setSalles(int salles){
        this.salles = salles;
    }
    public int getSalles(){
        return this.salles;
 */

}
