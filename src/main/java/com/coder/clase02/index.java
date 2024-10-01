package com.coder.clase02;

public class index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numerodeldia = 1;
		String dia;
		
		switch (numerodeldia) {
		case 1:
			dia="Lunes";
			break;
		case 2:
			dia="Martes";
			break;

		case 3:
			dia="Miercoles";
			break;
		case 4:
			dia="Jueves";
			break;

		case 5:
			dia="Viernes";
			break;
		case 6:
			dia="Sabado";
			break;			
		case 7:
			dia="Domingo";
			break;		
		default:
			dia="No es un dia Valido";
			break;
		}
		System.out.println("El numero ingresado es del dia :"+dia);
	}

}
