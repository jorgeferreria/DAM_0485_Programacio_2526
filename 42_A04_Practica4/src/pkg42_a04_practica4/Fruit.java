package pkg42_a04_practica4;

public class Fruit {
    public int MIN_ES_MADUR;
    private int comptMadur;
    private boolean esMadur;

    public Fruit(int minEsMadur) {
        MIN_ES_MADUR = minEsMadur;
        comptMadur = 0;
        esMadur = false;
    }

    public boolean isEsMadur() {
        return esMadur;
    }
    
    public void creix(){
        comptMadur++;
        
        if(comptMadur >= MIN_ES_MADUR ){
            esMadur = true;
        }
    }

    @Override
    public String toString() {
        return "Fruit{" + "MIN_ES_MADUR=" + MIN_ES_MADUR + ", comptMadur=" + comptMadur + ", esMadur=" + esMadur + '}';
    }
    
    
    
    
}
