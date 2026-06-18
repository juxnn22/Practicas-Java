public class ColaPeticiones<T> {
    private Nodo<T> first;
    private Nodo<T> last;
    
    public ColaPeticiones() {
        this.first = null;
        this.last = null;
    }
    
    public boolean esVacia() {
        return (this.first == null);
    }
    
    public void encolar(T dato) {
        if (dato != null) {
            Nodo<T> nodo = new Nodo<>(dato);
            if (this.esVacia()) {
                this.first = nodo;
                this.last = nodo;
            } else {
                this.last.setSiguiente(nodo);
                this.last = this.last.getSiguiente();
            }
        }
    }
    
    public T desencolar() throws ColaVaciaException {
        if (!this.esVacia()) {
            if (this.first == this.last) {
                T dato = this.first.getDato();
                this.first = null;
                this.last = null;
                return dato;
            } else {
                T dato = this.first.getDato();
                this.first = this.first.getSiguiente();
                return dato;
            }
        } else {
            throw new ColaVaciaException("Error, la cola ya está vacía. ");
        }
    }
    
    public void reporte() {
        if (!this.esVacia()) {
            int i=0;
            Nodo<T> aux = this.first;
            while (aux.getSiguiente() != null) {
                i++;
                System.out.println("Objeto #" + i + ": " + aux.getDato().toString());
                aux = aux.getSiguiente();
            }
            i++;
            System.out.println("Objeto #" + i + ": " + aux.getDato().toString());
        }
    }
}