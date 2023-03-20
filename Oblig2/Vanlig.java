public class Vanlig extends Legemiddel{
    
    public Vanlig(String navn, int pris, double virkestoff) {
        super(navn, pris, virkestoff);
    }

    @Override
    public String toString() {
        return "Navn: " + navn + "\n" + "Legemiddel_Id: " + id + "\n" + 
        "Virkestoff: " + mg + "\n" + "Pris: " + pris;
    }
}
