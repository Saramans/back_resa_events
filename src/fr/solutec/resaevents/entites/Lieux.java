package fr.solutec.resaevents.entites;

public class Lieux {

    private int id;
    private String nom;
    private String pays;
    private String adresse;
    private String region;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return this.nom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getPays() {
        return this.pays;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    public String getRegion() {
        return this.region;
    }


}