package pkg012herencia;

public class Main {

    public static void main(String[] args) {
        
        Alumno a1 = new Alumno("Pepe", "A1", 25, 453567);
        Alumno a2 = new Alumno("Maria", "A2", 25, 766545);
        Alumno a3 = new Alumno("Lucia", "A3", 25, 566577);
        Alumno a4 = new Alumno("Andres", "A4", 25, 234467);
        
        Professor p1 = new Professor("Jorge", "P1", 27, "Informatica");
        
        Persona per = new Persona("nose", "sinnif", -10);
        
        System.out.println(a1);
        System.out.println(p1);
        
    }
    
}
