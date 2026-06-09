package lab03_juan_garcia_lynda_nasser;

public class Robot {
    private CintaTransportadora<Paquete> cinta;
    private Almacen<Paquete> almacen;
    
    public Robot(CintaTransportadora<Paquete> c, Almacen<Paquete> a) {
        this.cinta = c;
        this.almacen = a;
    }
    
    public void guardar() {
        while (!(this.cinta.esVacia())) {
            try {
                Paquete dato = this.cinta.desencolar();
                if (dato instanceof Fragil) {
                    String proteccion = ((Fragil) dato).getProteccion().getMaterial();
                    System.out.println("Cuidado!, paquete envuelto en: " + proteccion);
                    this.almacen.almacenar(dato);
                } else if (dato instanceof Industrial) {
                    if (((Industrial) dato).isMontacargas()) {
                        System.out.println("PESO EXCESIVO. Activando grúa hidráulica. ");
                        this.almacen.almacenar(dato);
                    } else {
                        System.out.println("Peso estandar. Usando brazo robótico. ");
                        this.almacen.almacenar(dato);
                    }
                }
            } catch (CintaExc e){
                System.err.println("Error, código: " + e.getMessage());
            } catch (CapacidadExc e) {
                System.err.println(" código: " + e.getMessage());
            } catch (Exception e) {
                System.err.println("Se ha presentado un error inesperado");
            }
        }
    }
}