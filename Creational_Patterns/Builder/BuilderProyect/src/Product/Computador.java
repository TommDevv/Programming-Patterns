package Product;

import Components.*;

public class Computador {
	
	private boolean status;
	private int carga;
	private final TipoPc tipo;
	private final String modelo;
	private final  String marca;
	private final Grafica grafica;
	private final Procesador procesador;
	
	public Computador(TipoPc tipo, String modelo, String marca, Grafica grafica, Procesador procesador) {
		this.tipo = tipo;
		this.modelo = modelo;
		this.marca = marca;
		this.grafica = grafica;
		this.procesador = procesador;
	}
	
	public void apagar() {
		status = false;
		System.out.println("el pc está apagado");
	}
	
	public void encender() {
		status = true;
		System.out.println("el pc ha comenzado a funcionar");
	}
	
	public void cargar() {
		carga = 100;
		System.out.println("Carga al maximo");
	}
	
	public boolean isStatus() {
		return status;
	}

	public int getCarga() {
		return carga;
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
		
}
