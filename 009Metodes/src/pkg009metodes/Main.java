package pkg009metodes;

public class Main {

    public static void main(String[] args) {
        String nombre = "Lucia", ciudad = "La llagosta", cadena = "";
        int edat = 89;
        
        cadena = saludar(nombre, ciudad, edat);

        System.out.println(cadena);
    }

    public static String saludar(String nombre, String ciudad, int edat) {
        String cadena;
        cadena = "HOLA " + nombre + " vives en " + ciudad 
                + " y tienes " + edat + " años";
        return cadena;
    }

}
