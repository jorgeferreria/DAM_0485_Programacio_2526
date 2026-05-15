package pkg61_a04_gestiobibliotecamvc_1n.controller;

import pkg61_a04_gestiobibliotecamvc_1n.view.AppView;

public class AppController {

    private AppView view;
    private LlibreController llibreCtrl;
    private EditorialController edCtrl;

    public AppController(AppView view, LlibreController llibreCtrl, EditorialController edCtrl) {
        this.view = view;
        this.llibreCtrl = llibreCtrl;
        this.edCtrl = edCtrl;
    }

    public void iniciar() {
        int opcio;
        do {
            opcio = view.mostrarMenuPrincipal();
            switch (opcio) {
                case 1 ->
                    llibreCtrl.registrarLlibre();
                case 2 ->
                    llibreCtrl.mostrarLlibres();
                case 3 ->
                    llibreCtrl.llistarLlibresPerEditorial();
                case 4 ->
                    llibreCtrl.modificarLlibre();
                case 5 ->
                    llibreCtrl.obtenirMesLlarg();
                case 6 ->
                    edCtrl.afegirEditorial();
                case 7 ->
                    edCtrl.llistarEditorials();
                case 0 ->
                    view.mostrarMissatge("Fins aviat!");
                default ->
                    view.mostrarMissatge("Opció no vàlida.");
            }
        } while (opcio != 0);
    }
}
