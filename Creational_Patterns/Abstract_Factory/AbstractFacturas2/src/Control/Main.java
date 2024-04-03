package Control;

import Factory.*;
import java.util.Scanner;

public class Main {

    private static FacturaFactory facturadora;
    private static int idioma;
    private static Scanner s1 = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Seleccione su dioma/Select your language");
        System.out.print("1) English" + "\n" + "2) Español" + "\n" + "Opcion/Option: ");
        while (idioma != 1 && idioma != 2) {
            idioma = s1.nextInt();
            switch (idioma) {
                case 1:
                    configInicialEn();
                    iniciarFacturacionEn();
                    break;
                case 2:
                    configInicialSp();
                    iniciarFacturacionSp();
                    break;
                default:
                    System.out.println("Opcion incorrecta/Incorrect Option");
            }
        }
    }

    public static void configInicialSp() {
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

    public static void configInicialEn() {
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("----Welcome to the facturation system----"
                + "\n" + "Please select an option:"
                + "\n" + "1) Pysical Bill"
                + "\n" + "2) Digital Bill");
        while (opcion != 1 && opcion != 2) {
            System.out.print("Option: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    facturadora = new FisicaFactory();
                    break;
                case 2:
                    facturadora = new DigitalFactory();
                    break;
                default:
                    System.out.println("Incorrect Option");
                    break;
            }
        }
    }

    public static void iniciarFacturacionEn() {
        facturadora.generarFacturaEn();
    }

    public static void iniciarFacturacionSp() {
        facturadora.generarFacturaSp();
    }
}
