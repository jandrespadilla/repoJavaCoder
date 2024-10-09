package com.coder.clase04;

import java.util.Iterator;

public class Clase01 {

	public static void main(String[] args) {
		 
		String[] nombres = new String[] {
				"pipo","lolo","tito"
				
		};
		imprimeListaDeNombres(nombres);
	}
	
	
	private static void imprimeListaDeNombres(String[] nombreDePersona) {
		for (String nombre: nombreDePersona) {
			System.out.println("nombre: "+nombre);
		}
	}
}
