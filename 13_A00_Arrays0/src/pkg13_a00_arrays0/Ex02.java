package pkg13_a00_arrays0;

public class Ex02 {

    public static void main(String[] args) {

        double temperatures[]
                = {2.5, 7.5, 9.65, 15.05, 19.25, 24.9, 29.0, 27.5, 22.0, 17, 11.2, 9.2};

        for (int i = 0; i < temperatures.length; i++) {
            System.out.println("temperatures[" + (i + 1) + "] = " + temperatures[i]);
        }
        System.out.println("---------- MESOS SENARS ------------");
        for (int i = 0; i < temperatures.length; i++) {
            if (i % 2 == 0) {
                System.out.println("temperatures[" + (i + 1) + "] = " + temperatures[i]);
            }
        }
        
        System.out.println("---------- MESOS PARELLS ------------");
        for (int i = 1; i < temperatures.length; i+=2) { 
                System.out.println("temperatures[" + (i + 1) + "] = " + temperatures[i]);
        }
        
        System.out.println("---------- MESOS DECREIXENT ------------");
        for (int i = temperatures.length - 1; i >= 0 ; i--) {
            System.out.println("temperatures[" + (i + 1) + "] = " + temperatures[i]);
        }
    }

}
