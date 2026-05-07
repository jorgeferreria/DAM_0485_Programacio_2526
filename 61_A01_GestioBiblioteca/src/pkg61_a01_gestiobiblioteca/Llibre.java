
package pkg61_a01_gestiobiblioteca;

import java.util.Objects;

public class Llibre {
    
    private int id;
    private String ISBN;
    private String titol;
    private String autor;
    private int pagines;

    public Llibre(int id, String ISBN, String titol, String autor, int pagines) {
        this.id = id;
        this.ISBN = ISBN;
        this.titol = titol;
        this.autor = autor;
        this.pagines = pagines;
    }

    public Llibre(String ISBN, String titol, String autor, int pagines) {
        this.ISBN = ISBN;
        this.titol = titol;
        this.autor = autor;
        this.pagines = pagines;
    }

    public int getId() {
        return id;
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
        return "id=" + id + "\n\t- ISBN=" + ISBN + "\n\t- titol=" + titol + "\n\t- autor=" + autor + "\n\t- pagines=" + pagines;
    }
    
}
