package com.anahuac.software.comportamiento.decorator;

// Decorador para agregar Disney+
public class DisneyDecorator extends ServiceDecorator {
    public DisneyDecorator(Service decoratedService) {
        super(decoratedService);
    }

    @Override
    public double getCost() {
        return super.getCost() + 100;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Disney+";
    }
}
