package Main;

public class Main {
    public static void main(String[] args) {
       
        Usuario usuario1 = Usuario.obtenerInstancia("Danna", "kadajo11259@gmail.com", "Danna123");
        Usuario usuario2 = Usuario.obtenerInstancia("Valentina", "vruizd@gmail.com", "Valen4356");

        System.out.println(usuario1.getNombre()); 
        System.out.println(usuario2.getNombre()); 

        Usuario usuario3 = Usuario.obtenerInstancia("Karol", "kruizd@gmail.com", "Oddysbebexd");
        System.out.println(usuario3.getNombre()); 
    }
}
