package tests;

import classes.Punt;
import classes.Rectangle;


public class TestRectangle {
    
    public static void main(String[] args) {
        
        Rectangle r1 = new Rectangle(new Punt(3,5), new Punt(7,8));
        Rectangle r2 = new Rectangle(5, 3);
        
        System.out.println(r1);
        
        System.out.println(r1.calcularSuperficie());
        r1.desplacar(2, 5);
        
        System.out.println(r1);
        
    }
    
}
