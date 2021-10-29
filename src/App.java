public class App {
    public static void main(String[] args) throws Exception {
        Classe c1 = new Classe(14, "4^Ai", 305);

        Alunno a1 = new Alunno("Leonardo", "24/02/2003", "Via Spiazze 36");
        a1.addValutazione("Matematica", 10);
        // a1.removeMateria("Matematica");
        // a1.modificaVoto("matematica", 3);
        a1.modificaMateria("matematica", "storia");

        Alunno a2 = new Alunno("Kevin", "24/02/2003", "Via Spiazze 36");
        Alunno a3 = new Alunno("Daniele", "24/02/2003", "Via Spiazze 36");
        Alunno a4 = new Alunno("Giacomo", "24/02/2003", "Via Spiazze 36");
        Alunno a5 = new Alunno("Davide", "24/02/2003", "Via Spiazze 36");
        Alunno a6 = new Alunno("Vanessa", "24/02/2003", "Via Spiazze 36");

        c1.addAlunno(a1);
        c1.addAlunno(a2);
        c1.addAlunno(a3);
        c1.addAlunno(a4);
        c1.addAlunno(a5);
        c1.addAlunno(a6);

    

        System.out.println(c1);
    }
}
