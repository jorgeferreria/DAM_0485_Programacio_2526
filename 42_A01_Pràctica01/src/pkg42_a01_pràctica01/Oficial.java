package pkg42_a01_pràctica01;

public class Oficial extends Operari{
    
    public Oficial(String nom) {
        super(nom);
    }

    @Override
    public void trabajar(){
        System.out.println("Sóc Oficial i estic treballant");
    }
    
    @Override
    public String toString() {
        return "Oficial{" + super.toString() + "}";
    }
    
    
}
