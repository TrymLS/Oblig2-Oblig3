public class MilResept extends HviteResepter {
    
    
    public MilResept(Legemiddel legemiddel, Lege lege_ansvarlig, int pasient_id) {
        super(legemiddel, lege_ansvarlig, pasient_id, pasient_id);
        legemiddel.settNyPris(0);
        reit = 3;
        
    }
}
