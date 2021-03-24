package project.service;

import project.model.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientService {

    private static List<Client> registeredClients = new ArrayList<>();

    public void registerClient(String name) {
        Client client = new Client();
        client.setName(name);
        registeredClients.add(client);
    }

    public void printClients() {
        System.out.println(registeredClients);
    }
}
