package pkg11_a02_chicken;

public class Ex1 {

    public static void main(String[] args) {
        //VARIABLES
        int ousGallinaDia = 4, numGallines = 9, 
                ousDilluns, ousDimarts, ousDimecres, ousTotals;
        
        //CODI
        ousDilluns = ousGallinaDia * numGallines;        
        
        numGallines = numGallines + 1; // 3 -> 4
        ousDimarts = ousGallinaDia * numGallines;        
        
        numGallines = numGallines / 2; // 4 -> 2
        ousDimecres = ousGallinaDia * numGallines;
        
        ousTotals = ousDilluns + ousDimarts + ousDimecres;
        
        System.out.println("Ous Dilluns: " + ousDilluns);
        System.out.println("Ous Dimarts: " + ousDimarts);
        System.out.println("Ous Dimecres: " + ousDimecres);
        System.out.println("Ous Totals: " + ousTotals);
        
        
        
        
    }
    
}
