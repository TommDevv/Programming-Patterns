package Compuestos;

import Interfaces.Componente;
import java.util.ArrayList;

public class Compuesta implements Componente {

    String nombre;
    ArrayList<Componente> lista = new ArrayList<Componente>();

    @Override
    public String getnombre() {
        return nombre;
    }

    @Override
    public float getprecioN() {
        float total = 0;
        for (Componente componente : lista) {
            total += componente.getprecioN();
        }
        return total;
    }

    @Override
    public void añadir(Componente con) {
        lista.add(con);
    }

    @Override
    public void borrar(Componente con) {
        lista.remove(con);
    }

    @Override
    public String toString() {
        String componentes = "";
        for (Componente componente : lista) {
                componentes += componente + " " + "\n";
        }
        componentes = "Nombre PC " + nombre + componentes;
        return componentes;
    }

}
