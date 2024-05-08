package practica_adapter;

import profesiones.Arquitecto;
import profesiones.Ingeniero;
import profesiones.MedicoAdapter;
import profesiones.Target_Profesionales;
import java.util.Scanner;

public class Practica_Adapter {

    private static Scanner obj = new Scanner(System.in);
    private static Target_Profesionales profesionales;

    private static void usarprofesion() {
        profesionales.Leer_planos();
        profesionales.contratos();
        profesionales.supervision();
    }

    public static void main(String[] args) {
        int op;
        do {
            op = escogerOp();
            switch (op) {
                case 1:
                    profesionales = new Ingeniero();
                    usarprofesion();
                    break;
                case 2:
                    profesionales = new Arquitecto();
                    usarprofesion();
                    break;
                case 3:
                    profesionales = new MedicoAdapter();
                    usarprofesion();
                    break;
                case 5:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("La opcion no es valida");
            }

        } while (op != 4);
    }//cierra el main

    private static int escogerOp() {
        System.out.print(
                "Menu Opciones\n"
                + "---------------\n"
                + "1.  Fuciones Ingeniero.\n"
                + "2.  Funciones Arquitecto.\n"
                + "3.  Funciones del medico.\n"
                + "4.  Salir. \n"
                + "Selecciones opcion....."
        );

        return Integer.parseInt(obj.nextLine());
    }
}// cierra la clase practica_adapter
