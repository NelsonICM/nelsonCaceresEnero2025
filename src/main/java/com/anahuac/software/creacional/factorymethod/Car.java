package com.anahuac.software.creacional.factorymethod;

// Interfaz común para todas las líneas de autos
public interface Car {
    void addBody();
    void addDoors();
    void paint();
    void assemble(); // Método que sigue el flujo de ensamblaje
}
