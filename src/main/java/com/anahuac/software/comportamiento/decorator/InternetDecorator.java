package com.anahuac.software.comportamiento.decorator;

// Decorador para agregar Internet
public class InternetDecorator extends ServiceDecorator {
    public InternetDecorator(Service decoratedService) {
        super(decoratedService);
    }

    @Override
    public double getCost() {
        return super.getCost() + 250;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Internet";
    }
}
