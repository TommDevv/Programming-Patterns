package Factory;

import Facturas.FacturaEn;
import Facturas.FacturaSp;
import java.util.Scanner;
import Facturas.FisicaSp;
import Facturas.FisicaEn;

public class FisicaFactory implements FacturaFactory {

    private Scanner sc = new Scanner(System.in);
    private String nombre;
    private String documento;
    private String direccion;
    private int cantBombillas;

    @Override
    public void generarFacturaSp() {
        System.out.print("Ingrese su nombre: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese la diireccion: ");
        direccion = sc.nextLine();
        System.out.print("Ingrese su documento: ");
        documento = sc.nextLine();
        System.out.print("Ingrese la cantidad de producto que quiere comprar." + "\n" + "Valor Unitario: 350" + "\n" + "Cantidad: ");
        cantBombillas = sc.nextInt();
        FisicaSp factura1 = crearFacturaSp();
        factura1.imprimirEspañol(nombre, documento, direccion, cantBombillas);
    }

    @Override
    public void generarFacturaEn() {
        System.out.print("Enter your name: ");
        nombre = sc.nextLine();
        System.out.print("Enter your Direction: ");
        direccion = sc.nextLine();
        System.out.print("Enter your ID: ");
        documento = sc.nextLine();
        System.out.print("Enter the amount of product you want to buy." + "\n" + "Unit Value: 350" + "\n" + "Amount: ");
        cantBombillas = sc.nextInt();
        FisicaEn factura1 = crearFacturaEn();
        factura1.imprimirIngles(nombre, documento, direccion, cantBombillas);
    }
    
    @Override
    public FisicaEn crearFacturaEn(){
        return new FisicaEn();
    };
    @Override
    public FisicaSp crearFacturaSp(){
        return new FisicaSp();
    }
}
