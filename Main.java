package lab03_juan_garcia_lynda_nasser;

public class Main {

    public static void main(String[] args) {
        Paquete p1 = new Fragil(20,Materiales.BURBUJA);
        Industrial p2 = new Industrial(15, true);
        CintaTransportadora<Paquete> cinta = new CintaTransportadora<>();
        cinta.encolar(p1);
        cinta.encolar(p2);
        Almacen<Paquete> almacen;
        try {
            almacen = new Almacen<>(-1);
            Robot bot = new Robot(cinta, almacen);
            bot.guardar();
            bot.guardar();
            bot.guardar();
        } catch (CapacidadExc e) {
            System.err.println("código: " + e.getMessage());
        }
        
        
        
        
        
    }
    
}
