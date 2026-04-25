import javax.swing.*;

public class Registro {
    private Instrumento instrumento;
    private Instructor instructor;
    private Clase clase;

    public Registro() {
        this.instrumento = null;
        this.instructor = null;
        this.clase = null;
    }

    public Instructor registInstructor(String n, String id, Ins i) {
        Instructor ins = new Instructor(n,id,i);
        return ins;
    }

    public Instrumento registInstrumento(int opcion, String ns, String m, String mo, int a, int p) {
        Instrumento ins = null;

        switch (opcion) {
            case 1 -> {
                int piezas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de teclas"));
                ins = new Piano(ns,m,mo,a,p,piezas);
            }
            case 2 -> {
                int piezas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de piezas: "));
                ins = new Bateria(ns,m,mo,a,p,piezas);
            }
            case 3 -> {
                int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de cuerdas: "));
                JComboBox<Tipo> comboBoxtipo = new JComboBox<>(Tipo.values());
                int seleccion = JOptionPane.showConfirmDialog(null, comboBoxtipo, "Ingrese el tipo de guitarra: ", JOptionPane.OK_CANCEL_OPTION);

                Tipo tipo = null;
                if (seleccion == JOptionPane.OK_OPTION) {
                    tipo = (Tipo) comboBoxtipo.getSelectedItem();
                }

                ins = new Guitarra(ns,m,mo,a,p,c,tipo);
            }
            case 4 -> {
                int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de cuerdas"));
                int t = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de trastes: "));
                ins = new Bajo(ns,m,mo,a,p,c,t);
            }
            case 5 -> {
                int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de cuerdas"));
                int pd = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de pedales: "));
                ins = new Arpa(ns,m,mo,a,p,c,pd);
            }
        }
        return ins;
    }

    public Clase registClase(String n, Instructor i, Instrumento in, int d, int c) {
        Clase clase = new Clase(n,i,in,d,c);
        return clase;
    }
}
