package classes;

public class Rectangle {
    
    // ATRIBUTOS
    private Punt p1;
    private Punt p2;
    private Punt p3;
    private Punt p4;
    
    // CONSTRUCTORES
    public Rectangle(Punt pa, Punt pb){
        p1 = pa;
        p3 = pb;
        p2 = new Punt(p3.getX(), p1.getY());
        p4 = new Punt(p1.getX(), p3.getY());
    }
    
    public Rectangle(int base, int altura){        
        p4 = new Punt(0,0);
        p1 = new Punt(p4.getX(), p4.getY() - altura);
        p2 = new Punt(p4.getX() + base, p4.getY() - altura);
        p3 = new Punt(p4.getX() + base, p4.getY());
        
    }
    
    // GETTERS AND SETTERS
    public Punt getP1() {
        return p1;
    }

    public void setP1(Punt p1) {
        this.p1 = p1;
    }

    public Punt getP2() {
        return p2;
    }

    public void setP2(Punt p2) {
        this.p2 = p2;
    }

    public Punt getP3() {
        return p3;
    }

    public void setP3(Punt p3) {
        this.p3 = p3;
    }

    public Punt getP4() {
        return p4;
    }

    public void setP4(Punt p4) {
        this.p4 = p4;
    }

    // MÉTODOS
    public int calcularSuperficie(){
        // base * altura
        return (p2.getX() - p1.getX()) * (p4.getY() - p1.getY());
    }
    
    // MÉTODOS
    public void desplacar(int dx, int dy){
        //p1.x += dx;
        p1.setX( p1.getX() + dx );
        p2.setX( p2.getX() + dx );
        p3.setX( p3.getX() + dx );
        p4.setX( p4.getX() + dx );
        
        //p1.y += dy;
        p1.setY( p1.getY() + dy );
        p2.setY( p2.getY() + dy );
        p3.setY( p3.getY() + dy );
        p4.setY( p4.getY() + dy );
        
    }
    
    // TO_STRING
    @Override
    public String toString() {
        return "[" + p1 + ", " + p2 + ", " + p3 + ", " + p4 + "]";
    }
    
    
    
}
