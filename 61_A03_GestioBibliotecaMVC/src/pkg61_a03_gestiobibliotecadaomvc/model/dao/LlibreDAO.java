package pkg61_a03_gestiobibliotecadaomvc.model.dao;

import pkg61_a03_gestiobibliotecadaomvc.model.entity.Llibre;
import java.util.List;

public interface LlibreDAO {

    boolean registrar(Llibre llibre);

    List<Llibre> obtenirTots();

    boolean actualitzarPagines(int id, int novesPagines);

    Llibre obtenirMesLlarg();

}
