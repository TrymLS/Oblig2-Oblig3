public abstract class Legemiddel {

    public final int id;
    public int pris;
    public final String navn;
    public final Double mg;
    public static int counter = 0;


    public Legemiddel(String navn, int pris, double virkestoff) {
        this.navn = navn;
        this.pris = pris;
        mg = virkestoff;
        id = counter;
        counter++;
    }

    public int hentPris() {
        return pris;
    }

    public void settNyPris(int pris) {
        this.pris = pris; 
    }

    @Override
    public String toString() {
        return "Navn: " + navn + "\n" + "Legemiddel_Id: " + id + "\n" + 
        "Virkestoff: " + mg + "\n" + "Pris: " + pris;
    }
}   