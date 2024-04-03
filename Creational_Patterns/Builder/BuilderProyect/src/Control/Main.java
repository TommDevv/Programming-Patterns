package Control;

import Builders.*;
import Product.*;

public class Main {

	public static void main(String[] args) {
		
		Director director = new Director();
		ComputadorBuilder pcBuilder = new ComputadorBuilder();
		ManualBuilder manualBuilder = new ManualBuilder();
		
		director.construirPortatil(pcBuilder);
		Computador pc1 = pcBuilder.getResult();
		
		director.construirPortatil(manualBuilder);
		RefComputador manual1 = manualBuilder.getResult();
		
		System.out.println("PC-1, Tipo de pc construido:" + pc1.getTipo());
		System.out.println("Referencia de pc:");
		System.out.println(manual1.imprimirInfo());
		pc1.cargar();
		pc1.encender();
		
		director.construirPcEscritorio(pcBuilder);
		Computador pc2 = pcBuilder.getResult();
		
		director.construirPcEscritorio(manualBuilder);
		RefComputador manual2 = manualBuilder.getResult();
		
		System.out.println("PC-2, Tipo de pc construido:" + pc2.getTipo());
		System.out.println("Referencia de pc:");
		System.out.println(manual2.imprimirInfo());
		
		director.construirPcEmpresa(pcBuilder);
		Computador pc3 = pcBuilder.getResult();
		
		director.construirPcEmpresa(manualBuilder);
		RefComputador manual3 = manualBuilder.getResult();
		
		System.out.println("PC-3, Tipo de pc construido:" + pc3.getTipo());
		System.out.println("Referencia de pc:");
		System.out.println(manual3.imprimirInfo());

	}

}
