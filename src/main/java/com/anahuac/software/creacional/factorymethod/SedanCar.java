package com.anahuac.software.creacional.factorymethod;

// Implementación de autos tipo Sedán
public class SedanCar implements Car {
    private String model;

    public SedanCar(String model) {
        this.model = model;
    }

    @Override
    public void addBody() {
        System.out.println("Añadiendo carrocería de Sedán " + model);
    }

    @Override
    public void addDoors() {
        System.out.println("Añadiendo puertas al Sedán " + model);
    }

    @Override
    public void paint() {
        System.out.println("Pintando el Sedán " + model);
    }

    @Override
    public void assemble() {
        addBody();
        addDoors();
        paint();
        System.out.println("Sedán " + model + " ensamblado.\n");
    }
}
