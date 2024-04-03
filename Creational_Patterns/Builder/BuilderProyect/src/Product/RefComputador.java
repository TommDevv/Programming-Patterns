package Product;

import Components.*;

public class RefComputador {
	
	private final TipoPc tipo;
	private final String modelo;
	private final  String marca;
	private final Grafica grafica;
	private final Procesador procesador;
	
	public RefComputador(TipoPc tipo, String modelo, String marca, Grafica grafica, Procesador procesador) {
		this.tipo = tipo;
		this.modelo = modelo;
		this.marca = marca;
		this.grafica = grafica;
		this.procesador = procesador;
	}

	public TipoPc getTipo() {
		return tipo;
	}

	public String getModelo() {
		return modelo;
	}

	public String getMarca() {
		return marca;
	}

	public Grafica getGrafica() {
		return grafica;
	}

	public Procesador getProcesador() {
		return procesador;
	}
	
	
	public String imprimirInfo() {
		
		String info = "";
		
		info = "Tipo" + this.tipo + "\n" +
				"Modelo: " + this.modelo + "\n" +
				"Marca :" + this.marca + "\n" +
				"Grafica: " + this.grafica.getModelo() + "\n" +
				"Procesador" + this.procesador.getReferencia() + "\n";
		return info;
	}
	
	
}
