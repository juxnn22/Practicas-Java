public class Bateria extends Instrumento{
    private int n_piezas;

    public Bateria(String ns, String m, String mo, int a, int p, int np) {
        super(ns,m,mo,a,p);
        this.n_piezas = np;
    }

    public Bateria() {
        this("","","",0,0,0);
    }

    public int getN_piezas() {
        return this.n_piezas;
    }

    public void setN_piezas(int n_piezas) {
        this.n_piezas = n_piezas;
    }

    @Override
    public int cal_alquiler() {
        int p = this.precio + (this.n_piezas * 5);
        return p;
    }

    @Override
    public String mostrar() {
        String texto = super.mostrar() + ("\n Número de piezas: " + this.n_piezas) + ("\n Costo de alquiler: " + this.cal_alquiler());
        return texto;
    }

    @Override
    public String getnombre() {
        return " Bateria ";
    }
}
