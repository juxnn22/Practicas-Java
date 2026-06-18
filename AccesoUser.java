public class AccesoUser extends Peticion {
    private String nombre;
    private int intentos;
    
    public AccesoUser(String IP, String nombre, int intentos) {
        super(IP);
        this.nombre = nombre;
        this.intentos = intentos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIntentos() {
        return intentos;
    }
    
    
    
    @Override
    public String toString() {
        String texto = super.toString() + "\nNombre: " + this.nombre + "\nNro de Intentos: " + this.intentos + "\n";
        return texto;
    }
}