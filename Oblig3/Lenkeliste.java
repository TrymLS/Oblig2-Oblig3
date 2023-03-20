abstract class Lenkeliste<E> implements Liste<E> {
    
    protected Node start, slutt; 
    protected int stoerrelse = 0;


    protected class Node {
        Node neste;
        E data;

        Node(E data) {
            this.data = data;
        }
    }

    @Override
    public int stoerrelse() {
        return stoerrelse;

    }

    @Override
    public void leggTil(E x) {
        Node nyNode = new Node(x);
        if (start == null) {
            start = nyNode;
        }
        else {
            slutt.neste = nyNode;
        }
        slutt = nyNode;
        stoerrelse++;
    }

    @Override
    public E hent() {
        if (start == null) {
            throw new UgyldigListeindeks(-1);
        }
        return start.data;
    }

    @Override
    public E fjern() {
        if (start == null) {
            throw new UgyldigListeindeks(-1);
        }
        E data = start.data;
        start = start.neste;
        stoerrelse--;
        return data;
   }

   @Override
   public String toString() {
    StringBuilder utskrift = new StringBuilder();
    Node denne = start;
    while (denne != null) {
        utskrift.append(denne.data);
        if (denne.neste != null) {
            utskrift.append(", ");
        }
        denne = denne.neste;
    }
    return "[" + utskrift.toString() + "]";
    }
}


 