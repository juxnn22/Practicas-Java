public class Bajo extends Cuerda {
    private int n_trastes;

    public Bajo(String ns,String m, String mo, int a,int p, int nc, int nt) {
        super(ns,m,mo,a,p,nc);
        this.n_trastes = nt;
    }

    public Bajo() {
        this("","","",0,0,0,0);
    }

    public int getN_trastes() {
        return this.n_trastes;
    }

    public void setN_trastes(int n_trastes) {
        this.n_trastes = n_trastes;
    }

    @Override
    public int cal_alquiler() {
        int p = super.cal_alquiler() + 15;
        return p;
    }

    @Override
    public String mostrar() {
        String texto = super.mostrar() + ("\n Número de trastes: " + this.n_trastes) + ("\n Costo alquiler: " + this.cal_alquiler());
        return texto;
    }

    @Override
    public String getnombre() {
        return " Bajo ";
    }
}
