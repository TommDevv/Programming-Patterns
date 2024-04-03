package Builders;

import Components.*;
import Product.RefComputador;

public class ManualBuilder implements Builder{
	
	private TipoPc tipo;
	private String modelo;
	private String marca;
	private Grafica grafica;
	private Procesador procesador;
	
	@Override
	public void setTipo(TipoPc tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	@Override
	public void setGrafica(Grafica grafica) {
		this.grafica = grafica;
	}
	
	@Override
	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}
	
	public RefComputador getResult(){
		return new RefComputador(this.tipo, this.modelo, this.marca, this.grafica, this.procesador);		
	}
	
}