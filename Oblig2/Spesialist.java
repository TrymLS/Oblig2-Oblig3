public class Spesialist extends Lege implements Godkjenningsfritak {

    public final String kontrollkode;

    public Spesialist(String navn, String kontrollkode) {
        super(navn);
        this.kontrollkode = kontrollkode;
    }

    public String hentKontrollkode() {
        return kontrollkode;
    }
}

