package com.anahuac.software.comportamiento.decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        // Plan básico
        Service myPlan = new BasePlan();
        System.out.println("Paquete inicial: " + myPlan.getDescription() + " | Costo: $" + myPlan.getCost());

        // Agregar Internet
        myPlan = new InternetDecorator(myPlan);
        System.out.println("Paquete actualizado: " + myPlan.getDescription() + " | Costo: $" + myPlan.getCost());

        // Agregar Netflix
        myPlan = new NetflixDecorator(myPlan);
        System.out.println("Paquete actualizado: " + myPlan.getDescription() + " | Costo: $" + myPlan.getCost());

        // Agregar Prime
        myPlan = new PrimeDecorator(myPlan);
        System.out.println("Paquete actualizado: " + myPlan.getDescription() + " | Costo: $" + myPlan.getCost());

        // Agregar Disney+ y HBO
        myPlan = new DisneyDecorator(myPlan);
        myPlan = new HBODecorator(myPlan);
        System.out.println("Paquete final: " + myPlan.getDescription() + " | Costo: $" + myPlan.getCost());
    }
}
