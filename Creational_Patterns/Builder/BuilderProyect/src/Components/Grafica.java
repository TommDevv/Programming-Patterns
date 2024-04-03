package Components;

public class Grafica {
	private String modelo;
	private int VRAM;
	
	public Grafica(String modelo, int VRAM) {
		this.modelo = modelo;
		this.VRAM = VRAM;
	}

	public String getModelo() {
		return modelo;
	}

	public int getVRAM() {
		return VRAM;
	}

	
}
