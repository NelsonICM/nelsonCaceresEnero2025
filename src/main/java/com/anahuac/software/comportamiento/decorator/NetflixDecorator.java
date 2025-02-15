package com.anahuac.software.comportamiento.decorator;

// Decorador para agregar Netflix
public class NetflixDecorator extends ServiceDecorator {
    public NetflixDecorator(Service decoratedService) {
        super(decoratedService);
    }

    @Override
    public double getCost() {
        return super.getCost() + 50;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Netflix";
    }
}
