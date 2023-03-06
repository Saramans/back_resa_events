package fr.solutec.resaevents.service;

import fr.solutec.resaevents.entites.Lieux;
import fr.solutec.resaevents.entites.Personne;

public class PersonneService {
     public Personne create(Personne personne) {
            Personne admin = new Personne();
            admin.setNom(personne.getNom());
            admin.setPrenom(personne.getPrenom());
            admin.setMail(personne.getMail());
            admin.setMotdepasse(personne.getMotdepasse());
            admin.setTelephone(personne.getTelephone());
            return admin;
        }
}
