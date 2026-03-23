package pkg51_a02_registreestudiants;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        
        Curs c = new Curs();
        
        Estudiant e1 = null;
        Estudiant e2 = null;
        Estudiant e3 = null;
        Estudiant e4 = null;
        Estudiant e5 = null;
        
        try {
            e1 = new Estudiant("Pepe", -20);
            c.registrarEstudiant(e1);
        } catch (EstudianteInvalidoException | CursoLlenoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            e2 = new Estudiant("Pepe", 22);
            c.registrarEstudiant(e2);
        } catch (EstudianteInvalidoException | CursoLlenoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            e3 = new Estudiant("", 29);
            c.registrarEstudiant(e3);
        } catch (EstudianteInvalidoException | CursoLlenoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            e4 = new Estudiant("Hugo", 20);
            c.registrarEstudiant(e4);
        } catch (EstudianteInvalidoException | CursoLlenoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            e5 = new Estudiant("Hugo", 26);
            c.registrarEstudiant(e5);
        } catch (EstudianteInvalidoException | CursoLlenoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        System.out.println(c.estudiantsRegistrats());
        
        System.out.println(c);
    }
    
}
