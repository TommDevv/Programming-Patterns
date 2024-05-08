package profesiones;

public class Arquitecto implements Target_Profesionales {
    
    @Override
    public void Leer_planos(){
        System.out.println("Planos de todo tipo");
    }
    
    @Override
    public void contratos(){
        System.out.println("Contratos dibujantes");
    }
    
    @Override
    public void supervision(){
        System.out.println("Auditoria diseño ");
    }
}
