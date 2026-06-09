package lab03_juan_garcia_lynda_nasser;

public abstract class Paquete {
    private static int i;
    private final int id;
    private int peso;
    
    public Paquete(int peso) {
        i++;
        this.id = i;
        this.peso = peso;
    }    

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    @Override
    public String toString() {
        String texto = ("ID: " + this.id + "\n\n" + "Peso: " + this.peso);
        return texto;
    }

    public int getId() {
        return id;
    }
    
    
}
