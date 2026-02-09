package tests;

import classes.Cafetera;

public class TestCafetera {

    public static void main(String[] args) {

        Cafetera c1 = new Cafetera();
        Cafetera c2 = new Cafetera(500);
        Cafetera c3 = new Cafetera(750, 250);
        Cafetera c4 = new Cafetera(250, 750);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println("*********************");

        c3.omplir();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println("*********************");

        c3.sevirTassa(200);
        c3.afegirCafe(500);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println("*********************");

    }

}
