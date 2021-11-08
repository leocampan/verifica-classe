import java.util.ArrayList;
import java.util.Objects;
import java.time.*;
public class Alunno implements Comparable {
    /******************** [attributi] ********************/
    private String nominativo;
    private LocalDate dataDiNascita;
    private String indirizzoDiResidenza;
    ArrayList<Disciplina> materie = new ArrayList<>();

    /******************** [costruttori] ********************/
    public Alunno() {
    }

    public Alunno(String nominativo, LocalDate dataDiNascita, String indirizzoDiResidenza) {
        this.nominativo = nominativo;
        this.dataDiNascita = dataDiNascita;
        this.indirizzoDiResidenza = indirizzoDiResidenza;
    }

    /******************** [getter & setter] ********************/
    
    public String getNominativo() {
        return this.nominativo;
    }

    public ArrayList<Disciplina> getMaterie() {
        return materie;
    }

    public void setMaterie(ArrayList<Disciplina> materie) {
        this.materie = materie;
    }

    public void setNominativo(String nominativo) {
        this.nominativo = nominativo;
    }

    public LocalDate getDataDiNascita() {
        return this.dataDiNascita;
    }

    public void setDataDiNascita(LocalDate dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public String getIndirizzoDiResidenza() {
        return this.indirizzoDiResidenza;
    }

    public void setIndirizzoDiResidenza(String indirizzoDiResidenza) {
        this.indirizzoDiResidenza = indirizzoDiResidenza;
    }

    /********************** [metodi] **********************/
    public Alunno nominativo(String nominativo) {
        setNominativo(nominativo);
        return this;
    }

    public Alunno dataDiNascita(LocalDate dataDiNascita) {
        setDataDiNascita(dataDiNascita);
        return this;
    }

    public Alunno indirizzoDiResidenza(String indirizzoDiResidenza) {
        setIndirizzoDiResidenza(indirizzoDiResidenza);
        return this;
    }

    public void addValutazione(String materia, double voto, LocalDate data) {
        materie.add(new Disciplina(voto, materia, data));
    }

    public void removeValutazioneByMateria(String materia) {
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

    public void modificaMateria(String materia, String materiaModificata, LocalDate data) {
        for (int index = 0; index < materie.size(); index++) {
            if (materie.get(index).getMateria().equalsIgnoreCase(materia)) {
                materie.get(index).setMateria(materiaModificata);
            }
        }
    }

    public double mediaMateria(String materia) {
        double media = 0;
        double sumVoti = 0;
        double numVoti = 0;

        
        for (int i = 0; i < materie.size(); i++) {
            if (materie.get(i).getMateria().equalsIgnoreCase(materia)) {
                sumVoti += materie.get(i).getValutazione();
                numVoti++;
            }
            else {
                System.out.println("La materia cercata non è presente, inserirne una valida!");
            }
        }

        media = sumVoti / numVoti;
        return media;
    }

    public void changeVotoByMateriaData(String materia, LocalDate data, double voto) {
        for (int i = 0; i < materie.size(); i++) {
            if (materie.get(i).getMateria().equalsIgnoreCase(materia) && materie.get(i).getDataVoto().isEqual(data)) {
                materie.get(i).setValutazione(voto);
            }
        }
    }

    public double mediaMaterie() { // stato implementazione: in corso
        double media = 0;

        for (int i = 0; i < materie.size(); i++) {
            
        }

        return media;
    }

    @Override
    public int compareTo(Object obj) {
        // prendiamo il nome

        return this.nominativo.compareTo(((Alunno) obj).getNominativo()); // con le stringhe se s1>s2 (alfabeto) = +1 e via  
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
    
        return  "\n⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺⸺"+
                 "\nNominativo = " + getNominativo() + "\tData di nascita = " + getDataDiNascita() + "\tResidenza = " + getIndirizzoDiResidenza() + "\n\n|-----------------------| valutazioni |-----------------------|" + s ; 
    }
}
