package pkg51_a05_botiga;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Botiga {
    
    private Set<Joc> jocs;
    private Set<String> categories; 

    public Botiga() {
        jocs = new HashSet();
        categories = new HashSet();
        carregarCategories();
    }

    public void afegir(Joc joc) {
        if (joc != null) {
            jocs.add(joc);
        }
    }

    public boolean conte(Joc joc) {
        boolean trobat = false;

        if (joc != null) {
            trobat = jocs.contains(joc);
        }

        return trobat;
    }

    public boolean eliminar(Joc joc) {
        boolean eliminat = false;

        if (joc != null) {
            eliminat = jocs.remove(joc);
        }

        return eliminat;
    }

    public List<Joc> filtrar(String categoria) {
        List<Joc> jocsPerCategoria = new ArrayList();

        if (categoria != null && !categoria.isEmpty()) {
            for (Joc joc : jocs) {
                if (joc.getCategoria().equalsIgnoreCase(categoria)) {
                    jocsPerCategoria.add(joc);
                }
            }
        }

        return jocsPerCategoria;
    }

    public void mostrarJocs() {
        mostrarJocs(new ArrayList(jocs));
    }

    public void mostrarJocs(List<Joc> jocs) {
        int cont = 1;

        if (jocs.isEmpty()) {
            System.out.println("No hi ha cap Joc a la botiga");
        } else {
            System.out.println("Llitat de jocs de la botiga");
            for (Joc joc : jocs) {
                System.out.println("\t" + cont + ". " + joc);
                cont++;
            }
            System.out.println("---------------------------------------------------------------\n");
        }

    }

    private void carregarCategories() {
        categories.add("cat1");
        categories.add("cat2");
        categories.add("cat3");
        categories.add("cat4");
        categories.add("SenseCategoria");

    }

    public boolean afegirCategoria(String categoria) { // CUTRE
        return categories.add(categoria);
    }

    public boolean eliminarCategoria(String categoria) { // SEMI CUTRE
        boolean eliminat = false;
        if (categoria != null && !categoria.isEmpty()
                && categories.remove(categoria)){
            for (Joc joc : jocs) {
                if (joc.getCategoria().equalsIgnoreCase(categoria)){
                    joc.setCategoria("SenseCategoria");
                }
            }
            eliminat = true;
        }
        
        return eliminat;
        
    }

    public boolean cercarCategoria(String categoria) {
        boolean trobat = false;

        if (categoria != null && !categoria.isEmpty()
                && categories.contains(categoria)) {
            trobat = true;
        }

        return trobat;
    }

    public boolean modificarCategoria(String categoriaVella, String categoriaNova) {
        boolean modificat = false;
        if (categories.remove(categoriaVella)) {
            categories.add(categoriaNova);
            for (Joc joc : jocs) {
                if (joc.getCategoria().equalsIgnoreCase(categoriaVella)) {
                    joc.setCategoria(categoriaNova);
                }
            }
            modificat = true;
        }

        return modificat;
    }

    public void imprimirCategories() {
        System.out.println("Llista de categories");
        for (String categoria : categories) {
            System.out.println("\t" + categoria);
        }

        System.out.println("------------------------------------------------------------");
    }
    
}
