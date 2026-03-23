package pkg51_a02_registreestudiants;

public class CursoLlenoException extends Exception{

    public CursoLlenoException() {
    }

    public CursoLlenoException(String message) {
        super(message);
    }

    public CursoLlenoException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
