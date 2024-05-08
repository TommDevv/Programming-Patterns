package practica_bridge;

import abstraccion.RemoteControl;
import abstraccion.RemoteSimple;
import abstraccion.RemoteSmart;
import implementador.ITelevision;
import implementador.SamsungSmartTelevision;
import implementador.SonyTelevision;
import implementador.XiaomiTelevision;

public class Practica_Bridge {

    public static void main(String[] args) {
        ITelevision sonyTelevision = new SonyTelevision();
        RemoteControl simpleRemoteControl = new RemoteSimple(sonyTelevision);

        ITelevision xiaomiTelevision = new XiaomiTelevision();
        simpleRemoteControl = new RemoteSimple(xiaomiTelevision);

        ITelevision samsungSmartTelevision = new SamsungSmartTelevision();
        RemoteControl smartRemoteControl = new RemoteSmart(samsungSmartTelevision);
    }
}
