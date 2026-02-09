package tests;

import classes.Punt;

public class TestPunt {

    public static void main(String[] args) {
        
        Punt p1 = new Punt();
        Punt p2 = new Punt(3000, 5000);
        
        System.out.println(p1);
        System.out.println(p2);
        
        p1.setX(5);
        p1.setY(7);
        
        System.out.println(p1.getX() + " - " + p1.getY());
        
    }
    
}
