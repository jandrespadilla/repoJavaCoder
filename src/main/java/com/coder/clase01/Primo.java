package com.coder.clase01;

public class Primo {
	  public static boolean esPrimo(int numero) {
	        if (numero <= 1) return false;
	        for (int i = 2; i <= Math.sqrt(numero); i++) {
	            if (numero % i == 0) return false;
	        }
	        return true;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int numero = 7;
	        System.out.println("¿Es primo? " + esPrimo(numero));
	}

}
