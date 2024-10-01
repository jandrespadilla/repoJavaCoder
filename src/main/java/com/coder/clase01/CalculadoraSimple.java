package com.coder.clase01;

public class CalculadoraSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   
	        int a = 10, b = 5;
	        System.out.println("Suma: " + (a + b));
	        System.out.println("Resta: " + (a - b));
	        System.out.println("Multiplicación: " + (a * b));
	        try {
	            System.out.println("División: " + (a / b));
	        } catch (ArithmeticException e) {
	            System.out.println("Error: División por cero.");
	        }
	    
	}

}
