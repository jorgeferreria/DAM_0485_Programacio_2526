package pkg61_a04_gestiobibliotecamvc_1n.model.dao;

import pkg61_a04_gestiobibliotecamvc_1n.model.entity.Editorial;
import java.util.List;

public interface EditorialDAO {

    boolean registrar(Editorial e);

    List<Editorial> obtenirTotes();
}
