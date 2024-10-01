package com.coder.clase02;

public class index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ingreseSuNumero = 0;
		if (ingreseSuNumero>0) {
			System.out.println("el numero ingresado es positivo");
			
		}else if (ingreseSuNumero<0) {
			System.out.println("el numero ingresado es negativo");
		}else if (ingreseSuNumero==0){
			System.out.println("el numero ingresado es igual a 0");
		}else {
			System.out.println("el numero ingresado no es un numero");
		}
	}

}
