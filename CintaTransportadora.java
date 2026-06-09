package lab03_juan_garcia_lynda_nasser;

public class CintaTransportadora<T> {
    private Nodo<T> first;
    private Nodo<T> last;
    private int index;
    
    public CintaTransportadora() {
        this.index = -1;
        this.first = null;
        this.last = null;
    }
    
    public void encolar(T dato) {
        if (dato != null) {
            Nodo<T> nodo = new Nodo<>(dato);
            if (index < 0) {
                this.first = nodo;
                this.last = nodo;
                this.index++;
            } else {
                this.last.setSiguiente(nodo);
                this.last = this.last.getSiguiente();
                this.index++;
            }
        }
    }
    
    public boolean esVacia() {
        if ((this.first == null) || (this.last == null)) {
            return true;
        } else {
            return false;
        }
    }
    
    public T desencolar() throws CintaExc {
        if (!this.esVacia()) {
            if (this.first.getSiguiente() != null) {
                T dato = this.first.getDato();
                this.first = this.first.getSiguiente();
                this.index--;
                return dato;
            } else {
                T dato = this.first.getDato();
                this.first = null;
                this.last = null;
                this.index--;
                return dato;
            }
        } else {
            throw new CintaExc("Error, cinta transportadora vacía. ");
        }
    }

    public int getIndex() {
        return index;
    }
    
    
}
