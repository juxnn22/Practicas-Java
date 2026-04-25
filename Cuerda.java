public abstract class Cuerda extends Instrumento {
    protected int n_cuerdas;
    
    public Cuerda(String ns, String m, String mo, int a, int p, int nc) {
        super(ns,m,mo,a,p);
        this.n_cuerdas = nc;
    }
    
    public Cuerda() {
        this("", "", "", 0,0,0);
    }

    public int getN_cuerdas() {
        return this.n_cuerdas;
    }

    public void setN_cuerdas(int n_cuerdas) {
        this.n_cuerdas = n_cuerdas;
    }

    @Override
    public int cal_alquiler() {
       if (this.año > 15) {
           int p = (int) (this.precio * 0.80);
           return p;
       } else if ((this.año > 5 ) && (this.año <=15)) {
           int p = (int) (this.precio *0.80);
           return p;
       } else if (this.año <= 5) {
           return (this.precio);
       } else {
           return 0;
       }
    }

    @Override
    public String mostrar() {
        String texto = super.mostrar() + ("\n Número de cuerdas: " + this.n_cuerdas);
        return texto;
    }
    
}