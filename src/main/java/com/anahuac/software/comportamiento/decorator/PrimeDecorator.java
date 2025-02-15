package com.anahuac.software.comportamiento.decorator;

// Decorador para agregar Prime Video
public class PrimeDecorator extends ServiceDecorator {
    public PrimeDecorator(Service decoratedService) {
        super(decoratedService);
    }

    @Override
    public double getCost() {
        return super.getCost() + 50;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Prime Video";
    }
}
