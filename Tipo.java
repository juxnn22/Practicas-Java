public enum Tipo {
    ACUSTICA("Acústica"),
    ELECTRICA("Eléctrica"),
    CLASICA("Clásica");
    
    private final String type;
    
    Tipo(String t) {
        this.type = t;
    }
    
    public String getTipo() {
        return type;
    }
}