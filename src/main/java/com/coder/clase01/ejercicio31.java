package com.coder.clase01;

public class ejercicio31 {

    public static void main(String[] args) {
        Clase1 obj1 = new Clase1();
        obj1.metodo1();
        Clase2 obj2 = new Clase2();
        obj2.metodo2();
    }

}
 

class Clase1 {
    public void metodo1() {
        System.out.println("Método de Clase1");
    }
}

class Clase2 {
    public void metodo2() {
        System.out.println("Método de Clase2");
    }
}