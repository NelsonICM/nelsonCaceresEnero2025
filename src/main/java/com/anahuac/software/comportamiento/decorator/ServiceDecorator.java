package com.anahuac.software.comportamiento.decorator;

// Clase base para los decoradores
public abstract class ServiceDecorator implements Service {
    protected Service decoratedService;

    public ServiceDecorator(Service decoratedService) {
        this.decoratedService = decoratedService;
    }

    @Override
    public double getCost() {
        return decoratedService.getCost();
    }

    @Override
    public String getDescription() {
        return decoratedService.getDescription();
    }
}
