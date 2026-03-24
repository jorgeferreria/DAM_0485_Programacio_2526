package pkg51_a04_excepcionsilogs;

import java.util.List;

public interface IGestioPersona {
    void afegir(Persona p) throws GestioPersonaException, DadesPersonaNoValidesException;
    Persona cercar(String nif) throws GestioPersonaException, DadesPersonaNoValidesException;
    List<Persona> llistat();
    
}
