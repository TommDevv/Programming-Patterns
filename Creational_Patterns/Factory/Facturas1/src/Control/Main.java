package Control;

import Factory.*;
import java.util.Scanner;

public class Main {

    private static FacturaFactory facturadora;

    public static void main(String[] args) {
        configInicial();
        iniciarFacturacion();
    }

    public static void configInicial() {
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("----Bienvenido al sistema de facturacion----"
                + "\n" + "Por favor seleccione una opcion:"
                + "\n" + "1) Factura Fisica"
                + "\n" + "2) Factura Digital");
        while (opcion != 1 && opcion != 2) {
            System.out.print("Num. de opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    facturadora = new FisicaFactory();
                    break;
                case 2:
                    facturadora = new DigitalFactory();
                    break;
                default:
                    System.out.println("Opción Incorrecta");
                    break;
            }
        }
    }

    public static void iniciarFacturacion() {
        facturadora.generarFactura();
    }
}
