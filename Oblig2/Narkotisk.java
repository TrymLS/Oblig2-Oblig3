public class Narkotisk extends Legemiddel{
    
    int styrke;

    public Narkotisk(String navn, int pris, double virkestoff, int styrke) {
        super(navn, pris, virkestoff);
        this.styrke = styrke;
    }

    @Override
    public String toString() {
        return "Navn: " + navn + "\n" + "Legemiddel_Id: " + id + "\n" + 
        "Virkestoff: " + mg + "\n" + "Pris: " + pris + "\n" + "Styrke: " + styrke;
    }
}
