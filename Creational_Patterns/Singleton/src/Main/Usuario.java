package Main; 

public class Usuario {
    private static Usuario instancia;

    private String nombre;
    private String correo;
    private String clave;

    private Usuario(String nombre, String correo, String clave) {
        this.nombre = nombre;
        this.correo = correo;
        this.clave = clave;
    }

    public static Usuario obtenerInstancia(String nombre, String correo, String clave) {
    	
        if (instancia == null) {
            instancia = new Usuario (nombre, correo, clave);
        }
        return instancia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }
    
    public String getClave() {
        return clave;
    }
}

