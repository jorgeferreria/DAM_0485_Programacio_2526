package classes;

public class Punt {
    // ATRIBUTOS
    private int x;
    private int y;

    // CONSTRUCTORES
    public Punt() {
        x = 0;
        y = 0;
    }
    
    public Punt(int x, int y) {
//        this.x = x;
//        this.y = y;
        setX(x);
        setY(y);
    }
    
    // SETTERS AND GETTERS
    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x >= -100 && x <= 100){
            this.x = x;
        } else {
            this.x = 0;
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (y >= -100 && y <= 100){
            this.y = y;
        } else {
            this.y = 0;
        }
    }

    // MÉTODOS PROPIOS
    
    
    // TO_STRING
    @Override
    public String toString() {
        return "[" + x + ", " + y + ']';
    }
    
}
