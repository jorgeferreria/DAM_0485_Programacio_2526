package pkg61_a03_gestiobibliotecadaomvc;

import pkg61_a03_gestiobibliotecadaomvc.controller.LlibreController;
import pkg61_a03_gestiobibliotecadaomvc.model.dao.LlibreDAO;
import pkg61_a03_gestiobibliotecadaomvc.model.dao.LlibreDAOImpl;
import pkg61_a03_gestiobibliotecadaomvc.view.LlibreView;

public class Main {

    public static void main(String[] args) {
        
        LlibreView vista = new LlibreView();
        LlibreDAO dao = new LlibreDAOImpl();

        LlibreController controlador = new LlibreController(vista, dao);

        controlador.iniciar();
        
    }

}
