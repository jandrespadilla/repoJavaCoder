package com.coder.clase01;

public class GestionNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     int[] notas = {85, 90, 78, 92, 88};
	        int suma = 0;
	        for (int nota : notas) {
	            suma += nota;
	        }
	        double promedio = suma / (double) notas.length;
	        System.out.println("El promedio es: " + promedio);
	}

}
