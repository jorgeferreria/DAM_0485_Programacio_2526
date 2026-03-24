package pkg51_a04_excepcionsilogs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.logging.LogManager;

public class PersonaControl {
    Scanner sc;
    GestioPersona gp;
    public final Logger LOGGER;

    public PersonaControl() {
        sc = new Scanner(System.in);
        gp = new GestioPersona();
        this.LOGGER = Logger.getLogger(PersonaControl.class.getName());
        configLogManager();
        afegirDadesInicials();
    }
    
    public void afegir() {
        String nif = null;
        String nom = null;
        LocalDate dataNaixement = null;

        System.out.print("Dis-me el NIF: ");
        nif = sc.nextLine();

        System.out.print("Dis-me el NOM: ");
        nom = sc.nextLine();

        System.out.print("Dis-me la data de naixement (dd-mm-aaaa): ");

        try {
            dataNaixement = passarStringAData(sc.nextLine());
            gp.afegir(new Persona(nif, nom, dataNaixement));

            LOGGER.log(Level.INFO, "Persona afegida");

        } catch (DadesPersonaNoValidesException ex) {
            LOGGER.log(Level.WARNING, ex.getMessage());

        } catch (GestioPersonaException ex) {
            LOGGER.log(Level.SEVERE, ex.getMessage());
        }
    }
    
    public void cercar() {
        Persona persona = null;

        System.out.print("Dis-me el NIF de la persona a cercar: ");

        try {
            persona = gp.cercar(sc.nextLine());
            LOGGER.log(Level.INFO, persona.toString());

        } catch (DadesPersonaNoValidesException ex) {
            LOGGER.log(Level.WARNING, ex.getMessage());

        } catch (GestioPersonaException ex) {
            LOGGER.log(Level.SEVERE, ex.getMessage());
        }
    }

    public void llistar() {
        List<Persona> llistat = gp.llistat();
        int cont = 1;

        if (llistat.isEmpty()) {
            System.out.println("No hi ha persones al llistat");

        } else {
            System.out.println("Llistat de persones:");
            for (Persona persona : llistat) {
                System.out.println("\t" + cont + ". " + persona);
                cont++;
            }

        }
        
        System.out.println("--------------------------------------------------------------------------------");
    }

    
    private LocalDate passarStringAData(String dataText) throws DadesPersonaNoValidesException { // xx-xx-xxxx
        String[] data;

        if (dataText.length() == 10) {
            data = dataText.split("-"); // ["xx", "xx", "xxxx"]

            return LocalDate.of(
                    Integer.parseInt(data[2]),
                    Integer.parseInt(data[1]),
                    Integer.parseInt(data[0])
            );
        } else {
            throw new DadesPersonaNoValidesException("Data no vàlida!");
        }
    }
    
    
    private void afegirDadesInicials() {
        try {
            gp.afegir(new Persona("12345678A", "Pepe", LocalDate.of(2000, 01, 01)));
            LOGGER.log(Level.INFO, "Persona afegida");
            gp.afegir(new Persona("12345678B", "Maria", LocalDate.of(2001, 02, 02)));
            LOGGER.log(Level.INFO, "Persona afegida");
            gp.afegir(new Persona("12345678C", "Luis", LocalDate.of(2002, 03, 03)));
            LOGGER.log(Level.INFO, "Persona afegida");
            gp.afegir(new Persona("12345678D", "Anna", LocalDate.of(2003, 04, 04)));
            LOGGER.log(Level.INFO, "Persona afegida");
            gp.afegir(new Persona("12345678E", "Raul", LocalDate.of(2004, 05, 05)));
            LOGGER.log(Level.INFO, "Persona afegida");
            gp.afegir(new Persona("12345678F", "Elena", LocalDate.of(2005, 06, 06)));
            LOGGER.log(Level.INFO, "Persona afegida");
        } catch (DadesPersonaNoValidesException ex) {
            LOGGER.log(Level.WARNING, ex.getMessage());
        } catch (GestioPersonaException ex) {
            LOGGER.log(Level.SEVERE, ex.getMessage());
        }
    }

    private void configLogManager() {
        LogManager logManager = LogManager.getLogManager();
        // configurem el registre de logs amb un fitxer de properties
        try {
            logManager.readConfiguration(new FileInputStream("./fitxers/configLog.properties"));
        } catch (FileNotFoundException ex) {
            LOGGER.log(Level.SEVERE, ex.getMessage(), ex);
        } catch (IOException | SecurityException ex) {
            LOGGER.log(Level.SEVERE, ex.getMessage(), ex);
        }
    }
}
