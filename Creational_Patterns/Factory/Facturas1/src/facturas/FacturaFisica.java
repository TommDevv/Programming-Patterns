
package facturas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JFileChooser;



public class FacturaFisica implements Factura {
        
    String path = "factura.txt";
    File factura = new File(path);
        
    @Override
    public void imprimir(String nombre, String documento, String direccion, int cantBombillas) {
        System.out.println("factura guardada en el directorio local de la aplicacion para su impresion");
        String texto = "Nombre: " + nombre +"\n" + "Documento: " + documento + "\n" + "Direccion: " + direccion + "\n" + "Cantidad: " + cantBombillas + "\n" +"Valor total: " + String.valueOf(cantBombillas*350);
        
        try{
            factura.createNewFile();
            FileWriter fw = new FileWriter(factura);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(texto);
            bw.close();
        }catch(Exception e){System.out.println("Error al guardar");}
    }
}
