public class BlaaResepter extends Resepter {

    public BlaaResepter(Legemiddel legemiddel, Lege lege_ansvarlig, int pasient_id, int reit) {
        super(legemiddel, lege_ansvarlig, pasient_id, reit);
        legemiddel.settNyPris((int)Math.round(legemiddel.pris * 0.25));
    }

    @Override
    public String farge() {
        return "Blaa";
    }

    @Override
    public int prisAaBetale() {
        return legemiddel.pris;
    }
}
