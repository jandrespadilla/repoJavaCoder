package com.coder.clase06;
import com.coder.Herencia.Perro;
import com.coder.Herencia.Gato;
import com.coder.banco.Cuenta;
import com.coder.banco.CajaAhorro;
import com.coder.banco.CuentaCorriente;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	Perro unPerro = new Perro();
			Gato unGato = new Gato();
			
			unPerro.setNombre("Firulai");
			unPerro.setRaza("Caniche");
			unPerro.setAlimentacion("Alimento balanceado");
			unPerro.setEdad(4);
			unPerro.setMamifero(true);
			
			System.out.println(unPerro);
			unPerro.caminar();
			unPerro.comer();
			unPerro.ladrar();
			
			
			unGato.setNombre("Michi");
			unGato.setRaza("gato");
			unGato.setAlimentacion("Alimento balanceado");
			unGato.setEdad(3);
			unGato.setMamifero(true);
			
			System.out.println(unGato);
			unGato.caminar();
			unGato.comer();
			unGato.mauya();		*/	
		Persona unaPersona = new Persona();
		unaPersona.setNombre("Andres");
		unaPersona.setEdad(44);
		unaPersona.setDni(28132570);
		
		
		Cuenta cuentaCorriente = new CuentaCorriente();
		cuentaCorriente.setTitular(unaPersona);
		cuentaCorriente.setSaldo(0.00);
		cuentaCorriente.setNumero(1);
		System.out.println(cuentaCorriente.toString());
		 
	}

}
