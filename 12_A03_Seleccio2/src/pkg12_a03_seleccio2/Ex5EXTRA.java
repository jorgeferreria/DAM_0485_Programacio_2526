package pkg12_a03_seleccio2;

import java.util.Calendar;
import java.util.Scanner;

public class Ex5EXTRA {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        final int MES28 = 28, MES29 = 29, MES30 = 30, MES31 = 31;
        int minutsIncrement, minut, hora, dia, mes, any, diaMax = 0;

        Calendar dataActual = Calendar.getInstance();
        minut = dataActual.get(Calendar.MINUTE);
        hora = dataActual.get(Calendar.HOUR_OF_DAY); // 24H
        dia = dataActual.get(Calendar.DAY_OF_MONTH);
        mes = dataActual.get(Calendar.MONTH) + 1;
        any = dataActual.get(Calendar.YEAR);

        System.out.printf("%d:%d-%d/%d/%d\n", hora, minut, dia, mes, any);

        System.out.println("Dis-me els minuts a incrementar: (1 - 30.000)");
        minutsIncrement = lector.nextInt();

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                diaMax = MES31;
                break;
            case 2:
                if (any % 4 == 0 && (any % 100 != 0 || any % 400 == 0)) {
                    diaMax = MES29;
                } else {
                    diaMax = MES28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diaMax = MES30;
                break;
        }

        if (minutsIncrement >= 1 && minutsIncrement <= 30000) {
            
            minut += minutsIncrement; // 1 -> 30.000 

            if (minut >= 60) {
                hora += minut / 60;
                minut %= 60;
                if (hora >= 24) {
                    dia += hora / 24;
                    hora %= 24;
                    if (dia > diaMax) {
                        dia -= diaMax;
                        mes++;
                        if (mes > 12) {
                            mes = 1;
                            any++;
                        }
                    }
                }
            }
            System.out.printf("%d:%d-%d/%d/%d\n", hora, minut, dia, mes, any);
        } else {
            System.out.println("Valor no vàlid!");
        }
    }

}
