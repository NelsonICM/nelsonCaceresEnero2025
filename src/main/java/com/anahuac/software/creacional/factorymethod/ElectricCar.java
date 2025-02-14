package com.anahuac.software.creacional.factorymethod;

// Implementación de autos eléctricos
public class ElectricCar implements Car {
    private String model;

    public ElectricCar(String model) {
        this.model = model;
    }

    @Override
    public void addBody() {
        System.out.println("Añadiendo carrocería aerodinámica para el Eléctrico " + model);
    }

    @Override
    public void addDoors() {
        System.out.println("Añadiendo puertas automáticas al Eléctrico " + model);
    }

    @Override
    public void paint() {
        System.out.println("Pintando el Eléctrico " + model);
    }

    @Override
    public void assemble() {
        addBody();
        addDoors();
        paint();
        System.out.println("Eléctrico " + model + " ensamblado.\n");
    }
}
