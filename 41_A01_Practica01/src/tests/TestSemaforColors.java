package tests;

import classes.SemaforColors;

public class TestSemaforColors {

    public static void main(String[] args) {
        
        SemaforColors s1 = new SemaforColors();

        System.out.println(s1);

        for (int i = 0; i < 4; i++) {
            s1.canviar();
            System.out.println(s1);
        }
        System.out.println("***************************");
        
        s1.afegirColor("BLAU");
        s1.afegirColor("BLAU");
        
        for (int i = 0; i < 5; i++) {
            s1.canviar();
            System.out.println(s1);
        }
        System.out.println("***************************");
        s1.afegirColor("GRIS");
        
        for (int i = 0; i < 6; i++) {
            s1.canviar();
            System.out.println(s1);
        }
        
    }
    
}
