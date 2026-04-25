public class Clase {
    private String nombre;
    private Instructor ins;
    private Instrumento in;
    private int duracion;
    private int costo_mes;

    public Clase(String nombre, Instructor ins, Instrumento in, int duracion, int costo_mes) {
        this.nombre = nombre;
        this.ins = ins;
        this.in = in;
        this.duracion = duracion;
        this.costo_mes = costo_mes;
    }

    public Clase() {
        this("", null, null, 0, 0);
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Instructor getIns() {
        return this.ins;
    }

    public void setIns(Instructor ins) {
        this.ins = ins;
    }

    public Instrumento getIn() {
        return this.in;
    }

    public void setIn(Instrumento in) {
        this.in = in;
    }

    public int getDuracion() {
        return this.duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getCosto_mes() {
        return this.costo_mes;
    }

    public void setCosto_mes(int costo_mes) {
        this.costo_mes = costo_mes;
    }

    public String mostrar() {
        String texto = ("\n INFORMACIÓN DE CLASE \n"  + this.ins.mostrar() + this.in.mostrar());
        return texto;
    }
}
