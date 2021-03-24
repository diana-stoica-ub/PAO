package project;

import project.service.ClientService;

/**
 * Client, Loan, Rate
 */
public class Main {

    public static void main (String[] args) {
        ClientService clientService = new ClientService();

        clientService.registerClient("Marian Popescu");

        clientService.printClients();
    }
}
