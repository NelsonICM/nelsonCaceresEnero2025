package com.anahuac.software.creacional.factorymethod;

// Fabrica para crear autos segun el tipo y modelo
public class CarFactory {
    public static Car createCar(String type, String model) {
        switch (type.toLowerCase()) {
            case "sedan":
                return new SedanCar(model);
            case "electric":
                return new ElectricCar(model);
            case "pickup":
                return new PickupCar(model);
            default:
                throw new IllegalArgumentException("Tipo de auto no valido: " + type);
        }
    }
}
