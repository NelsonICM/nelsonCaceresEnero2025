package com.anahuac.software.creacional.factorymethod;

// Interfaz comun para todas las lineas de autos
public interface Car {
    void addBody();
    void addDoors();
    void paint();
    void assemble(); // Metodo que sigue el flujo de ensamblaje
}
