package com.coder.clase01;

public class ContarVocales {
	   public static int contarVocales(String texto) {
	        int contador = 0;
	        texto = texto.toLowerCase();
	        for (char c : texto.toCharArray()) {
	            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
	                contador++;
	            }
	        }
	        return contador;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      String texto = "Hola Mundo";
	        int vocales = contarVocales(texto);
	        System.out.println("Cantidad de vocales: " + vocales);
	}

}
