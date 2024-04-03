package Producto;

public abstract class Televisor {
	private boolean status;
	private int id;
	private String tipo;
	private String marca;
	private int pulgadas;
	
	public Televisor(String tipo, String marca, int pulgadas, int id) {
		this.tipo = tipo;
		this.marca = marca;
		this.pulgadas = pulgadas;
		this.id = id;
	}
	
	public Televisor(Televisor target) {
		if(target != null) {
			this.tipo = target.tipo;
			this.marca = target.marca;
			this.pulgadas = target.pulgadas;
		}
	}
	
	
	public boolean isStatus() {
		return status;
	}



	public String getTipo() {
		return tipo;
	}



	public String getMarca() {
		return marca;
	}



	public int getPulgadas() {
		return pulgadas;
	}



	public void setStatus(boolean status) {
		this.status = status;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void encender() {
		this.setStatus(true);
		System.out.println("El TV esta encendido");
	}
	
	public abstract Televisor clone();
	
	public void mostrarInfo() {
		System.out.println("---------------------------------------------------");
		System.out.println("Informacion del producto:");
		System.out.println("Referencia:" + id);
		System.out.println("Marca:" + marca);
		System.out.println("Pulgadas:" + pulgadas);
		System.out.println("Tipo:" + tipo);
	}
}
