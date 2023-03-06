package fr.solutec.resaevents.service;

import fr.solutec.resaevents.entites.Salles;
public class SallesService {
        public Salles create(Salles salle) {
            Salles admin = new Salles();
            admin.setNom(salle.getNom());
            admin.setCapacite(100);
            return admin;
        }
        public void display(Salles salle){
            System.out.println(" la salle " + salle.getNom() + " a pour capacité " + salle.getCapacite() + " personnes. ");
        }
    }
