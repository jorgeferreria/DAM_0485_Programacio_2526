package pkg61_a04_gestiobibliotecamvc_1n.model.dao;

import pkg61_a04_gestiobibliotecamvc_1n.model.entity.Llibre;
import java.util.List;

public interface LlibreDAO {

    boolean registrar(Llibre llibre);

    List<Llibre> obtenirTots();

    List<Llibre> obtenirLlibresEditorial(int idEditorial);

    boolean actualitzarPagines(int id, int novesPagines);

    Llibre obtenirMesLlarg();

}
