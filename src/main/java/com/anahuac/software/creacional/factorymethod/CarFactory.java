package com.anahuac.software.creacional.factorymethod;

// Fábrica para crear autos según el tipo y modelo
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
                throw new IllegalArgumentException("Tipo de auto no válido: " + type);
        }
    }
}
