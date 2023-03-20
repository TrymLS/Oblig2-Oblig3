public class Prioritetskoe<E extends Comparable<E>> extends Lenkeliste<E> {
    
    @Override
    public void leggTil(E x) {
        Node nyNode = new Node(x);

        if (start == null || x.compareTo(start.data) < 0) {
            nyNode.neste = start;
            start = nyNode;
        } else {
            Node forrige = start;
            while (forrige.neste != null && x.compareTo(forrige.neste.data) > 0) {
                forrige = forrige.neste;
            }
            nyNode.neste = forrige.neste;
            forrige.neste = nyNode;
        }
        stoerrelse++;
    }
}

