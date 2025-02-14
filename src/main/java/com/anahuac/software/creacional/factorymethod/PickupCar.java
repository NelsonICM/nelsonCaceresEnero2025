package com.anahuac.software.creacional.factorymethod;

// Implementación de autos tipo Pickup
public class PickupCar implements Car {
    private String model;

    public PickupCar(String model) {
        this.model = model;
    }

    @Override
    public void addBody() {
        System.out.println("Añadiendo carrocería reforzada para la Pickup " + model);
    }

    @Override
    public void addDoors() {
        System.out.println("Añadiendo puertas resistentes a la Pickup " + model);
    }

    @Override
    public void paint() {
        System.out.println("Pintando la Pickup " + model);
    }

    @Override
    public void assemble() {
        addBody();
        addDoors();
        paint();
        System.out.println("Pickup " + model + " ensamblada.\n");
    }
}
