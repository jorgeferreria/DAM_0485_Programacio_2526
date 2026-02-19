package pkg42_a01_pràctica01;

public class Operari extends Empleat{
    
    public Operari(String nom) {
        super(nom);
    }

    public void trabajar(){
        System.out.println("Sóc Operari i estic treballant");
    }
    
    @Override
    public String toString() {
        return "Operari{" + super.toString() + "}";
    }
    
}
