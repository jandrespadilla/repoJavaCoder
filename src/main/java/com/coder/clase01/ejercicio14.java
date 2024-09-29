package com.coder.clase01;

public class ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 5;
		try {
		    int division = a / b;
		    System.out.println("La división es: " + division);
		} catch (ArithmeticException e) {
		    System.out.println("Error: División por cero.");
		}
	}

}
