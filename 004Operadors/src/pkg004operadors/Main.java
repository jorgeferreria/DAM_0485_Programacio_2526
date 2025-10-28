package pkg004operadors;

public class Main {

    public static void main(String[] args) {
        
        int num1 = 19, num2 = 15;
        double cartera = 30000; // €
        
        // OPERADORS LOGICS
        // AND => &&
        
        System.out.println(true && true  &&  true); // true
        System.out.println(false && true); // false
        System.out.println(true && false); // false
        System.out.println(false && false); // false
        
        System.out.println(num1 >= 18 || cartera >= 10);
        //OR => || (ALTGR + 1)
        
        // OPERADORS DE COMPARACIÓ
        
        System.out.println(num1 == num2);
        System.out.println(num1 != num2);
        
        System.out.println(num1 > num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 < num2);
        System.out.println(num1 <= num2);
        
        // OPERADORS NUMERICS
        System.out.println(num1 % num2);
              
        System.out.println(--num1); // PREORDEN
        
        num1--;
        System.out.println(num1 + 5); // POSTORDEN
               
        System.out.println(--num1); // PREORDEN
        
        System.out.println(num1);
        
        
        
    }
    
}
