package pkg61_a04_gestiobibliotecamvc_1n;

import pkg61_a04_gestiobibliotecamvc_1n.controller.AppController;
import pkg61_a04_gestiobibliotecamvc_1n.controller.EditorialController;
import pkg61_a04_gestiobibliotecamvc_1n.view.EditorialView;
import pkg61_a04_gestiobibliotecamvc_1n.view.AppView;
import pkg61_a04_gestiobibliotecamvc_1n.controller.LlibreController;
import pkg61_a04_gestiobibliotecamvc_1n.model.dao.EditorialDAO;
import pkg61_a04_gestiobibliotecamvc_1n.model.dao.EditorialDAOImpl;
import pkg61_a04_gestiobibliotecamvc_1n.model.dao.LlibreDAO;
import pkg61_a04_gestiobibliotecamvc_1n.model.dao.LlibreDAOImpl;
import pkg61_a04_gestiobibliotecamvc_1n.view.LlibreView;

public class Main {

    public static void main(String[] args) {

        // Models
        EditorialDAO edDao = new EditorialDAOImpl();
        LlibreDAO llibreDao = new LlibreDAOImpl();

        // Vistes
        AppView appV = new AppView();
        EditorialView edV = new EditorialView();
        LlibreView llibreV = new LlibreView();

        // Controladors
        EditorialController edCtrl = new EditorialController(edV, edDao);
        LlibreController llibreCtrl = new LlibreController(llibreV, llibreDao);

        AppController app = new AppController(appV, llibreCtrl, edCtrl);
        app.iniciar();

    }

}
