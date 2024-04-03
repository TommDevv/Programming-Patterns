package pruebaproxyhospital;

import java.util.ArrayList;

public class HistoriaMedicaReal implements HistoriaMedica{
    
   ArrayList<Historia> historias;
   
   HistoriaMedicaReal(){
    historias=new ArrayList<>();    
   }

    @Override
    public Historia consultarHistoria(int tipoUsuario, int idPaciente){
        Historia historia;
        historia=historias.get(idPaciente);
        return historia;
    }

    @Override
    public void crearHistoria(int tipoUsuario, String nombre, String documento){
        Historia historia=new Historia(nombre, documento);
        historias.add(historia);
    }
    
    @Override
    public void agregarVisita(int tipoUsuario, int idPaciente, String fecha){
        Historia historia;
        historia=historias.get(idPaciente);
        historia.agregarFechaConsulta(fecha);
    }    
}
