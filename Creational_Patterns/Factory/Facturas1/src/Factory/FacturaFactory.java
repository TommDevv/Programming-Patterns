
package Factory;

import java.util.Scanner;
import facturas.Factura;

public abstract class FacturaFactory {
    
    private Scanner sc = new Scanner(System.in);
    private String nombre;
    private String documento;
    private String direccion;
    private int cantBombillas;
    
    public void generarFactura(){
        System.out.print("Ingrese su nombre: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese la diireccion: ");
        direccion = sc.nextLine();
        System.out.print("Ingrese su documento: ");
        documento= sc.nextLine();
        System.out.print("Ingrese la cantidad de producto que quiere comprar." + "\n" + "Valor Unitario: 350" + "\n" + "Cantidad: ");
        cantBombillas = sc.nextInt();
        Factura factura1 = crearfactura();
        factura1.imprimir(nombre, documento, direccion, cantBombillas);
    }
    
    public abstract Factura crearfactura();
    
}
