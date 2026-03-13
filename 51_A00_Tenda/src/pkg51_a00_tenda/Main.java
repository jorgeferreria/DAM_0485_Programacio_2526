package pkg51_a00_tenda;

public class Main {

    public static void main(String[] args) {

        // Creamos productos
        Producte producto1 = new Producte("Camiseta", 10);
        Producte producto2 = new Producte("Bamba", 5);

        // Mostramos el stock inicial
        producto1.mostrarStock();
        producto2.mostrarStock();

        try {
            // Intentamos comprar 12 camisetas, lo cual debería lanzar una excepción
            producto1.comprar(12);
        } catch (StockInsuficienteException e) {
            // Capturamos y mostramos el mensaje de la excepción
            System.err.println("Error: " + e.getMessage());
        }

        // Intentamos comprar 3 pares de zapatos, lo cual debería ser exitoso
        try {
            producto2.comprar(3);
        } catch (StockInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Mostramos el stock después de las compras
        producto1.mostrarStock();
        producto2.mostrarStock();
    }

}
