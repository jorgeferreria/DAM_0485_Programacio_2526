package pkg51_a02_registreestudiants;

import java.util.ArrayList;
import java.util.List;

public class Curs {
    
    final public int MAX_ALUMNES = 2;
    private List<Estudiant> estudiants;

    public Curs() {
        estudiants = new  ArrayList();
    }

    public boolean registrarEstudiant(Estudiant e) throws CursoLlenoException{
        if (estudiants.size() >= MAX_ALUMNES ){
            throw new CursoLlenoException("El curs està ple!");
        }
        
        if(e != null && !estudiants.contains(e)){
            return estudiants.add(e);
        }
        
        return false;
    }
    
    public boolean eliminarEstudiant(Estudiant e){        
        return estudiants.remove(e);        
    }

    public int estudiantsRegistrats(){
        return estudiants.size();
    }

    @Override
    public String toString() {
        return "Curs{" + "estudiants=" + estudiants + '}';
    }
    
}
