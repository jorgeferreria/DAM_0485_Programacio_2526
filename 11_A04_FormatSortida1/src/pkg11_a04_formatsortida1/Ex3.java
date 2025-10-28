package pkg11_a04_formatsortida1;

public class Ex3 {

    public static void main(String[] args) {
        String nom1 = "ANTONI", nom2 = "PAU", nom3 = "LAURA",
               cognom11 = "LOPEZ", cognom12 = "RODRIGUEZ", 
               cognom21 = "GARCÍA", cognom22 = "ARENÒS", 
               cognom31 = "GONZÁLEZ", cognom32 = "BAYÉS", 
               ciutat1 = "Montcada i Reixac", ciutat2 = "Barcelona", ciutat3 = "Cerdanyola";
        int edat1 = 17, edat2 = 5, edat3 = 101;
        double alsada1 = 1.67, alsada2 = 1.4, alsada3= 1.552;
        
        System.out.printf("%-12s;%-15s;%-15s;%3d;%4.2f;%20s\n", 
                nom1, cognom11, cognom12, edat1, alsada1, ciutat1);
        System.out.printf("%-12s;%-15s;%-15s;%3d;%4.2f;%20s\n", 
                nom2, cognom21, cognom22, edat2, alsada2, ciutat2);
        System.out.printf("%-12s;%-15s;%-15s;%3d;%4.2f;%20s\n", 
                nom3, cognom31, cognom32, edat3, alsada3, ciutat3);
    }
    
}
