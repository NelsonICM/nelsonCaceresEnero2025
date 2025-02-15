package com.anahuac.software.creacional.factorymethod;

// Implementacion de autos tipo Sedan
public class SedanCar implements Car {
    private String model;

    public SedanCar(String model) {
        this.model = model;
    }

    @Override
    public void addBody() {
        System.out.println("Anadiendo carroceria de Sedan " + model);
    }

    @Override
    public void addDoors() {
        System.out.println("Anadiendo puertas al Sedan " + model);
    }

    @Override
    public void paint() {
        System.out.println("Pintando el Sedan " + model);
    }

    @Override
    public void assemble() {
        addBody();
        addDoors();
        paint();
        System.out.println("Sedan " + model + " ensamblado.\n");
    }
}
