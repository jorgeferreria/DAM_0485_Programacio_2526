package pkg12_a03_seleccio2;

import java.util.Calendar;

public class Ex5 {

    public static void main(String[] args) {
        final int MES28 = 28, MES29 = 29, MES30 = 30, MES31 = 31;
        int dia, mes, any, diaMax = 0;

        Calendar dataActual = Calendar.getInstance();

        dia = dataActual.get(Calendar.DAY_OF_MONTH);
        mes = dataActual.get(Calendar.MONTH) + 1;
        any = dataActual.get(Calendar.YEAR);

        System.out.printf("%d %d %d\n", dia, mes, any);
        // 30/12/2025 HUI
        //            DEMA
        dia = 31;
        mes = 12;
        any = 2025;

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

        dia++;
        if (dia > diaMax) {
            dia = 1;
            mes++;
            if (mes > 12) {
                mes = 1;
                any++;
            }

        }
        System.out.printf("%d %d %d\n", dia, mes, any);
    }

}
