import java.util.*;
import java.time.*;
import java.io.*;

public class Disciplina  implements Comparable, Serializable {
    /******************** attibuti ********************/
    private double valutazione;
    private String materia;
    private LocalDate dataVoto;

    /******************** costruttori ********************/
    public Disciplina() {
    }

    public Disciplina(double valutazione, String materia, LocalDate dataVoto) {
        this.valutazione = valutazione;
        this.materia = materia;
        this.dataVoto = dataVoto;
    }

    /******************** setter & getter ********************/
    public double getValutazione() {
        return this.valutazione;
    }

    public void setValutazione(double valutazione) {
        this.valutazione = valutazione;
    }

    public String getMateria() {
        return this.materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Disciplina valutazione(double valutazione) {
        setValutazione(valutazione);
        return this;
    }

    public Disciplina materia(String materia) {
        setMateria(materia);
        return this;
    }

    public LocalDate getDataVoto() {
        return this.dataVoto;
    }

    public void setDataVoto(LocalDate dataVoto) {
        this.dataVoto = dataVoto;
    }

    @Override
    public int compareTo(Object obj) {
        

        return this.dataVoto.compareTo(((Disciplina) obj).getDataVoto()); 
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Disciplina)) {
            return false;
        }
        Disciplina disciplina = (Disciplina) o;
        return valutazione == disciplina.valutazione && Objects.equals(materia, disciplina.materia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valutazione, materia);
    }

    @Override
    public String toString() {
        return 
                "\nMateria = " + getMateria() + "\tVoto = " + getValutazione() + "\tData = " + getDataVoto();
    }

}
