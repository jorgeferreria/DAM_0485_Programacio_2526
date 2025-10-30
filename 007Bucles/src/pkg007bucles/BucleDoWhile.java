package pkg007bucles;

public class BucleDoWhile {

    public static void main(String[] args) {
        
        int inici = 100, fi = 10;
        
        while (inici < fi){
            System.out.println(inici);
            inici++;
        }
        inici = 100;
        System.out.println("");
        do {
            System.out.println(inici);
            inici++;
        } while (inici < fi);
        
        
    }
    
}
