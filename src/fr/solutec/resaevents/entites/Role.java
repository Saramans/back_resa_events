package fr.solutec.resaevents.entites;

public class Role {
    // portée / type / nom de la propriété
    public Role(){
        this.active = false;
    }
    private int id;
    private boolean active;
    private String libelle;

    /*
        Définir des méthodes (actions)
     */
    // Signature
    // portee typeDeDonneRetournee nom(Parametre(type nom))
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

    public void setActive(boolean active){
        this.active = active;
    }
    public boolean getActive(){
        return this.active;
    }
}
