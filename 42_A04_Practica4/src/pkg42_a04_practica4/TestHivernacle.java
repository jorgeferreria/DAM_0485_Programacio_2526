package pkg42_a04_practica4;

public class TestHivernacle {

    public static void main(String[] args) {

        Hivernacle h = new Hivernacle(10);

        for (int i = 0; i < 15; i++) {
            h.afegirPlanta(new AmbFruits(5, 5, 3, 10));
            h.temps();
            System.out.println(h);

            if (i % 5 == 0) {
                System.out.println(h.collirFruits());
            }
        }

    }

}
