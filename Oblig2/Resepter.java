public abstract class Resepter {
    
    public final int id;
    public Legemiddel legemiddel;
    public Lege lege_ansvarlig; 
    public int pasient_id;
    public int reit;
    static int counter;

    public Resepter(Legemiddel legemiddel, Lege utskrivendeLege, int pasient_id, int reit) {
        this.legemiddel = legemiddel;
        this.lege_ansvarlig = utskrivendeLege;
        this.pasient_id = pasient_id;
        this.reit = reit;
        id = counter;
        counter++;    
    }

    public int hentId() {
        return id;
    }

    public Legemiddel hentLegemiddel() {
        return legemiddel;
    }

    public Lege hentLege() {
        return lege_ansvarlig;
    }

    public int hentPasientId() {
        return pasient_id;
    }

    public int hentReit() {
        return reit;
    }

    public boolean Bruk() {
        if (reit == 0) {
            return false;
        }
        else {reit--; return true;}
    }

    abstract public String farge();

    abstract public int prisAaBetale();

    @Override
    public String toString() {
        return "Resept_Id: " + id + "\n" + "Legemiddel: " + legemiddel + "\n"
        + "Lege_ansvarlig: " + lege_ansvarlig + "\n" + "Pasient_id: " + pasient_id + "\n"
        + "Reit: " + reit + "\n";
    }    
}
