package pkg012herencia;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        Alumno a1 = new Alumno("Pepe", "A1", 25, 453567);
        Alumno a2 = new Alumno("Maria", "A2", 25, 766545);
        //Alumno a3 = new Alumno("Lucia", "A3", 25, 566577);
        //Alumno a4 = new Alumno("Andres", "A4", 25, 234467);
        
        Professor p1 = new Professor("Jorge", "P1", 27, "Informatica");
        
        List<Persona> misPersonas = new ArrayList();
        
        misPersonas.add(new Alumno("Lucia", "A3", 25, 566577));
        misPersonas.add(new Professor("Andres", "P2", 55, "Tecno"));
        
        for (Persona persona : misPersonas) {
            persona.irBanyo();
        }
        
//        System.out.println(a1);
//        System.out.println(p1);
//        
//        a1.estudiar();
//        p1.explicar();
//        
//        a1.irBanyo();
//        p1.irBanyo();
        
    }
    
}
