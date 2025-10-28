package pkg11_a07_dadesentrada2;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        final int MESOS_ANY = 12;
        String nomServei;
        double pagamentMensual, pagamentAnual, estalvi, pagamentMesAnual,
                rentabilitatMesos;
        
        System.out.print("Nom del servei que vols contractar: ");
        nomServei = lector.nextLine();
        
        System.out.print("Import del pagament mensual en euros: ");
        pagamentMensual = lector.nextDouble();
        
        System.out.print("Import del prepagament anual en euros: ");
        pagamentAnual = lector.nextDouble();
        
        estalvi = pagamentMensual * MESOS_ANY - pagamentAnual;        
        pagamentMesAnual = pagamentAnual / MESOS_ANY;
        rentabilitatMesos = pagamentAnual / pagamentMensual;
        
        System.out.printf("Si contractes %s per un any t'estalvies %.2f€.\n",
                nomServei, estalvi);
        
        System.out.printf("Et surt rentable a partir de %.0f mesos de servei.\n",
                rentabilitatMesos);
        
        System.out.printf("Cada mes et surt per %.2f€.\n", pagamentMesAnual);
        
/*
Nom del servei que vols contractar: Google One 100 GB
Import del pagament mensual en euros: 1,99
Import del prepagament anual en euros: 19,99
Si contractes Google One 100 GB per un any t'estalvies 3,89€. 
Et surt rentable a partir de 10 mesos de servei. 
Cada mes et surt per 1,67€. 
*/        
    }
    
}
