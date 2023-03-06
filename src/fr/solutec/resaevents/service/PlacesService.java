package fr.solutec.resaevents.service;

import fr.solutec.resaevents.entites.Places;


public class PlacesService {
    public Places create(Places place) {
        Places admin = new Places();
        admin.setLibelle(place.getLibelle());
        admin.setPrix(20);
        return admin;
    }
    public void display(Places place){
        System.out.println(" la place " + place.getLibelle() + " est au prix de " + place.getPrix() + " euros. ");
    }

}
