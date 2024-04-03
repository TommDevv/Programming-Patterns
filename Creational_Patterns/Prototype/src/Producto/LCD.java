package Producto;

public class LCD extends Televisor {

	public LCD(String tipo, String marca, int pulgadas, int id) {
		super(tipo, marca, pulgadas, id);
	}
	
	

	public LCD(Televisor target) {
		super(target);
	}


	@Override
	public Televisor clone() {
		return new LCD(this);
	}

	
}
