package pruebaproxyhospital;

public class PruebaProxyHospital {

    public static void main(String[] args) {
        
        //el objeto historiaMedica sirve más bien como librería de todas las historias médicas
        
        HistoriaMedica historiaMedica=new HistoriaMedicaProxy();
        
        //Crear historia 0
        historiaMedica.crearHistoria(1, "Ana", "1234");
        
        System.out.println(historiaMedica.consultarHistoria(1, 0));
        
        historiaMedica.crearHistoria(2, "Pepe", "Pepe"); //No deja crear por el tipo de usuario
        
        //Crear historia 1
        historiaMedica.crearHistoria(1, "Juan", "5678");
        
        //Agregar visita en la historia 0
        historiaMedica.agregarVisita(1, 0, "02-04-2024"); //No deja agregar visita por el tipo de usuario
        historiaMedica.agregarVisita(3, 0, "01-01-2111");
        historiaMedica.agregarVisita(3, 0, "02-02-2112");
        
        //Agregar visita en la historia 1
        historiaMedica.agregarVisita(3, 1, "29-02-2004");      
        
        System.out.println(historiaMedica.consultarHistoria(1, 0));
        System.out.println(historiaMedica.consultarHistoria(1, 1));

    }   
}
