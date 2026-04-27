package pkg51_a07_gestiocomptes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class GestioComptes {

    private Map<String, Compte> comptes;

    public GestioComptes() {
        comptes = new HashMap();
    }

    public boolean afegir(Compte compte) {
        boolean afegit = false;

        if (compte != null && !comprovar(compte.getNumCompte())) {
            comptes.put(compte.getNumCompte(), compte);
            afegit = true;
        }

        return afegit;
    }

    public void modificar(String numCompte) {
        Scanner sc = new Scanner(System.in);

        if (comprovar(numCompte)) {

            System.out.print("Indica en nou saldo: ");

            comptes.get(numCompte).setSaldo(sc.nextDouble());

        } else {
            System.out.println("Compte NO vàlid");
        }

    }

    public Compte obtenir(String numCompte) {
        return comptes.get(numCompte);
    }

    public boolean comprovar(String numCompte) {
        return comptes.containsKey(numCompte);
    }

    public boolean esborrar(String numCompte) {
        return comptes.remove(numCompte, comptes.get(numCompte));
    }

    public List<Compte> esborrarPerSaldo(double saldo) {
        List<Compte> esborrats = new ArrayList();

        Iterator<Compte> it = comptes.values().iterator();

        while (it.hasNext()) {

            Compte compte = it.next();

            if (compte.getSaldo() == saldo) {

                it.remove();
                //comptes.remove(compte.getNumCompte());

            }

        }

        return esborrats;
    }

    public Set<Compte> obtenirComptes() {

        return new HashSet<Compte>();
    }

    public void imprimirComptes() {
        if (comptes.isEmpty()) {
            System.out.println("No hi ha comptes");
        } else {
            System.out.println("COMPTES:");
            for (Map.Entry<String, Compte> entry : comptes.entrySet()) {
                String key = entry.getKey();
                Compte value = entry.getValue();
                System.out.println(key + " - " + value);
            }
            System.out.println("------------------------------------------");
        }

    }

    public void saldoComptes() {

    }

    public void saldoMitja() {

    }

    public void saldoMajorMenor() {

    }

}
