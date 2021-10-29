import java.util.ArrayList;
import java.util.Objects;

public class Classe {
    /******************** attributi ********************/
    ArrayList<Alunno> alunni = new ArrayList<>();
    private int elencoAlunni;
    private String identifictore;
    private int numeroAula;

    /******************** metodi ********************/
    public Classe() {
    }

    public Classe(int elencoAlunni, String identifictore, int numeroAula) {
        this.elencoAlunni = elencoAlunni;
        this.identifictore = identifictore;
        this.numeroAula = numeroAula;
    }

    public int getElencoAlunni() {
        return this.elencoAlunni;
    }

    public void setElencoAlunni(int elencoAlunni) {
        this.elencoAlunni = elencoAlunni;
    }

    public String getIdentifictore() {
        return this.identifictore;
    }

    public void setIdentifictore(String identifictore) {
        this.identifictore = identifictore;
    }

    public int getNumeroAula() {
        return this.numeroAula;
    }

    public void setNumeroAula(int numeroAula) {
        this.numeroAula = numeroAula;
    }

    public Classe elencoAlunni(int elencoAlunni) {
        setElencoAlunni(elencoAlunni);
        return this;
    }

    public Classe identifictore(String identifictore) {
        setIdentifictore(identifictore);
        return this;
    }

    public Classe numeroAula(int numeroAula) {
        setNumeroAula(numeroAula);
        return this;
    }

    public void addAlunno (Alunno alunno) {
        alunni.add(alunno);
    }

    public Alunno findAlunno (String nominativo) {
        Alunno a = null;

        for (int i = 0; i < alunni.size(); i++) {
            if (nominativo.equals(alunni.get(i).getNominativo())) {
                a = alunni.get(i);
            }
            else {
                System.out.println("Lo studente non fa parte di questa classe");
            }
        }

        return a;
    }

    public boolean removeAlunnoByPosizione(int posizione) {
        boolean esito = false;

        if (alunni.get(posizione) != null) {
            alunni.remove(posizione);
            esito = true;
        }
             
        return esito;
    }

    public boolean removeAlunnoByNominativo(String nominativo) {
        boolean esito = false;

        for (int i = 0; i < alunni.size(); i++) {
            if (nominativo.equals(alunni.get(i).getNominativo())) {
                alunni.remove(i);
                esito = true;
            }
        }

        return esito;
    }

    public ArrayList<Alunno> elencoAlunniAnno(String anno) {
        ArrayList<Alunno> alunniStessoAnno = new ArrayList<>();

        for (int i = 0; i < alunni.size(); i++) {
            if (alunni.get(i).getDataDiNascita().contains(anno)) {
                alunniStessoAnno.add(alunni.get(i));
            }
        }

        return alunniStessoAnno;
    }

    public String dataDiNascita(int i) {
        return alunni.get(i).getDataDiNascita();
    }

    public int numeroAlunni() {
        return alunni.size();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Classe)) {
            return false;
        }
        Classe classe = (Classe) o;
        return elencoAlunni == classe.elencoAlunni && Objects.equals(identifictore, classe.identifictore) && numeroAula == classe.numeroAula;
    }

    @Override
    public int hashCode() {
        return Objects.hash(elencoAlunni, identifictore, numeroAula);
    }

    @Override
    public String toString() {
        String s = "";

        for (int i = 0; i < alunni.size(); i++) {
            s += alunni.get(i);
        }

        return "\nElenco alunni: " + elencoAlunni +
            "\tSezione: " + identifictore +
            "\tNumero aula: " + numeroAula + s;
    }  
}
