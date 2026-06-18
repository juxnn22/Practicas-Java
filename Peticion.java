public abstract class Peticion {
    private String IP;
    private static int i;
    private final int id;
    
    public Peticion(String IP) {
        i++;
        this.id = i;
        this.IP = IP;
    }

    public String getIP() {
        return IP;
    }

    public int getId() {
        return id;
    }
    
    
    
    @Override 
    public String toString() {
        String texto = "IP: " + this.IP + "\nID: " + this.id;
        return texto;
    }
}