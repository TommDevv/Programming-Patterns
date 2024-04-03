package Factory;

import facturas.FacturaFisica;

import facturas.Factura;
public class FisicaFactory extends FacturaFactory {

    @Override
    public Factura crearfactura() {
        return new FacturaFisica();
    }
    
}