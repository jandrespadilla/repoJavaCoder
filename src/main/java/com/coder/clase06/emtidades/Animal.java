package com.coder.clase06.emtidades;

import com.coder.clase05.Persona;

public class Animal {
		private String nombre;
		private String raza;
		private String alimentacion;
		private int edad;
		private boolean mamifero;
		private Persona dueno;
		
		public void caminar() {
			System.out.println(nombre + " esta Caminando!");
		}

		public void comer() {
			System.out.println(nombre + " esta Comiendo!");
		}
		
		public void conocerDueno() {
			System.out.println(this.getDueno().getNombre() + " esta Comiendo!");
		}		
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getRaza() {
			return raza;
		}
		public void setRaza(String raza) {
			this.raza = raza;
		}
		public String getAlimentacion() {
			return alimentacion;
		}
		public void setAlimentacion(String alimentacion) {
			this.alimentacion = alimentacion;
		}
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
		public boolean isMamifero() {
			return mamifero;
		}
		public void setMamifero(boolean mamifero) {
			this.mamifero = mamifero;
		}
		public Persona getDueno() {
			return dueno;
		}
		public void setDueno(Persona dueno) {
			this.dueno = dueno;
		}
		
		@Override
		public String toString() {
			return "Animal [nombre=" + nombre + ", raza=" + raza + ", alimentacion=" + alimentacion + ", edad=" + edad
					+ ", mamifero=" + mamifero + ", dueno=" + dueno + "]";
		}
		
}
