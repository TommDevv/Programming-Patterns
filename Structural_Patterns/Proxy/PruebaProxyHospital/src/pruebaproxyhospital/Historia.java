package pruebaproxyhospital;

import java.util.ArrayList;

public class Historia {
    
    private String nombre;
    private String documento;
    private ArrayList<String> fechaConsultas;

    Historia(String nombre, String documento){
        this.nombre=nombre;
        this.documento=documento;
        fechaConsultas=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public ArrayList<String> getFechaConsultas() {
        return fechaConsultas;
    }

    public void agregarFechaConsulta(String fechaConsulta) {
        this.fechaConsultas.add(fechaConsulta);
    }
@Override
public String toString() {
    return "Historia{" +
            "nombre='" + nombre + '\'' +
            ", documento='" + documento + '\'' +
            ", fechaConsultas=" + fechaConsultas +
            '}';
}
}
