package pkg51_a03_cuentasbanclogs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class TransaccionesBancarias {

    private final Logger LOGGER;
    private final Scanner sc;
    private CuentaBancaria cuenta1;
    private CuentaBancaria cuenta2;
    private int opcion;

    public TransaccionesBancarias() {
        this.LOGGER = Logger.getLogger(TransaccionesBancarias.class.getName());
        this.sc = new Scanner(System.in);
        this.opcion = -1;
        this.configLogManager();
        this.crearCuentas();
        this.menu();
    }

    private void crearCuentas() {
        cuenta1 = new CuentaBancaria("Pepe", 1000);
        cuenta2 = new CuentaBancaria("Maria", 500);
    }

    private void menu() {
        
        do {
            LOGGER.info(
                    "===== MENÚ =====\n"
                    + "1. Depositar\n"
                    + "2. Retirar\n"
                    + "3. Transferir\n"
                    + "4. Ver saldo\n"
                    + "5. Salir\n"
                    + "> "
            );
            if (sc.hasNextInt()) {
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        hacerDeposito();
                        break;
                    case 2:
                        hacerRetiro();
                        break;
                    case 3:
                        hacerTransferencia();
                        break;
                    case 4:
                        verSaldo();
                        break;
                    case 5:
                        LOGGER.info("Saliendo del programa...");
                        break;
                    default:
                        LOGGER.warning("Opción inválida");
                        break;
                }
            } else {
                LOGGER.warning("Entrada inválida. Debes introducir un número.");
                sc.nextLine(); // limpia el buffer
            }

        } while (opcion != 5);
    }

    private void hacerDeposito() {
        try {
            LOGGER.info("Cantidad a depositar:");
            double cantidad = sc.nextDouble();
            cuenta1.depositar(cantidad);

        } catch (QuantitatNegativaException e) {
            LOGGER.warning(e.getMessage());
        }
    }

    private void hacerRetiro() {
        try {
            LOGGER.info("Cantidad a retirar:");
            double cantidad = sc.nextDouble();
            cuenta1.retirar(cantidad);

        } catch (QuantitatNegativaException e) {
            LOGGER.warning(e.getMessage());

        } catch (EresPobreException e) {
            LOGGER.severe(e.getMessage());
        }
    }

    private void hacerTransferencia() {
        try {
            LOGGER.info("Cantidad a transferir:");
            double cantidad = sc.nextDouble();
            cuenta1.transferir(cuenta2, cantidad);

        } catch (EresPobreException | QuantitatNegativaException e) {
            LOGGER.log(Level.SEVERE, "Error en transferencia: " + e.getMessage());
        }
    }

    private void verSaldo() {
        LOGGER.log(Level.INFO, "Saldo cuenta1: " + cuenta1.getSaldo());
        LOGGER.log(Level.INFO, "Saldo cuenta2: " + cuenta2.getSaldo());
    }

    private void configLogManager() {
        LogManager logManager = LogManager.getLogManager();
        // configurem el registre de logs amb un fitxer de properties
        try {
            logManager.readConfiguration(new FileInputStream("./filesIni/loggin.properties"));
        } catch (FileNotFoundException ex) {
            LOGGER.log(Level.SEVERE, ex.getMessage(), ex);
        } catch (IOException | SecurityException ex) {
            LOGGER.log(Level.SEVERE, ex.getMessage(), ex);
        }
    }
}
