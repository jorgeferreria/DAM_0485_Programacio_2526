package pkg51_a03_cuentasbanclogs;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CuentaBancaria {

    private final Logger LOGGER;
    private double saldo;
    private String titular;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.LOGGER = Logger.getLogger(CuentaBancaria.class.getName());
        this.LOGGER.log(Level.INFO, "Cuenta creada para "+ titular +" con saldo inicial: " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void depositar(double cantidad) throws QuantitatNegativaException {
        if (cantidad < 0) {
            LOGGER.warning("Intento de depósito con cantidad negativa");
            throw new QuantitatNegativaException("No puedes ingresar cantidades negativas");
        }

        saldo += cantidad;
        this.LOGGER.log(Level.INFO, "Depósito de " + cantidad + ". Saldo actual: " + saldo);
    }

    public void retirar(double cantidad) throws QuantitatNegativaException, EresPobreException {
        if (cantidad < 0) {
            LOGGER.warning("Intento de retiro con cantidad negativa");
            throw new QuantitatNegativaException("No puedes retirar cantidades negativas");
        }

        if (cantidad > saldo) {
            LOGGER.log(Level.SEVERE, "Saldo insuficiente para retirar " + cantidad);
            throw new EresPobreException("No tienes saldo suficiente");
        }

        saldo -= cantidad;
        LOGGER.log(Level.INFO, "Retiro de " + cantidad + ". Saldo restante: " + saldo);
    }

    public void transferir(CuentaBancaria destino, double cantidad)
            throws QuantitatNegativaException, EresPobreException {

        this.retirar(cantidad);
        destino.depositar(cantidad);

        LOGGER.log(Level.INFO, "Transferencia de " + cantidad + " a " + destino.getTitular());
    }
}
