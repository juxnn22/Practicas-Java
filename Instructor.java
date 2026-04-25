public class Instructor {
    private String nombre;
    private String id;
    private Ins instrumento;

    public Instructor(String nombre, String id, Ins instrumento) {
        this.nombre = nombre;
        this.id = id;
        this.instrumento = instrumento;
    }

    public Instructor() {
        this("", "",null);
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ins getInstrumento() {
        return this.instrumento;
    }

    public void setInstrumento(Ins instrumento) {
        this.instrumento = instrumento;
    }

    public String mostrar() {
        String texto = ("\n INFORMACIÓN DEL INSTRUCTOR \n\n" + "\n nombre: " + this.nombre + "\n Identificación: " + this.id + "\n Instrumento: " + this.instrumento.getInstrumento());
        return texto;
    }
}
