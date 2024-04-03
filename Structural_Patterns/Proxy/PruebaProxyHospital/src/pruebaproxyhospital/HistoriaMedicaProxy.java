package pruebaproxyhospital;

public class HistoriaMedicaProxy implements HistoriaMedica{
    
    /*
    TipoUsuario:
        1=Medico
        2=PersonalEnfermeria
        3=Recepcionista
    */

    HistoriaMedica historiaMedica;
    
    private void crearObjHistoriaMedica(){
        historiaMedica=new HistoriaMedicaReal();
    }
    
        
    @Override
    public Historia consultarHistoria(int tipoUsuario, int idPaciente){
        
        Historia historia;
        
        if(historiaMedica==null){
            crearObjHistoriaMedica();
        }
        
        if(tipoUsuario==1 || tipoUsuario==2){
            historia=historiaMedica.consultarHistoria(tipoUsuario, idPaciente);            
        }
        else{
            historia=new Historia("error","error");
        }        
        return historia;

    }

    @Override
    public void crearHistoria(int tipoUsuario, String nombre, String documento){
        if(historiaMedica==null){
            crearObjHistoriaMedica();
        }
        if(tipoUsuario==1){
            historiaMedica.crearHistoria(tipoUsuario, nombre, documento);
            System.out.println("Historia creada con éxito");
        }
        else{
            System.out.println("No posee los permisos necesarios para realizar esta acción");
        }
    }
    
    @Override
    public void agregarVisita(int tipoUsuario, int idPaciente, String fecha){
        
        Historia historia;
        
        if(historiaMedica==null){
            crearObjHistoriaMedica();           
        }
        
        if(tipoUsuario==3){
            historiaMedica.agregarVisita(tipoUsuario, idPaciente, fecha);
            System.out.println("Visita agregada con éxito");            
        }
        else{
            System.out.println("No posee los permisos necesarios para realizar esta acción");
        }         
               
    }    
}
