package lab03_juan_garcia_lynda_nasser;

public enum Materiales {
    BURBUJA(" Burbuja "),
    CARTON(" Carton "),
    ESPUMA(" Espuma "),
    PAPEL(" Papel ");
    
    private final String material;
    
    private Materiales(String m) {
        this.material = m;
    }

    public String getMaterial() {
        return material;
    }
    
}
