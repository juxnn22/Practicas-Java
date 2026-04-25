public class Guitarra extends Cuerda {
    Tipo tipo;

    public Guitarra(String ns, String m, String mo, int a, int p, int nc, Tipo t) {
        super(ns,m,mo,a,p, nc);
        this.tipo = t;
    }

    public Guitarra() {
        this("","","",0,0,0,null);
    }

    public Tipo getTipo() {
        return this.tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public int cal_alquiler() {
        int p = super.cal_alquiler() + 10;
        return p;
    }

    @Override
    public String mostrar() {
        String texto = super.mostrar() + ("\n Tipo de Guitarra: " + this.tipo.getTipo()) + ("\n Costo de alquiler: " + this.cal_alquiler());
        return texto;
    }

    @Override
    public String getnombre() {
        return " Guitarra ";
    }
}