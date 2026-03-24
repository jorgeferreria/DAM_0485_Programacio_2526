package pkg51_a04_excepcionsilogs;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class GestioPersona implements IGestioPersona{
    private List<Persona> persones;

    public GestioPersona() {
        persones = new ArrayList();
    }
    
    @Override
    public void afegir(Persona p) throws GestioPersonaException {
        
        if(p == null || p.getNif() == null || p.getNif().equals("") ||
                p.getNom() == null || p.getNom().equals("") || persones.contains(p)){
            throw new GestioPersonaException("Dades de la persona no vàlides");
        }
        
        if(!comprovarNif(p.getNif())){
            throw new DadesPersonaNoValidesException("NIF no vàlid!");
        }
        
        if(!comprovarEdat(p.getDataNaixement())){
            throw new DadesPersonaNoValidesException("Edad no vàlida!");
        }
        
        persones.add(p);
    
    }

    @Override
    public Persona cercar(String nif) throws DadesPersonaNoValidesException, GestioPersonaException {
        Persona pBuscar = new Persona(nif, null, null);
        
        if(!comprovarNif(nif)){
            throw new DadesPersonaNoValidesException("NIF no vàlid!");
        }
        
        if(!persones.contains(pBuscar)){
            throw new GestioPersonaException("El NIF no està a la llista!");
        }
        
        return persones.get(persones.indexOf(pBuscar));
    
    }

    @Override
    public List<Persona> llistat() {
        return persones;
    }
    
    private boolean comprovarNif(String nif){
        boolean valid = false;
        
        if (nif.length() == 9){ // FALTA VALIDAR % 23
            valid = true;
        }
        
        return valid;
    }
    
    private boolean comprovarEdat(LocalDate data){
        int edat;
        boolean edatCorrecta = false;
        
        edat = Period.between(data, LocalDate.now()).getYears();
        
        if(edat >= 16 && edat <= 65) {
            edatCorrecta = true;
        }
        
        return edatCorrecta;
    }

    @Override
    public String toString() {
        return "GestioPersona{" + "persones=" + persones + '}';
    }
    
}
