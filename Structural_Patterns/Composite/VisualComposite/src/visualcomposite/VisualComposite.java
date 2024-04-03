package practica_composite;

import Interfaces.Componente;
import Compuestos.Computador;
import Compuestos.Impresora;
import Hojas.*;
import java.util.ArrayList;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VisualComposite {

    static float total = 0;

    public static void main(String[] args) {

        ArrayList<Computador> ListaPcs = new ArrayList();
        ArrayList<Componente> ListaComp = new ArrayList();
        ArrayList<Componente> ListaCompAnadidos = new ArrayList();
        VentanaPrincipal v1 = new VentanaPrincipal();
        VentanaCrear v2 = new VentanaCrear();
        VentanaAñadir2 v3 = new VentanaAñadir2();

        v1.BtnAñadir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                v2.model.clear();
                for (Componente comp : ListaComp) {
                    v2.model.addElement(comp.getnombre());
                }
                v2.ComponentesList.setModel(v2.model);
                v2.setVisible(true);
            }
        });

        v2.BtnTerminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent g) {
                v2.setVisible(false);
            }
        });

        v1.BtnEliminarPc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent n) {
                float relativetotal = 0;
                String nombre = "";
                String opcion = "a";
                int index = 0;
                opcion = (String) v1.model2.getElementAt(v1.ListaComputadores.getSelectedIndex());
                v1.model2.remove(v1.ListaComputadores.getSelectedIndex());
                v1.ListaComputadores.setModel(v1.model2);
                for (Computador comp : ListaPcs) {
                    nombre = comp.getnombre();
                    index = ListaPcs.indexOf(comp);
                    relativetotal = comp.getprecioN();
                    if (nombre.equals(opcion) && (index + 1) != ListaPcs.size()) {
                        total = total - comp.getprecioN();
                        ListaPcs.remove(index);
                        nombre = "";
                    }
                }
                if (nombre.equals(opcion)) {
                    ListaPcs.remove(index);
                    total = total - relativetotal;
                }
                v1.LabelValor.setText(String.valueOf(total));
            }
        });

        v1.BtnInfo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent m) {
                String nombre = "";
                String opcion = "a";
                int index = 0;
                opcion = (String) v1.model2.getElementAt(v1.ListaComputadores.getSelectedIndex());
                for (Computador comp : ListaPcs) {
                    nombre = comp.getNombre();
                    if (nombre.equals(opcion)) {
                        v1.Info.setText(comp.toString());
                    }
                }
            }
        });

        v3.BtnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent g) {
                v3.setVisible(false);
                ListaCompAnadidos.clear();
                v3.ComboComps.removeAll();
            }
        });

        v3.BtnAñadir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent k) {
                String valor;
                String nombre = "";
                for (Componente comp : ListaComp) {
                    nombre = comp.getnombre();
                    if (nombre.equals(v3.ComboComps.getSelectedItem())) {
                        ListaCompAnadidos.add(comp);
                        v3.Componentes.setText(v3.Componentes.getText() + comp.getnombre() + "\n");
                    }
                }
            }
        });

        v3.ConsultaPrecio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent j) {
                String valor;
                String nombre = "";
                for (Componente comp : ListaComp) {
                    nombre = comp.getnombre();
                    if (nombre.equals(v3.ComboComps.getSelectedItem())) {
                        v3.PrecioValue.setText(String.valueOf(comp.getprecioN()));
                    }
                }
            }
        });

        v1.BtnAñadirPc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent i) {
                for (Componente comp : ListaComp) {
                    v3.ComboComps.addItem(comp.getnombre());
                }
                v3.Componentes.setText("");
                v3.setVisible(true);
            }
        });

        v2.BtnEliminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent h) {
                String nombre = "";
                String opcion = "a";
                int index = 0;
                opcion = (String) v2.model.getElementAt(v2.ComponentesList.getSelectedIndex());
                v2.model.remove(v2.ComponentesList.getSelectedIndex());
                v2.ComponentesList.setModel(v2.model);
                for (Componente comp : ListaComp) {
                    nombre = comp.getnombre();
                    index = ListaComp.indexOf(comp);
                    if (nombre.equals(opcion) && (index + 1) != ListaComp.size()) {
                        ListaComp.remove(index);
                        nombre = "";
                    }
                }
                if (nombre.equals(opcion)) {
                    ListaComp.remove(index);
                }
            }
        });

        v3.BtnCrear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent l) {
                Computador PCDummy = new Computador("Dummy");
                float totalrelativo = 0;
                PCDummy.setNombre(v3.nombrePc.getText());
                for (Componente comp : ListaCompAnadidos) {
                    PCDummy.añadir(comp);
                    totalrelativo = totalrelativo + comp.getprecioN();
                }
                ListaPcs.add(PCDummy);
                v1.model2.addElement(PCDummy.getNombre());
                v1.ListaComputadores.setModel(v1.model2);
                ListaCompAnadidos.clear();
                total = total + totalrelativo;
                v1.LabelValor.setText(String.valueOf(total));
                v3.setVisible(false);
                v3.ComboComps.removeAll();
                PCDummy = null;
            }
        });

        v2.BtnAñadir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent f) {
                int tipo;
                tipo = v2.ComboComp.getSelectedIndex();
                String nombre;
                int valor;
                nombre = v2.FieldNombre.getText();
                valor = Integer.parseInt(v2.FieldPrecio.getText());
                v2.model.addElement(nombre);
                v2.ComponentesList.setModel(v2.model);
                switch (tipo) {
                    case 0:
                        ListaComp.add(new DiscoDuro(nombre, valor));
                        break;
                    case 1:
                        ListaComp.add(new DiscoSolido(nombre, valor));
                        break;
                    case 2:
                        ListaComp.add(new GPU(nombre, valor));
                        break;
                    case 3:
                        ListaComp.add(new Memoria(nombre, valor));
                        break;
                    case 4:
                        ListaComp.add(new Procesador(nombre, valor));
                        break;
                    case 5:
                        ListaComp.add(new TarjetaDeVideo(nombre, valor));
                        break;
                    default:
                        break;
                }
            }
        });

        v1.setVisible(true);

    }

}
