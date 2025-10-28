package pkg11_a02b_bus1;

public class Ex1 {

    public static void main(String[] args) {
        // VARIABLES
        int clientsPugen, clientsBaixen, totalClients = 0, 
        clientsStop1, clientsStop2, clientsStop3;
        //CODI
        //PARADA1
        clientsPugen = 6;
        clientsBaixen = 0;
        
        totalClients = totalClients + clientsPugen;
        clientsStop1 = clientsPugen - clientsBaixen;
        
        //PARADA2
        clientsPugen = 8;
        clientsBaixen = 3;
        
        totalClients = totalClients + clientsPugen;
        clientsStop2 = clientsStop1 + clientsPugen - clientsBaixen;
        
        //PARADA3
        clientsPugen = 5;
        clientsBaixen = 4;
        
        totalClients = totalClients + clientsPugen;
        clientsStop3 = clientsStop2 + clientsPugen - clientsBaixen;        
        
        //RESULTATS
        System.out.println("Clients Parada 1: " + clientsStop1);
        System.out.println("Clients Parada 2: " + clientsStop2);
        System.out.println("Clients Parada 3: " + clientsStop3);
        
        System.out.println("Total de clients: " + totalClients);
    }
    
}
