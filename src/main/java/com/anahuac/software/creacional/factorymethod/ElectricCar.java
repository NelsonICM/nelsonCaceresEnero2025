package com.anahuac.software.creacional.factorymethod;

// Implementacion de autos electricos
public class ElectricCar implements Car {
    private String model;

    public ElectricCar(String model) {
        this.model = model;
    }

    @Override
    public void addBody() {
        System.out.println("Anadiendo carroceria aerodinamica para el Electrico " + model);
    }

    @Override
    public void addDoors() {
        System.out.println("Anadiendo puertas automaticas al Electrico " + model);
    }

    @Override
    public void paint() {
        System.out.println("Pintando el Electrico " + model);
    }

    @Override
    public void assemble() {
        addBody();
        addDoors();
        paint();
        System.out.println("Electrico " + model + " ensamblado.\n");
    }
}
