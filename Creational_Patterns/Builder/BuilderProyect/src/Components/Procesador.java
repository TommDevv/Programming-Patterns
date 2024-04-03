package Components;

public class Procesador {
	private String referencia;
	private double ghz;
	
	public Procesador(String referencia, double ghz) {
		this.referencia = referencia;
		this.ghz = ghz;
	}

	public String getReferencia() {
		return referencia;
	}

	public double getGhz() {
		return ghz;
	}

	
	
}
