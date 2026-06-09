package lab03_juan_garcia_lynda_nasser;

public class Industrial extends Paquete {
    private boolean montacargas;
    
    public Industrial(int peso, boolean m) {
        super(peso);
        this.montacargas = m;
    }
    
    @Override
    public String toString() {
        String texto = (super.toString() + ("\n\n Montacargas:" + this.montacargas));
        return texto;
    }

    public boolean isMontacargas() {
        return montacargas;
    }
    
    
}
