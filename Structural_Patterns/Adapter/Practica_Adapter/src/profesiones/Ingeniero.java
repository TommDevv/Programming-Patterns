package profesiones;

public class Ingeniero implements Target_Profesionales {
    
    public Ingeniero(){
        super();
        System.out.println("Contruccion de obras civiles");
    }
    
    @Override
    public void Leer_planos(){
        System.out.println("Planos de todo tipo");
    }
    
    @Override
    public void contratos(){
     System.out.println("Elaborar contratos construccion");   
    }
    
    @Override
    public void supervision(){
        System.out.println("Auditoria y control");
    }
}
