public class AccesoDispositivos extends Peticion {
    private String tipo;
    private boolean esFirma;
    
    public AccesoDispositivos(String IP, String tipo, boolean firma) {
        super(IP);
        this.tipo = tipo;
        this.esFirma = firma;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isFirma() {
        return esFirma;
    }
    
    @Override 
    public String toString() {
        String texto = super.toString() + "\nTipo: " + this.tipo + "\nFirma: " + this.esFirma + "\n";
        return texto;
    }
    
}