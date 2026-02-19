package pkg42_a01_pràctica01;

public class Tecnic extends Operari{
    
    public Tecnic(String nom) {
        super(nom);
    }

    @Override
    public void trabajar(){
        System.out.println("Sóc Tecnic i estic treballant");
    }
    
    @Override
    public String toString() {
        return "Tecnic{" + super.toString() + "}";
    }
    
}
