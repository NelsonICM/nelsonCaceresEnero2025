package com.anahuac.software.comportamiento.observer;

//Clase que representa un Producto que será monitoreado
import java.util.ArrayList;
import java.util.List;

//Interfaz Observer
interface Observer {
void update(String producto, double nuevoPrecio);
}

//Interfaz Subject
interface Subject {
void agregarObservador(Observer o);
void removerObservador(Observer o);
void notificarObservadores(String producto, double precio);
}

class Producto implements Subject {
    private String nombre;
    private double precio;
    private List<Observer> observadores;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.observadores = new ArrayList<>();
    }

    public void setPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
        notificarObservadores(nombre, nuevoPrecio);
    }

    public double getPrecio() {  //Método para acceder al precio actual
        return precio;
    }

    @Override
    public void agregarObservador(Observer o) {
        observadores.add(o);
    }

    @Override
    public void removerObservador(Observer o) {
        observadores.remove(o);
    }

    @Override
    public void notificarObservadores(String producto, double precio) {
        for (Observer o : observadores) {
            o.update(producto, precio);
        }
    }
}
