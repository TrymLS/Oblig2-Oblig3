public class Hovedprogram {
    public static void main(String[] args) {

        // Opretter objekter av Legemiddel klassen
        Vanedannende ritalin = new Vanedannende("Ritalin", 150, 15, 50);
        Narkotisk cannabis = new Narkotisk("Cannabis", 200, 40, 100);
        Vanlig cetrizin = new Vanlig("Cetrizin", 180, 20);

        // Oppretter objekter av Lege klassen
        Lege per = new Lege("Per");
        Spesialist tor = new Spesialist("Tor", "341");

        // Oppretter objekter av Resept
        PResepter allergiTabletter = new PResepter(cetrizin, per, 1431, 2);
        MilResept amfetamin = new MilResept(ritalin, tor, 0);
        BlaaResepter marijuana = new BlaaResepter(cannabis, per, 2341, 0);
 
        System.out.println("Test for utskrift av resepten allergitabletter");
        System.out.println("\n" + allergiTabletter);

        System.out.println("Test for utskrift av resepten amfetamin");
        System.out.println("\n" + amfetamin);

        System.out.println("Test for uskrift av resepten marijuana");
        System.out.println("\n" + marijuana);
    }
}
