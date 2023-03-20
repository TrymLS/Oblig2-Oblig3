public class IndeksertListe<E> extends Lenkeliste<E> {
    
    public void leggTil(int pos, E x) {
        if (pos < 0 || pos > stoerrelse) {
            throw new UgyldigListeindeks(pos);  
        }
        if (pos == stoerrelse) {
            leggTil(x);
        } else {
            Node nyNode = new Node(x);
            if (pos == 0) {
                nyNode.neste = start;
                start = nyNode;
            } else {
                Node forrigeNode = finnNode(pos-1);
                nyNode.neste = forrigeNode.neste;
                forrigeNode.neste = nyNode;
            }
            stoerrelse++;
        }
    }

    public void sett(int pos, E x) {
        if (pos < 0 || pos >= stoerrelse) {
            throw new UgyldigListeindeks(pos);
        }
        Node funnet_node = finnNode(pos);
        funnet_node.data = x;
    }

    public E hent (int pos) {
        if (pos < 0 || pos >= stoerrelse) {
            throw new UgyldigListeindeks(pos);  
        }
        Node funnet_node = finnNode(pos);
        return funnet_node.data;

    }

    public E fjern (int pos) {
        if (pos < 0 || pos >= stoerrelse) {
            throw new UgyldigListeindeks(-1);  
        }
        if (pos == 0) {
            return fjern();
        } else {
            Node funnet_node = finnNode(pos-1);
            Node neste_node = funnet_node.neste;
            funnet_node.neste = neste_node.neste;
            stoerrelse--;
            return neste_node.data;
        }
    }

    private Node finnNode(int pos) {
        Node p = start;
        for (int i = 0; i < pos; i++) {
            p = p.neste;
        }
        return p;
    }
}
