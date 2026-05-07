package pkg61_a02_gestiobibliotecadao;

import java.util.List;

public interface LlibreDAO {

    boolean registrar(Llibre llibre);

    List<Llibre> obtenirTots();

    boolean actualitzarPagines(int id, int novesPagines);

    Llibre obtenirMesLlarg();

}
