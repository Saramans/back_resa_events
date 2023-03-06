package fr.solutec.resaevents.service;

import fr.solutec.resaevents.entites.Role;

public class RoleService {

    // public void est une fonction qui permet de parametrer les propriétés sans rien retourner
    // getLibelle (on recupère une donnée)
   /* public void create(Role role){
        Role admin = new Role();
        admin.setLibelle(role.getLibelle());
        admin.setId(23);
    }
    */

    // public Role est une fonction qui permet de parametrer les propriétés en retournant à la fin le Role
    public Role create(Role role){
        Role admin = new Role();
        admin.setLibelle(role.getLibelle());
        admin.setId(23);
        return admin ;
    }

    public void display(Role role){
        System.out.println(" le role " + role.getLibelle() + " a l'Id " + role.getId());
    }
}
