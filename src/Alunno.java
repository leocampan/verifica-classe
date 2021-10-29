import java.util.ArrayList;
import java.util.Objects;

public class Alunno {
    /******************** attributi ********************/
    private String nominativo;
    private String dataDiNascita;
    private String indirizzoDiResidenza;
    ArrayList<Disciplina> materie = new ArrayList<>();

    /******************** costruttori ********************/
    public Alunno() {
    }

    public Alunno(String nominativo, String dataDiNascita, String indirizzoDiResidenza) {
        this.nominativo = nominativo;
        this.dataDiNascita = dataDiNascita;
        this.indirizzoDiResidenza = indirizzoDiResidenza;
    }

    /******************** getter & setter ********************/
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

    /********************** metodi **********************/
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

    public void addValutazione(String materia, double voto) {
        materie.add(new Disciplina(voto, materia));
    }

    public void removeValutazione(String materia) {
        for (int i = 0; i < materie.size(); i++) {
            if (materie.get(i).getMateria().equalsIgnoreCase(materia)) {
                materie.remove(i);
            }
        }
    }

    public void modificaVoto(String materia, int votomodificato) {
        for (int index = 0; index < materie.size(); index++) {
            if (materie.get(index).getMateria().equalsIgnoreCase(materia)) {
                materie.get(index).setValutazione(votomodificato);
            }
        }
    }

    public void modificaMateria(String materia, String materiaModificata) {
        for (int index = 0; index < materie.size(); index++) {
            if (materie.get(index).getMateria().equalsIgnoreCase(materia)) {
                materie.get(index).setMateria(materiaModificata);
            }
        }
    }

    public double mediaMateria(String materia) {
        double media = 0;

        for (int i = 0; i < materie.size(); i++) {
            if (materie.get(i).)
        }
        
        return media;
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
        String s = "";
        
        for (int i = 0; i < materie.size(); i++) {
            s += materie.get(i);
        }
    
        return "\n\nNominativo = " + getNominativo() + "\tData di nascita = " + getDataDiNascita() + "\tResidenza = " + getIndirizzoDiResidenza() + s; 
    }
}
