package pkg61_a04_gestiobibliotecamvc_1n.controller;

import pkg61_a04_gestiobibliotecamvc_1n.model.dao.EditorialDAO;
import pkg61_a04_gestiobibliotecamvc_1n.model.entity.Editorial;
import pkg61_a04_gestiobibliotecamvc_1n.view.EditorialView;

public class EditorialController {

    private EditorialView view;
    private EditorialDAO dao;

    public EditorialController(EditorialView view, EditorialDAO dao) {
        this.view = view;
        this.dao = dao;
    }

    public void afegirEditorial() {
        Editorial e = view.demanarDadesEditorial();
        if (dao.registrar(e)) {
            view.mostrarMissatge("Editorial guardada correctament.");
        } else {
            view.mostrarMissatge("Error en guardar l'editorial.");
        }
    }

    public void llistarEditorials() {
        view.mostrarEditorials(dao.obtenirTotes());
    }

}
