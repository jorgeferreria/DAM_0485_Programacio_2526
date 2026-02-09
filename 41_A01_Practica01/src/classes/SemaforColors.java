package classes;

import java.util.ArrayList;

public class SemaforColors {

    private int colorActual;
    private ArrayList<String> colors;

    public SemaforColors() {
        colors = new ArrayList();
        colors.add("VERMELL");
        colors.add("VERD");
        colors.add("GROC");

        colorActual = 0;
    }

    public int getColorActual() {
        return colorActual;
    }

    public void canviar() {        
        colorActual++;
//        if(colorActual < colors.size() - 1){
//            colorActual++;
//        } else {
//            colorActual = 0;
//        }
    }

    public void afegirColor(String color) {
        if( !colors.contains(color) ){
            colors.add(color);
        }
    }

    @Override
    public String toString() {
        return "El semafor està en: " + colors.get(colorActual % colors.size());
//        return "El semafor està en: " + colors.get(colorActual);
    }

}
