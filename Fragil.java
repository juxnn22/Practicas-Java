package lab03_juan_garcia_lynda_nasser;

public class Fragil extends Paquete {
    private Materiales proteccion;
    
    public Fragil(int peso, Materiales p) {
        super(peso);
        this.proteccion = p; 
    }

    public Materiales getProteccion() {
        return proteccion;
    }
    
    @Override 
    public String toString() {
        String texto = (super.toString() + "\n\n Protección: " + this.proteccion.getMaterial());
        return texto;
    }
}
