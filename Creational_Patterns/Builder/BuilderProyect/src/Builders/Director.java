package Builders;

import Components.*;

public class Director {
	public void construirPcEscritorio(Builder builder) {
		builder.setTipo(TipoPc.ESCRITORIO);
		builder.setModelo("22-dd2006la");
		builder.setMarca("HP");
		builder.setGrafica(new Grafica("NVIDIA_3040", 16));
		builder.setProcesador(new Procesador("intel_i7",2400));
	}
	
	public void construirPortatil(Builder builder) {
		builder.setTipo(TipoPc.PORTATIL);
		builder.setModelo("VeevoBook-1623");
		builder.setMarca("ASUS");
		builder.setGrafica(new Grafica("NVIDIA_MX110", 2));
		builder.setProcesador(new Procesador("intel_i5",1600));
	}
	
	public void construirPcEmpresa(Builder builder) {
		builder.setTipo(TipoPc.EMPRESA);
		builder.setModelo("THNKZ24");
		builder.setMarca("Thinkpad");
		builder.setGrafica(new Grafica("AMD_r5", 8));
		builder.setProcesador(new Procesador("intel_i3",1700));
	}
}
