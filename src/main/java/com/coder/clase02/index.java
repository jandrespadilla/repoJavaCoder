package com.coder.clase02;

public class index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float numeroA= 1;
		float numeroB= 0;
		String operacion = "+";
		float resultado=numeroA/numeroB;
		if (numeroA>numeroB) {
			System.out.println(numeroA + " mayor a "+ numeroB);
		}else {
			System.out.println(numeroA + " menor a "+ numeroB);
		}
		if (numeroB!=0) {
				System.out.println("Resultado "+ resultado);
			}else {
				System.out.println("No se puede dividiir por 0");
    	}
	}

}
