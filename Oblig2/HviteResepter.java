public class HviteResepter extends Resepter {
    
    public HviteResepter(Legemiddel legemiddel, Lege utskrivendelLege, int pasient_id, int reit) {
        super(legemiddel, utskrivendelLege, pasient_id, reit);
    }

    @Override
    public String farge() {
        return "Hvit";
    }

    @Override
    public int prisAaBetale() {
        return legemiddel.pris;
    }
}

