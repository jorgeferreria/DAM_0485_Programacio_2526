package pkg61_a04_gestiobibliotecamvc_1n.model.entity;

import java.util.Objects;

public class Llibre {

    private int id;
    private String ISBN;
    private String titol;
    private String autor;
    private int pagines;
    private Editorial editorial;

    public Llibre(int id, String ISBN, String titol, String autor, int pagines) {
        this.id = id;
        this.ISBN = ISBN;
        this.titol = titol;
        this.autor = autor;
        this.pagines = pagines;
    }

    public Llibre(String ISBN, String titol, String autor, int pagines, Editorial editorial) {
        this.ISBN = ISBN;
        this.titol = titol;
        this.autor = autor;
        this.pagines = pagines;
        this.editorial = editorial;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPagines() {
        return pagines;
    }

    public void setPagines(int pagines) {
        this.pagines = pagines;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.ISBN);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Llibre other = (Llibre) obj;
        return Objects.equals(this.ISBN, other.ISBN);
    }

    @Override
    public String toString() {
        return "Llibre{" + "id=" + id + ", ISBN=" + ISBN + ", titol=" + titol + ", autor=" + autor + ", pagines=" + pagines + ", editorial=" + editorial + '}';
    }

}
