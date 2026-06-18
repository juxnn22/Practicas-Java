public class Main {
    public static void main(String[] args) {
        try {
            Contenedor<Peticion> registro = new Contenedor<>(5);
            ColaPeticiones<Peticion> fila = new ColaPeticiones<>();
            Peticion p1 = new AccesoUser("1111","Juan", 4);
            Peticion p2 = new AccesoDispositivos("2122", "Servidor loT", true);
            AccesoUser p3 = new AccesoUser("4444", "Paula", 2);
            AccesoDispositivos p4 = new AccesoDispositivos("6565", "Terminal Móvil", false);
            AccesoUser p5 = new AccesoUser("4666", "Lynda",5 );
            Peticion p6 = new AccesoUser("7979", "Maria", 1);
            fila.encolar(p1);
            fila.encolar(p2);
            fila.encolar(p3);
            fila.encolar(p4);
            fila.encolar(p5);
            fila.encolar(p6);
            Sistema st = new Sistema(fila,registro);
            System.out.println("Total de peticiones: \n");
            fila.reporte();
            st.verificar();
            
        } catch (NullPointerException e) {
            System.err.println("Error, puntero nulo");
        } catch (CapacidadException e) {
            System.err.println("Código: " + e.getMessage());
        }
    }
}