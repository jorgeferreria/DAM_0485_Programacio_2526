package pkg51_a06_gestiobotiga;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GestioBotigues {

    private Map<Client, Botiga> steam;

    public GestioBotigues() {
        steam = new HashMap();
    }

    public void afegirJoc(Client client, Joc joc) {

        if (client != null) {
            if (!comprovarClient(client)) {
                steam.put(client, new Botiga());
            }

            steam.get(client).afegir(joc);
        }

    }

    public void eliminarJoc(Client client, Joc joc) {
        if (client != null && joc != null
                && comprovarClient(client) && comprovarJoc(client, joc)) {
            steam.get(client).eliminar(joc);
        }

    }

    public void eliminarClient(Client client) {

        if (client != null) {
            steam.remove(client); // Elimina el client i la seva botiga associada.
        }

    }

    private boolean comprovarClient(Client client) {
        return steam.containsKey(client);
    }

    private boolean comprovarJoc(Client client, Joc joc) {

        if (client != null && joc != null) {
            return steam.get(client).conte(joc);
        }

        return false;

    }

    public List<Joc> obtenirJocs(Client client) {
        List<Joc> jocs = new ArrayList();
        if (client != null) {
            jocs = new ArrayList(steam.get(client).getJocs());
        }
//        List<Joc> jocs = new ArrayList();
//        
//        for (Joc joc : steam.get(client).getJocs()) {
//            jocs.add(joc);
//        }

        return jocs;
    }

    public List<Joc> obtenirJocsCategoria(Client client, String categoria) {
        List<Joc> jocs = new ArrayList();

        for (Joc joc : steam.get(client).getJocs()) {
            if (joc.getCategoria().equalsIgnoreCase(categoria)) {
                jocs.add(joc);
            }
        }

        return jocs;
    }

    public int eliminarClientsPerJoc(Joc joc) {
        int totalEliminats = 0;

        Iterator<Map.Entry<Client, Botiga>> it = steam.entrySet().iterator();

        while (it.hasNext()) {

            Map.Entry<Client, Botiga> entry = it.next();
            Client client = entry.getKey();
            Botiga botiga = entry.getValue();

            if (botiga.getJocs().contains(joc)) {
                totalEliminats++;
                it.remove();
            }

        }

        return totalEliminats;
    }

    public int eliminarClientsPerCategoria(String categoria) {
        int totalEliminats = 0;

        Iterator<Map.Entry<Client, Botiga>> it = steam.entrySet().iterator();

        while (it.hasNext()) {

            Map.Entry<Client, Botiga> entry = it.next();
            Client client = entry.getKey();
            Botiga botiga = entry.getValue();

            for (Joc joc : botiga.getJocs()) {
                if (joc.getCategoria().equalsIgnoreCase(categoria)) {
                    totalEliminats++;
                    it.remove();
                }
            }

        }

        return totalEliminats;
    }

    public void imprimir() {
        if (!steam.isEmpty()) {

            System.out.println("BOTIGUES:");
            System.out.println("---------------------------------------------------------------");

            for (Map.Entry<Client, Botiga> entry : steam.entrySet()) {
                Client key = entry.getKey();
                Botiga value = entry.getValue();

                System.out.println(key);
                value.mostrarJocs();
            }

        } else {
            System.out.println("NO HI HA BOTIGUES");
        }

    }
}
