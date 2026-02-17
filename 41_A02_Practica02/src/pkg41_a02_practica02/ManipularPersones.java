package pkg41_a02_practica02;

import java.util.ArrayList;
import java.util.List;

public class ManipularPersones {

    private List<Persona> persones;

    public ManipularPersones() {
        persones = new ArrayList();
    }

    public boolean afegir(Persona p) {
        boolean afegit = false;

        if (p != null && p.getNif() != null && !existeix(p)) {
            persones.add(p);
            afegit = true;
        }

        return afegit;
    }

    public Persona cercaPerNif(String nif) {
        boolean trobat = false;
        int index = 0;
        Persona p = null;

        if (nif != null) {
            while (!trobat && index < persones.size()) {
                if (persones.get(index).getNif().equals(nif)) {
                    p = persones.get(index);
                    trobat = true;
                }
                index++;
            }
        }
        return p;
    }

    public List<Persona> cercaPerEdat(int edat) {
        List<Persona> personesEdat = new ArrayList();

        if (edat >= 0 && edat <= 150) {
            for (Persona persona : persones) {
                if (persona.getEdat() == edat) {
                    personesEdat.add(persona);
                }
            }
        }

        return personesEdat;
    }

    public boolean modificar(String nif, String nom) {
        Persona p = null;
        boolean modificat = false;

        if (nom != null) {
            p = cercaPerNif(nif);

            if (p != null) {
                p.setNom(nom);
                modificat = true;
            }
        }

        return modificat;
    }

    public boolean modificar(Persona p) {
        Persona pBuscada;
        int index = 0;
        boolean continuar = true;

        if (p != null && p.getNif() != null) {
//            pBuscada = cercaPerNif(p.getNif());
//            if(pBuscada != null){
//                index = persones.indexOf(pBuscada);
//                persones.set(index, p);
//            }

            while (continuar && index < persones.size()) {
//                if (persones.get(index).equals(p)) {
                if (persones.get(index).getNif().equals(p.getNif())) {
                    persones.set(index, p);
                    continuar = false;
                }
                index++;
            }

//            for (int i = 0; i < persones.size(); i++) {
//                if (persones.get(i).equals(p.getNif())) {
//                    persones.set(i, p);
//                    break;
//                }
//            }
        }

        return true;
    }

    public boolean esborrar(String nif) {
        return persones.remove(cercaPerNif(nif));
    }

    public boolean existeix(Persona p) {
        boolean trobat = false;
        int index = 0;

        if (p != null && p.getNif() != null) {
            while (!trobat && index < persones.size()) {
//                if (persones.get(index).equals(p)) {
                if (persones.get(index).getNif().equals(p.getNif())) {
                    trobat = true;
                }
                index++;
            }
        }
        return trobat;

        // persones.contains(p);
    }

    public List<Persona> personesSobreMitjana() {
        List<Persona> sobreMitjana = new ArrayList();
        double edatMitjana;

        edatMitjana = calcularEdatMitjana();

        for (Persona persone : persones) {
            if (persone.getEdat() > edatMitjana) {
                sobreMitjana.add(persone);
            }
        }

        return sobreMitjana;
    }

    private double calcularEdatMitjana() {
        double edatMitjana = 0;

        for (Persona persone : persones) {
            edatMitjana += persone.getEdat();
        }

        edatMitjana /= persones.size();

        return edatMitjana;
    }

    @Override
    public String toString() {
        return "ManipularPersones{" + "persones=" + persones + '}';
    }

}
