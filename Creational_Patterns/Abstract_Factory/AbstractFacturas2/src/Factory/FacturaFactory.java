
package Factory;

import Facturas.FacturaEn;
import Facturas.FacturaSp;

public interface FacturaFactory {
    void generarFacturaEn();
    void generarFacturaSp();
    FacturaEn crearFacturaEn();
    FacturaSp crearFacturaSp();
}