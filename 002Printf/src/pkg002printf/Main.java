package pkg002printf;

public class Main {

    public static void main(String[] args) {
        //VARIABLES
        int num1 = 67, num2 = 1234, num3 = 35642454;
        double valor1 = 13.158;
        //CODI
        System.out.printf("Valor de num1: %09d\n", num1);
        System.out.printf("Valor de num2: %09d\n", num2);
        System.out.printf("Valor de num2: %09d\n", num3);
        
        System.out.printf("%.1f\n", valor1);
        
        System.out.printf("num1: %09d, num2: %09d, num3: %09d\n", num1, num2, num3);
        
        System.out.printf("");

        
        
    }
    
}
