package Facturas;

public class DigitalSp implements FacturaSp {

    @Override
    public void imprimirEspañol(String nombre, String documento, String direccion, int cantBombillas) {
        System.out.println("----Factura----");
        System.out.println("Nombre:" + nombre);
        System.out.println("Documento:" + documento);
        System.out.println("Direccion:" + direccion);
        System.out.println("Cantidad:" + cantBombillas);
        System.out.println("Total::" + String.valueOf(cantBombillas * 350));
    }
}
