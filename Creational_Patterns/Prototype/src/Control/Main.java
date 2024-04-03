package Control;

import java.util.ArrayList;
import Producto.*;
import java.util.Scanner;

public class Main {

	static Plasma televisorplasma = new Plasma("plasma", "LG", 16, 0);
	static LCD televisorLCD = new LCD("LCD","Sony", 24, 0);
	static ArrayList<Televisor> copias = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cantidadplasma;
		int cantidadLCD;
		
		System.out.println("Bienvenido, a continuacion se mostrara la referencia de nuestros productos");
		televisorplasma.mostrarInfo();
		televisorLCD.mostrarInfo();
		System.out.print("Indique la cantidad de televisores Plasma que desea solicitar: ");
		cantidadplasma = sc.nextInt();
		System.out.print("Indique la cantidad de televisores LCD que desea solicitar: ");
		cantidadLCD = sc.nextInt();
		
		añadirPlasma(cantidadplasma);
		añadirLCD(cantidadLCD);
		
		System.out.println("Lista de productos:");
		for(Televisor copia : copias) {
			copia.mostrarInfo();
		}
		
	}
	
	public static void añadirPlasma(int cantidad) {
		for (int i = 1; i <= cantidad; i++) {
			Televisor televisorpr = televisorplasma.clone();
			televisorpr.setId(i);
			copias.add(televisorpr);
			
		}
	}
	
	public static void añadirLCD(int cantidad) {
		for (int i = 1; i <= cantidad; i++) {
			Televisor televisorpr = televisorLCD.clone();
			televisorpr.setId(i);
			copias.add(televisorpr);
			
		}
	}

}
