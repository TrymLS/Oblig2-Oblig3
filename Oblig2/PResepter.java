public class PResepter extends HviteResepter {
    
    public PResepter(Legemiddel lege, Lege lege_ansvarlig, int pasient_id, int reit) {
        super(lege, lege_ansvarlig, pasient_id, reit);
        legemiddel.settNyPris(legemiddel.pris - 108);
        if (legemiddel.pris < 0) {
            legemiddel.settNyPris(0);
        }

    }
}
