package arraylists;

public class RefenciaValor {

    public static void main(String[] args) {
        int[] num = {5};
        
        miMetodo(num);
        
        System.out.println(num[0]);
        
        
    }
    
    public static int[] miMetodo(int[] num){
        num[0]++;
        System.out.println(num[0]);
        return num;
    }
    
}
