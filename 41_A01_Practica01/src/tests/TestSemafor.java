package tests;

import classes.Semafor;

public class TestSemafor {

    public static void main(String[] args) {

        Semafor s1 = new Semafor();

        System.out.println(s1);

        for (int i = 0; i < 20; i++) {
            s1.canviar();
            System.out.println(s1);
        }

    }

}
