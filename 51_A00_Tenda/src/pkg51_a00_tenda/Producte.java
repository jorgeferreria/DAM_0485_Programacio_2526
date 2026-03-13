package pkg51_a00_tenda;

public class Producte {

    private String nom;
    private int stock;

    public Producte(String nom, int stock) {
        this.nom = nom;
        this.stock = stock;
    }

    public void comprar(int cantidad) throws StockInsuficienteException {
        if (cantidad <= 0 || cantidad > stock) {
            throw new StockInsuficienteException("Quantitat no vàlida");
        }

        this.stock -= cantidad;
        System.out.println("Compra exitosa de " + cantidad + " " + nom  + "(s).");

    }

    public void mostrarStock() {
        System.out.println("Stock de " + nom + ": " + stock);
    }

    @Override
    public String toString() {
        return "Producte{" + "nom=" + nom + ", stock=" + stock + '}';
    }

}
