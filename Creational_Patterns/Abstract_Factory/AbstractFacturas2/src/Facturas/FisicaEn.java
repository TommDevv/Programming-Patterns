package Facturas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FisicaEn implements FacturaEn {

    String path = "bill.txt";
    File factura = new File(path);

    @Override
    public void imprimirIngles(String nombre, String documento, String direccion, int cantBombillas) {
        System.out.println("Bill saved as a .txt file in root proyect to print");
        String texto = "Name: " + nombre + "\n" + "Document: " + documento + "\n" + "Direction: " + direccion + "\n" + "Amount"
                + ": " + cantBombillas + "\n" + "Valor total: " + String.valueOf(cantBombillas * 350);

        try {
            factura.createNewFile();
            FileWriter fw = new FileWriter(factura);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(texto);
            bw.close();
        } catch (Exception e) {
            System.out.println("Error saving file");
        }
    }
}
