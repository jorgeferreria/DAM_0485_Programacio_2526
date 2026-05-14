package pkg61_a03_gestiobibliotecadaomvc.controller;

import pkg61_a03_gestiobibliotecadaomvc.model.dao.LlibreDAO;
import pkg61_a03_gestiobibliotecadaomvc.model.entity.Llibre;
import pkg61_a03_gestiobibliotecadaomvc.view.LlibreView;

public class LlibreController {

    private LlibreView vista;
    private LlibreDAO model;

    public LlibreController(LlibreView vista, LlibreDAO model) {
        this.vista = vista;
        this.model = model;
    }

    public void registrarLlibre() {
        model.registrar(vista.demanarDadesLlibre());
        vista.mostrarMissatge("Llibre registrat correctament.");
    }

    public void mostrarLlibres() {
        vista.mostrarLlibres(model.obtenirTots());
    }

    public void modificarLlibre() {
        model.actualitzarPagines(vista.demanarId(), vista.demanarNovesPagines());
        vista.mostrarMissatge("Pàgines actualitzades.");
    }

    public void obtenirMesLlarg() {
        Llibre mesLlarg = model.obtenirMesLlarg();
        if (mesLlarg != null) {
            vista.mostrarMissatge("El llibre més llarg és: " + mesLlarg.toString());
        } else {
            vista.mostrarMissatge("La biblioteca està buida.");
        }
    }

    public void iniciar() {
        int opcio;
        do {
            opcio = vista.mostrarMenu();
            switch (opcio) {
                case 1:
                    registrarLlibre();
                    break;
                case 2:
                    mostrarLlibres();
                    break;
                case 3:
                    modificarLlibre();
                    break;
                case 4:
                    obtenirMesLlarg();
                    break;
                case 5:
                    vista.mostrarMissatge("Sortint de l'aplicació...");
                    break;
                default:
                    vista.mostrarMissatge("Opció no vàlida.");
            }
        } while (opcio != 5);
    }
}
