package fr.solutec.resaevents.principal;

import fr.solutec.resaevents.entites.Role;
import fr.solutec.resaevents.service.RoleService;

import fr.solutec.resaevents.entites.Places;
import fr.solutec.resaevents.service.PlacesService;

import fr.solutec.resaevents.entites.Salles;
import fr.solutec.resaevents.service.SallesService;

import fr.solutec.resaevents.entites.Lieux;
import fr.solutec.resaevents.service.LieuxService;

public class Main {

    /*
    public static void main(String[] args) {
        RoleService roleService = new RoleService();
        Role role = new Role();
        role.setLibelle("Admin");
        Role resultat = roleService.create(role);
        roleService.display(resultat);


        Role roleUser = new Role();
        roleUser.setLibelle("USER");
        resultat = roleService.create(roleUser);
        roleService.display(resultat);
    }*/

    public static void main(String[] args) {
        PlacesService placesService = new PlacesService();
        Places places = new Places();
        places.setLibelle("numero 10");
        Places resultat = placesService.create(places);
        placesService.display(resultat);

        SallesService sallesService = new SallesService();
        Salles salle = new Salles();
        salle.setNom("numero 1");
        Salles resultat2 = sallesService.create(salle);
        sallesService.display(resultat2);

        LieuxService lieuxService = new LieuxService();
        Lieux lieux = new Lieux();
        lieux.setNom("Louvre");
        lieux.setAdresse(" 1 rue rivoli");
        lieux.setPays("France");
        lieux.setRegion("Ile de France");
        Lieux resultat3 = lieuxService.create(lieux);
        lieuxService.display(resultat3);
    }
}