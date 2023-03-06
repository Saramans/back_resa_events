package fr.solutec.resaevents.service;

import fr.solutec.resaevents.entites.Lieux;

public class LieuxService {
    public Lieux create(Lieux lieux) {
        Lieux admin = new Lieux();
        admin.setNom(lieux.getNom());
        admin.setPays(lieux.getPays());
        admin.setAdresse(lieux.getAdresse());
        admin.setRegion(lieux.getRegion());
        return admin;
    }
    public void display(Lieux lieux){
        System.out.println(" le lieu est " + lieux.getNom() + " a pour pays " + lieux.getPays() + ", pour region " + lieux.getRegion() + " et pour adresse" + lieux.getAdresse());
    }
}
