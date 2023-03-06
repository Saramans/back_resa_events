package fr.solutec.resaevents.entites;

public class Personne {
    private int id;
    private String nom;
    private String prenom;
    private String motdepasse;
    private String mail ;
    private int telephone;

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
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    public String getPrenom() {
        return this.prenom;
    }

    public void setMotdepasse(String motdepasse){
        this.motdepasse = motdepasse;
    }
    public String getMotdepasse() {
        return this.motdepasse;
    }

    public void setMail(String mail){
        this.mail = mail;
    }
    public String getMail() {
        return this.mail;
    }

    public void setTelephone(int telephone){
        this.telephone = telephone;
    }
    public int getTelephone(){
        return this.telephone;
    }

}
