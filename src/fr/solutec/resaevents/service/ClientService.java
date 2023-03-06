package fr.solutec.resaevents.service;
import fr.solutec.resaevents.entites.Client;


public class ClientService {

    public Client create(Client client) {
        Client admin = new Client();
        admin.setNom(client.getNom());
        return admin;
    }

}
