import java.util.Objects;

public class Disciplina {
    /******************** attibuti ********************/
    private double valutazione;
    private String materia;

    public Disciplina() {
    }

    public Disciplina(double valutazione, String materia) {
        this.valutazione = valutazione;
        this.materia = materia;
    }

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
        return "\n\n|--------------------| valutazioni |--------------------|" + "\nMateria = " + getMateria() + "\tVoto = " + getValutazione();
    }

}
