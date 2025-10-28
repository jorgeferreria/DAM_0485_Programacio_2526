package pkg11_a02_chicken;

public class Ex2 {

    public static void main(String[] args) {
       
        int ousDilluns = 100, ousDimarts= 121, ousDimecres = 117;
        final int DIES_MES = 30;
        double mitjanaDia, mitjanaMes, dies = 3 /* 3.0 */, beneficiOu = 0.18, beneficiTotal;
        
        mitjanaDia = (ousDilluns + ousDimarts + ousDimecres) / dies;
        
        System.out.println("Mitjana dia: " + mitjanaDia);
        
        mitjanaMes = mitjanaDia * DIES_MES;
        
        System.out.println("Mitjana mes: " + mitjanaMes);
        
        beneficiTotal = mitjanaMes * beneficiOu;
        
        System.out.println("Benefici total: " + beneficiTotal);
        
    }
    
}
