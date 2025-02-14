package com.anahuac.software.comportamiento.observer;

//Clase principal para probar el sistema
public class TiendaOnline {
 public static void main(String[] args) {
     // Crear un producto con un precio inicial
     Producto laptop = new Producto("Laptop Gaming", 1500.00);

     // Crear usuarios que desean recibir alertas
     Usuario usuario1 = new Usuario("Carlos", 1200.00, true, "navegador");
     Usuario usuario2 = new Usuario("Ana", 1300.00, true, "correo");
     Usuario usuario3 = new Usuario("Luis", 1100.00, false, "whatsapp"); // Tiene alertas apagadas

     // Suscribir los usuarios al producto
     laptop.agregarObservador(usuario1);
     laptop.agregarObservador(usuario2);
     laptop.agregarObservador(usuario3);

     // Simulación de cambio de precios
     System.out.println("\nBajando precios...");
     laptop.setPrecio(1400.00);
     laptop.setPrecio(1250.00);
     laptop.setPrecio(1100.00);
 }
}