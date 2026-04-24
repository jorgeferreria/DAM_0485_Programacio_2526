package pkg51_a06_gestiobotiga;

import java.util.ArrayList;
import java.util.HashMap;
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
        if(client != null && joc != null 
                && comprovarClient(client) && comprovarJoc(client, joc)) {
            steam.get(client).eliminar(joc);
        }
        
    }
    
    public void eliminarClient(Client client) {
        
        if (client != null){
            steam.remove(client); // Elimina el client i la seva botiga associada.
        }
        
    }

    private boolean comprovarClient(Client client) {
        return steam.containsKey(client);
    }
    
    private boolean comprovarJoc(Client client, Joc joc){
        
        if (client != null && joc != null){
            return steam.get(client).conte(joc);
        }
        
        return false;
        
    }
    
    public List<Joc> obtenirJocs(Client client){
        List<Joc> jocs = new ArrayList();
        if (client != null){
            jocs = new ArrayList(steam.get(client).getJocs());
        }
//        List<Joc> jocs = new ArrayList();
//        
//        for (Joc joc : steam.get(client).getJocs()) {
//            jocs.add(joc);
//        }
        
        return  jocs;
    }
    
    public List<Joc> obtenirJocsCategoria(Client client, String categoria) {
        List<Joc> jocs = new ArrayList();
        
        for (Joc joc : steam.get(client).getJocs()) {
            if(joc.getCategoria().equalsIgnoreCase(categoria)){
                jocs.add(joc);
            }
        }
        
        return  jocs;
    }
    
    
}
