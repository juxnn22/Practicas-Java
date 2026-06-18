public class Contenedor<T> {
    private T[] pila;
    private final int capacidad;
    private int index;
    
    public Contenedor(int capacidad) throws CapacidadException {
        if (capacidad > 0) {
            this.capacidad = capacidad;
            this.index = -1;
            this.pila = (T[]) new Object[capacidad];
        } else {
            throw new CapacidadException("Error, la capacidad debe ser mayor a 0.");
        }
    }
    
    public boolean esVacia() {
        if (this.index < 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public void apilar(T dato) throws ContenedorLlenoException {
        if (this.index < this.capacidad-1) {
            this.index++;
            this.pila[this.index] = dato;
        } else {
            throw new ContenedorLlenoException("Error, el contenedor ya está lleno.");
        }
    }
    
    public void reporte() {
        int j=1;
        for (int i=this.index; i>=0; i--) {
            System.out.println("Objeto #" + j + ": " + this.pila[i].toString());
            j++;
        }
    }
}