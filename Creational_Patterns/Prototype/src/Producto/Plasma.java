package Producto;

public class Plasma extends Televisor{

	public Plasma(Televisor target) {
		super(target);
	}

	public Plasma(String tipo, String marca, int pulgadas, int id) {
		super(tipo, marca, pulgadas, id);
	}

	@Override
	public Televisor clone() {
		return new Plasma(this);
	}
	
}
