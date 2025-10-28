package pkg006condicionals;

public class Switch {

    public static void main(String[] args) {
        
        char opcio = 'A'; // A B C D E
        switch (opcio) {
            case 'A':
            case 'B':
                System.out.println("Opció A o B");
                break;
            case 'C':
                System.out.println("Opció C");
                break;
            case 'D':
                System.out.println("Opció D");
                break;
            case 'E':
                System.out.println("Opció E");
                break;
            default:
                System.out.println("Opció Incorrecta");
                break;
        }

    }
    
}
