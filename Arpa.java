public class Arpa extends Cuerda {
    private int n_pedales;

    public Arpa(String ns, String m,String mo,int a,int p, int nc,int np) {
        super(ns,m,mo,a,p,nc);
        this.n_pedales = np;
    }

    public Arpa() {
        this("","","",0,0,0,0);
    }

    public int getN_pedales() {
        return this.n_pedales;
    }

    public void setN_pedales(int n_pedales) {
        this.n_pedales = n_pedales;
    }

    @Override
    public int cal_alquiler() {
        int p = super.cal_alquiler() + 20;
        return p;
    }

    @Override
    public String mostrar() {
        String texto = super.mostrar() + ("\n Número de pedales: " + this.n_pedales) + ("\n Costo alquiler: " + this.cal_alquiler());
        return texto;
    }

    @Override
    public String getnombre() {
        return " Arpa ";
    }
}
