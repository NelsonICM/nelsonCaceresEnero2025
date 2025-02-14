package com.anahuac.software.creacional.factorymethod;

// Clase principal para probar la fábrica de autos
public class FactoryTest {
    public static void main(String[] args) {
        System.out.println("\nEnsamblando autos en la fábrica...");

        // Creando autos de diferentes líneas y modelos
        Car sedanBasic = CarFactory.createCar("sedan", "Básico");
        Car electricHigh = CarFactory.createCar("electric", "Alto");
        Car pickupMedium = CarFactory.createCar("pickup", "Medio");

        // Ensamblando los autos
        sedanBasic.assemble();
        electricHigh.assemble();
        pickupMedium.assemble();
    }
}
