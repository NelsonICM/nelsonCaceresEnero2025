package com.anahuac.software.comportamiento.observer;

//Observador concreto para recibir alertas
class Usuario implements Observer {
 private String nombre;
 private double precioDeseado;
 private boolean recibirAlertas;
 private String metodoNotificacion;

 public Usuario(String nombre, double precioDeseado, boolean recibirAlertas, String metodoNotificacion) {
     this.nombre = nombre;
     this.precioDeseado = precioDeseado;
     this.recibirAlertas = recibirAlertas;
     this.metodoNotificacion = metodoNotificacion;
 }

 @Override
 public void update(String producto, double nuevoPrecio) {
     if (recibirAlertas && nuevoPrecio <= precioDeseado) {
         enviarNotificacion(producto, nuevoPrecio);
     }
 }

 private void enviarNotificacion(String producto, double precio) {
     switch (metodoNotificacion.toLowerCase()) {
         case "navegador":
             System.out.println("[NOTIFICACIÓN EN NAVEGADOR] " + nombre + ", el producto " + producto + " ha bajado a $" + precio);
             break;
         case "correo":
             System.out.println("[EMAIL] " + nombre + ", el producto " + producto + " esta disponible por $" + precio);
             break;
         case "whatsapp":
             System.out.println("[WHATSAPP] " + nombre + ", el producto " + producto + " ahora cuesta $" + precio);
             break;
         default:
             System.out.println("[ALERTA] " + nombre + ", el producto " + producto + " ha alcanzado $" + precio);
     }
 }
}
