import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
public class App {
    public static void main(String[] args) throws Exception {
        Classe c1 = new Classe(14, "4^Ai", 305);

        Alunno a1 = new Alunno("Leonardo", LocalDate.of(2003, 02, 24), "Via Spiazze 36");
        
        a1.addValutazione("Matematica", 8, LocalDate.of(2021, 12, 10));
        a1.addValutazione("italiano", 7, LocalDate.of(2021, 12, 10));
        a1.addValutazione("storia", 5, LocalDate.of(2021, 12, 19));
        a1.addValutazione("scienze", 9, LocalDate.of(2021, 12, 25));
        a1.addValutazione("Matematica", 2, LocalDate.of(2021, 12, 8));
        a1.addValutazione("Matematica", 10, LocalDate.of(2021, 12, 11)); 

        //a1.removeMateria("Matematica");
        //a1.modificaVoto("matematica", 3);
        //a1.changeVotoByMateriaData("matematica", LocalDate.of(2021, 12, 10), 6);
        //System.out.println(a1.mediaMateria("matematica")); 

        Alunno a2 = new Alunno("Kevin", LocalDate.of(2004, 07, 23), "Via Del Garda 58");
        Alunno a3 = new Alunno("Daniele",  LocalDate.of(2004, 07, 23), "Via Spiazze 36");
        Alunno a5 = new Alunno("Davide",  LocalDate.of(2004, 07, 23), "Via Spiazze 36");
        Alunno a4 = new Alunno("Giacomo",  LocalDate.of(2003, 02, 24), "Via Spiazze 36");
        Alunno a6 = new Alunno("Vanessa",  LocalDate.of(2003, 02, 24), "Via Spiazze 36");

        //System.out.println(a1.mediaMateria("matematica"));

        c1.addAlunno(a1);
        c1.addAlunno(a2);
        c1.addAlunno(a3);
        c1.addAlunno(a4);
        c1.addAlunno(a5);
        c1.addAlunno(a6);

        // Collections.sort(a1.getMaterie());
        // System.out.println(a1);

        ArrayList<Disciplina> m = a1.getMaterie();
        m.sort((m1, m2) -> m1.getDataVoto().compareTo(m2.getDataVoto()));
        System.out.println(m);
        // Collections.sort(c1.getAlunni());
        // System.out.println(c1);
        //System.out.println(c1.elencoAlunniAnno("2009"));

        
    }
}
