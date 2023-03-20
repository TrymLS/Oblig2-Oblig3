public class Vanedannende extends Legemiddel{
    
    int vanedannende;

    public Vanedannende(String navn, int pris, double virkestoff, int styrke) {
        super(navn, pris, virkestoff);
        vanedannende = styrke;
    }

    @Override
    public String toString() {
        return "Navn: " + navn + "\n" + "Legemiddel_Id: " + id + "\n" + 
        "Virkestoff: " + mg + "\n" + "Pris: " + pris + "\n" + "Styrke: " + vanedannende;
    }
}
