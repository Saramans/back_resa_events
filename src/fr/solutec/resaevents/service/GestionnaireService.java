package fr.solutec.resaevents.service;

import fr.solutec.resaevents.entites.Gestionnaire;


public class GestionnaireService {

    public Gestionnaire create(Gestionnaire gestionnaire) {
        Gestionnaire admin = new Gestionnaire();
        admin.setNom(gestionnaire.getNom());
        return admin;
    }

}

