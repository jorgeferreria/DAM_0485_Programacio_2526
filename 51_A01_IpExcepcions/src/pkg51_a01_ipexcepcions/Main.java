package pkg51_a01_ipexcepcions;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        VerificadorIp vi = new VerificadorIp();
        
        String[] ips = {
            "192.168.1.1",
            "255.255.255.255",
            "256.10.20.30",
            "192.168.1",
            "192.abc.1.1",
            "10.0.0.300"
        };

        for (String ip : ips) {
            System.out.println("Comprovant IP: " + ip);
            if (vi.isIP(ip)) {
                System.out.println("IP correcta\n");
            } else {
                System.out.println("IP incorrecta\n");
            }
        }
        
        System.out.println(vi);
        
    }

}
