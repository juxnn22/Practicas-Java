public abstract class Instrumento {
    protected String n_serie;
    protected String marca;
    protected String modelo;
    protected int año;
    protected int precio;

    public Instrumento(String ns, String m, String mo, int a, int p) {
        this.n_serie = ns;
        this.marca = m;
        this.modelo = mo;
        this.año = a;
        this.precio = p;
    }
    
    public Instrumento() {
        this("", "", "", 0, 0);
    }

    public String getN_serie() {
        return this.n_serie;
    }

    public void setN_serie(String n_serie) {
        this.n_serie = n_serie;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return this.año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public abstract int cal_alquiler();

    public String mostrar() {
        String texto;
        texto = ("\n INFORMACIÓN DE INSTRUMENTO \n\n" + "\n Numero de serie: " + this.n_serie + "\n Marca: " + this.marca + "\n Modelo: " + this.modelo + "\n Año de fabricación: " + this.año + "\n Precio de alquiler: " + this.precio);
        return texto;
    }

    public abstract String getnombre();
} 