package facturas;

public class FacturaDigital implements Factura{

    @Override
    public void imprimir(String nombre, String documento, String direccion, int cantBombillas) {
        System.out.println("----Factura----");
        System.out.println("Nombre:"+nombre);
        System.out.println("Documento:"+documento);
        System.out.println("Direccion:"+direccion);
        System.out.println("Cantidad:"+cantBombillas);
        System.out.println("Total::"+String.valueOf(cantBombillas*350));
    }
    
}
