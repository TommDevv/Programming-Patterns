
package Factory;

import facturas.FacturaDigital;

import facturas.Factura;
public class DigitalFactory extends FacturaFactory {

    @Override
    public Factura crearfactura() {
        return new FacturaDigital();
    }
    
}
