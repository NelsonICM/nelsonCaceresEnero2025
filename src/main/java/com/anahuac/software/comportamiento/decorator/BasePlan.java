package com.anahuac.software.comportamiento.decorator;

// Paquete base de telefonia
public class BasePlan implements Service {
    @Override
    public double getCost() {
        return 200.0; // Mensualidad base
    }

    @Override
    public String getDescription() {
        return "Renta de telefono";
    }
}
