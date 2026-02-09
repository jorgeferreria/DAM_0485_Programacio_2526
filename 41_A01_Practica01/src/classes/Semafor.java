package classes;

public class Semafor {

//    final private String VERMELL = "VERMELL";
//    final private String VERD = "VERD";
//    final private String GROC = "GROC";
//    private String color;
    private ColorsValids color;

    public Semafor() {
        color = ColorsValids.VERMELL;
    }

    // public String getColor() {
    public ColorsValids getColor() {
        return color;
    }

    public void canviar() {
        switch (color) {
            case VERMELL:
                // color = "VERD";
                color = ColorsValids.VERD;
                break;
            case VERD:
                //color = "GROC";
                color = ColorsValids.GROC;
                break;
            case GROC:
                //color = "VERMELL";
                color = ColorsValids.VERMELL;
                break;
        }
    }

    @Override
    public String toString() {
        return "El semafor està en: " + color;
    }

}
