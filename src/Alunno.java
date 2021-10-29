import java.util.Objects;

public class Alunno {
    /******************** attributi ********************/
    private String nominativo;
    private String dataDiNascita;
    private String indirizzoDiResidenza;

    /******************** metodi ********************/
    public Alunno() {
    }

    public Alunno(String nominativo, String dataDiNascita, String indirizzoDiResidenza) {
        this.nominativo = nominativo;
        this.dataDiNascita = dataDiNascita;
        this.indirizzoDiResidenza = indirizzoDiResidenza;
    }

    public String getNominativo() {
        return this.nominativo;
    }

    public void setNominativo(String nominativo) {
        this.nominativo = nominativo;
    }

    public String getDataDiNascita() {
        return this.dataDiNascita;
    }

    public void setDataDiNascita(String dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public String getIndirizzoDiResidenza() {
        return this.indirizzoDiResidenza;
    }

    public void setIndirizzoDiResidenza(String indirizzoDiResidenza) {
        this.indirizzoDiResidenza = indirizzoDiResidenza;
    }

    public Alunno nominativo(String nominativo) {
        setNominativo(nominativo);
        return this;
    }

    public Alunno dataDiNascita(String dataDiNascita) {
        setDataDiNascita(dataDiNascita);
        return this;
    }

    public Alunno indirizzoDiResidenza(String indirizzoDiResidenza) {
        setIndirizzoDiResidenza(indirizzoDiResidenza);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Alunno)) {
            return false;
        }
        Alunno alunno = (Alunno) o;
        return Objects.equals(nominativo, alunno.nominativo) && Objects.equals(dataDiNascita, alunno.dataDiNascita) && Objects.equals(indirizzoDiResidenza, alunno.indirizzoDiResidenza);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nominativo, dataDiNascita, indirizzoDiResidenza);
    }

    @Override
    public String toString() {
        return 
            "\n\nNominativo = " + getNominativo() + 
            "\tData di nascita = " + getDataDiNascita() + 
            "\tResidenza = " + getIndirizzoDiResidenza();
    }
}
