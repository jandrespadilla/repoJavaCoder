package com.coder.clase01;

public class Calculadora {
	 public static int cuadrado(int numero) {
	        return numero * numero;
	    }
	public static void main(String[] args) {
        int resultado = cuadrado(5);
        System.out.println("El cuadrado es: " + resultado);
	}

}
