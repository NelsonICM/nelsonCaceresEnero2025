package com.anahuac.software.comportamiento.decorator;

// Decorador para agregar HBO
public class HBODecorator extends ServiceDecorator {
    public HBODecorator(Service decoratedService) {
        super(decoratedService);
    }

    @Override
    public double getCost() {
        return super.getCost() + 100;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", HBO";
    }
}
