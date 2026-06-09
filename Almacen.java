
package lab03_juan_garcia_lynda_nasser;

public class Almacen<T> {
    private final int capacidad;
    private int index;
    private T[] almacen;
    
    public Almacen(int capacidad) throws CapacidadExc {
        if ( capacidad > 0) {
            this.capacidad = capacidad;
            this.almacen = (T[]) new Object[capacidad];
            this.index = -1;
        } else {
            throw new CapacidadExc("Error, la capacidad debe ser mayor a 0");
        }
    }
    
    public void almacenar(T dato) throws CapacidadExc {
        if (this.index < this.capacidad-1) {
            this.index++;
            this.almacen[this.index] = dato;
        } else {
            throw new CapacidadExc(" Error, almacen lleno. ");
        }
    }

    public int getCapacidad() {
        return capacidad;
    }

    public T[] getAlmacen() {
        return almacen;
    }
    
    
}
