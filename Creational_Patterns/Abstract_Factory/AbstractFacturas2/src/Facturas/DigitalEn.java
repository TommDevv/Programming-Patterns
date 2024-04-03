package Facturas;

public class DigitalEn implements FacturaEn {

    @Override
    public void imprimirIngles(String nombre, String documento, String direccion, int cantBombillas) {
        System.out.println("----Bill----");
        System.out.println("Name:" + nombre);
        System.out.println("Document:" + documento);
        System.out.println("Direction:" + direccion);
        System.out.println("Amount:" + cantBombillas);
        System.out.println("Total::" + String.valueOf(cantBombillas * 350));
    }
}
