package pkg51_a01_ipexcepcions;

import java.util.ArrayList;
import java.util.List;

class VerificadorIp {
    
    private List<String> ipNoValides;
    private List<String> ipValides;

    public VerificadorIp() {
        this.ipNoValides = new ArrayList();
        this.ipValides = new ArrayList();
    }

    public List<String> getIpNoValides() {
        return ipNoValides;
    }

    public List<String> getIpValides() {
        return ipValides;
    }
    
    private boolean stringToInt(String text) {
        int valor;
        boolean isNumero = false;
        
        try {
            valor = Integer.parseInt(text);
            isNumero = true;
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        
        return isNumero;
    }

    private boolean inRangIp(int num) {
        boolean isValorValid = false;
        
        if (num >= 0 && num <= 255){
            isValorValid = true;
        }

        return isValorValid;
    }

    private String[] dividirIpEn4(String ip) throws IpErroniaException{
        String[] valors;
        
        valors = ip.split("\\.");
        
        if (valors.length != 4){
            throw new IpErroniaException("IP no vàlida");
        }
        
        return valors;
    }

    public boolean isIP(String ip) {
        String[] valors;
        int valorInt;
        try {
            valors = dividirIpEn4(ip);
            
            for (String valor : valors) {                
                if (!stringToInt(valor)){
                    ipNoValides.add(ip);
                    return false;
                }                
                valorInt = Integer.parseInt(valor);                
                if(!inRangIp(valorInt)){
                    ipNoValides.add(ip);
                    return false;
                }
            }            
        } catch (IpErroniaException ex) {
            System.out.println(ex.getMessage());
            ipNoValides.add(ip);
            return false;
        }        
        
        ipValides.add(ip);
        return true;
    }

    @Override
    public String toString() {
        return "VerificadorIp{" + "ipNoValides=" + ipNoValides + "\nipValides=" + ipValides + '}';
    }
    
    
}
