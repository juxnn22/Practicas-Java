public class Sistema {
    private ColaPeticiones<Peticion> cola;
    private Contenedor<Peticion> pila;
    
    public Sistema(ColaPeticiones<Peticion> cola, Contenedor<Peticion> pila) {
        this.cola = cola;
        this.pila = pila;
    }
    
    public void verificar() {
        Peticion dato = null;
        try {
            while (true) {
                dato = this.cola.desencolar();
                if (dato instanceof AccesoUser) {
                    if (((AccesoUser) dato).getIntentos() >= 3) {
                        System.out.println("[CRITICO] intento de fuerza bruta desde la IP: " + dato.getIP() + " por el usuario: " + ((AccesoUser) dato).getNombre() + ". Registrando Alerta.");
                        this.pila.apilar(dato);
                    } else {
                        System.out.println("[OK] Acceso concedido al usuario: " + ((AccesoUser) dato).getNombre());
                    }
                } else if (dato instanceof AccesoDispositivos) {
                    if (!((AccesoDispositivos) dato).isFirma()) {
                        System.out.println("[ALERTA] Dispositivo no identificado de tipo: " + ((AccesoDispositivos) dato).getTipo() + " sin firma digital. ");
                        this.pila.apilar(dato);
                    } else {
                        System.out.println("[OK] Conexión segura establecida con el dispositivo: " + ((AccesoDispositivos) dato).getTipo());
                    }
                }
            }
        } catch (ContenedorLlenoException e) {
            System.err.println("Código: " + e.getMessage());
            System.out.println("------- REPORTE ------\n\n");
            this.cola.encolar(dato);
            System.out.println("Peticiones Pendientes por procesar: \n");
            this.cola.reporte();
            System.out.println("Amenazas detectadas: \n");
            this.pila.reporte();
        } catch (ColaVaciaException e) {
            System.err.println("Código: " + e.getMessage());
            System.out.println("----- REPORTE ----- \n\n");
            System.out.println("Amenazas detectadas: ");
            this.pila.reporte();
        } catch (NullPointerException e) {
            System.out.println("Error, puntero nulo.");
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado. ");
        }
    }
}