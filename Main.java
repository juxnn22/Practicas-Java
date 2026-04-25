import java.time.LocalDate;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        Registro reg = new Registro();
        Instructor nuevo = null;
        Instrumento instrumento = null;
        Clase clase = null;

        int cont = JOptionPane.YES_OPTION;
        while (cont == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "MENÚ DE REGISTRO DE MÚSICA ");
            String[] opciones = {"Instrumento", "Instructor", "Clase", "Salir"};
            int opcion = JOptionPane.showOptionDialog(null, "Qué desea registrar:", "Menú", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null , opciones,opciones[0]);
            switch (opcion) {
                case 0 -> {
                    JOptionPane.showMessageDialog(null, "Registrando Instrumento");
                    JTextField campoNserie = new JTextField();
                    JTextField campoMarca = new JTextField();
                    JTextField campoModelo = new JTextField();
                    JTextField campoaño = new JTextField();
                    JTextField campoprecio = new JTextField();

                    Object[] formulario = {" Número de serie: ", campoNserie,
                     "Marca:", campoMarca, " Modelo: ", campoModelo, "Año: ",
                    campoaño, "Precio: ", campoprecio};

                    int seleccion = JOptionPane.showConfirmDialog(null, formulario, "Menu de registro", JOptionPane.OK_CANCEL_OPTION);

                    String ns,m,mo = "";
                    int año,precio = 0;

                    if (seleccion == JOptionPane.OK_OPTION) {
                        ns = campoNserie.getText();
                        m = campoMarca.getText();
                        mo = campoModelo.getText();
                        año = Integer.parseInt(campoaño.getText());
                        precio = Integer.parseInt(campoprecio.getText());
                        int eleccion = Integer.parseInt(JOptionPane.showInputDialog(null, "Qué instrumento desea registrar? (1- Piano; 2- Bateria; 3- Guitarra; 4- Bajo; 5- Arpa"));
                        instrumento = reg.registInstrumento(eleccion,ns,m,mo,año,precio);
                        JOptionPane.showMessageDialog(null, instrumento.mostrar());
                    }

                }
                case 1 -> {
                    JOptionPane.showMessageDialog(null, "Registrando instructor...");
                    JTextField campoNombre = new JTextField();
                    JTextField campoId = new JTextField();
                    JComboBox<Ins> comboBoxIns = new JComboBox<>(Ins.values());
                    Object[] form = {
                            "Nombre: " , campoNombre,
                            "Identificación: ", campoId,
                            "Instrumento de especialidad: ", comboBoxIns
                    };

                    int f = JOptionPane.showConfirmDialog(null, form, "Menú de registro",JOptionPane.OK_CANCEL_OPTION);

                    if (f == JOptionPane.OK_OPTION) {
                        String nombre = campoNombre.getText();
                        String id = campoId.getText();
                        Ins in = (Ins) comboBoxIns.getSelectedItem();
                        nuevo = reg.registInstructor(nombre, id, in);
                    }
                    if (nuevo != null) {
                        JOptionPane.showMessageDialog(null, nuevo.mostrar());
                    } else {
                        JOptionPane.showMessageDialog(null,"Error, Instructor no registrado. ");
                    }

                }
                case 2 -> {
                    JOptionPane.showMessageDialog(null, "Registrando una clase. ");
                    if ((nuevo != null) && (instrumento != null)) {
                        JTextField campoNombre = new JTextField();
                        JTextField campoDuracion = new JTextField();
                        JTextField campoCosto = new JTextField();

                        Object[] form = {
                                "Nombre de la clase: ", campoNombre,
                                "Duración de la clase: ", campoDuracion,
                                "Costo de la clase: ", campoCosto,
                                "Instructor asignado: ", nuevo.getNombre(),
                                "Instrumento: ", instrumento.getnombre()
                        };
                        int e = JOptionPane.showConfirmDialog(null, form, "Menú de registro",JOptionPane.OK_CANCEL_OPTION);

                        if (e == JOptionPane.OK_OPTION) {
                            String nombre = campoNombre.getText();
                            int duracion = Integer.parseInt(campoDuracion.getText());
                            int costo = Integer.parseInt(campoCosto.getText());
                            clase = reg.registClase(nombre, nuevo, instrumento, duracion, costo);
                        }

                        if (clase != null) {
                            JOptionPane.showMessageDialog(null, clase.mostrar());
                        } else {
                            JOptionPane.showMessageDialog(null, "Error, no se pudo registrar la clase.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, " Sin Instructores o Instrumentos registrados" + "\n - Registre Instructores e Instrumentos primero.");
                    }
                }
                case 3 -> cont = JOptionPane.NO_OPTION;
            }
            if ( cont == JOptionPane.YES_OPTION) {
                cont = JOptionPane.showConfirmDialog(null, "Desea realizar otro registro? :");
            }
        }

    }
}