package pkg008arrays;

public class Main {

    public static void main(String[] args) {
        
        int notas[] = new int[100];
        
        notas[0] = 7; // ESCRIURE EN UNA POSICIO DEL ARRAY
        notas[1] = 8;
        notas[2] = 3;
        notas[3] = 6;
        notas[4] = 2;
        
//        System.out.println(notas[0]); // LLEGIR  UNA POSICIO DEL ARRAY
//        System.out.println(notas[1]); // LLEGIR  UNA POSICIO DEL ARRAY
//        System.out.println(notas[2]); // LLEGIR  UNA POSICIO DEL ARRAY
//        System.out.println(notas[3]); // LLEGIR  UNA POSICIO DEL ARRAY
//        System.out.println(notas[4]); // LLEGIR  UNA POSICIO DEL ARRAY
        
        System.out.println(notas.length);

        for (int i = 0; i <= notas.length; i++) {
            System.out.println(i + ". " +notas[i]);
        }
        
        System.err.println("Hola en rojo");

    }
    
}
