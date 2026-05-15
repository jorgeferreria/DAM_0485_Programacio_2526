package pkg61_a04_gestiobibliotecamvc_1n.controller;

import pkg61_a04_gestiobibliotecamvc_1n.model.dao.LlibreDAO;
import pkg61_a04_gestiobibliotecamvc_1n.model.entity.Llibre;
import pkg61_a04_gestiobibliotecamvc_1n.view.LlibreView;

public class LlibreController {

    private LlibreView vista;
    private LlibreDAO model;

    public LlibreController(LlibreView vista, LlibreDAO model) {
        this.vista = vista;
        this.model = model;
    }

    public void registrarLlibre() {
        boolean registrar = false;

        try {
            registrar = model.registrar(vista.demanarDadesLlibre());
        } catch (Exception e) {
            vista.mostrarMissatge("Llibre NO registrat.");
        }

        if (registrar) {
            vista.mostrarMissatge("Llibre registrat correctament.");
        }
    }

    public void mostrarLlibres() {
        vista.mostrarLlibres(model.obtenirTots());
    }

    public void llistarLlibresPerEditorial() {
        int idEditorial = vista.demanarIdEditorial();
        vista.mostrarLlibres(model.obtenirLlibresEditorial(idEditorial));
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

}
