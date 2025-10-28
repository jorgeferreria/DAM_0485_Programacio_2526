package pkg12_a03_seleccio2;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        final String LINIA = "________________________________";
        final int MES28 = 28, MES29 = 29, MES30 = 30, MES31 = 31;
        String data, mesText = "";
        int dia, mes, any, diaMax = -1;
        boolean mesValid = true;

        System.out.println(LINIA + "\n");
        System.out.print("Introdueix una data (dd/mm/aaaa): ");
        data = lector.nextLine();
        System.out.println(LINIA);

        if (data.length() == 10 && data.charAt(2) == '/' && data.charAt(5) == '/') {
            dia = Integer.parseInt(data.substring(0, 2)); // DIA 03 -> 3
            mes = Integer.parseInt(data.substring(3, 5)); // MES
            any = Integer.parseInt(data.substring(6, 10)); // ANY

            switch (mes) {
                case 1:
                    mesText = "gener";
                    diaMax = MES31;
                    break;
                case 2:
                    if (any % 4 == 0 && (any % 100 != 0 || any % 400 == 0)) {
                        diaMax = MES29;
                    } else {
                        diaMax = MES28;
                    }
                    mesText = "febrer";
                    break;
                case 3:
                    mesText = "març";
                    diaMax = MES31;
                    break;
                case 4:
                    mesText = "abril";
                    diaMax = MES30;
                    break;
                case 5:
                    mesText = "maig";
                    diaMax = MES31;
                    break;
                case 6:
                    mesText = "juny";
                    diaMax = MES30;
                    break;
                case 7:
                    mesText = "juliol";
                    diaMax = MES31;
                    break;
                case 8:
                    mesText = "agost";
                    diaMax = MES31;
                    break;
                case 9:
                    mesText = "setembre";
                    diaMax = MES30;
                    break;
                case 10:
                    mesText = "octubre";
                    diaMax = MES31;
                    break;
                case 11:
                    mesText = "novembre";
                    diaMax = MES30;
                    break;
                case 12:
                    mesText = "desembre";
                    diaMax = MES31;
                    break;
                default:
                    mesValid = false;
                    System.out.println("Error a la data introduïda:\n"
                            + "El mes ha de ser entre 1 i 12");
                    break;
            }

            if (mesValid) { // mesValid == true
                if (dia > 0 && dia <= diaMax) { // Si el més és vàlid i el dia SI està dintre del rang vàlid
                    //System.out.println("Data verificada: " + dia + " de " + mesText + " de " + any);
                    System.out.printf("Data verificada: %d de %s de %d\n", dia, mesText, any);
                } else { // Si el més és vàlid però el dia NO està dintre del rang vàlid
                    System.out.println("Error a la data introduïda:\n"
                            + "El dia ha de ser entre 1 i " + diaMax);
                }
            }
        } else {
            System.out.println("Format incorrecte. Cal seguir el format dd/mm/aaaa");
        }

    }

}
