public class Piano extends Instrumento {
    private int n_teclas;

    public Piano(String ns, String m, String mo, int a, int p, int nt) {
        super(ns,m,mo,a,p);
        this.n_teclas = nt;
    }

    public Piano() {
        this("","","",0,0,0);
    }

    public int getN_teclas() {
        return this.n_teclas;
    }

    public void setN_teclas(int n_teclas) {
        this.n_teclas = n_teclas;
    }

    @Override
    public int cal_alquiler() {
        int p = this.precio + (this.n_teclas * 3);
        return p;
    }

    @Override
    public String mostrar() {
        String texto = super.mostrar() + ("\n Número de teclas: " + this.n_teclas) + ("\n Costo de alquiler: " + this.cal_alquiler());
        return texto;
    }

    @Override
    public String getnombre() {
        return " Piano ";
    }
}
