package org.example;

public class Car implements Drivable {
    private String brand;
    private String model;

    // Constructeur
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Getters et setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Implémentation de l'interface Drivable
    @Override
    public void start() {
        System.out.println("The car is starting.");
    }

    @Override
    public void stop() {
        System.out.println("The car is stopping.");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("The car is accelerating to " + speed + " km/h.");
    }

    // Méthode toString
    @Override
    public String toString() {
        return "Car{brand='" + brand + "', model='" + model + "'}";
    }
}
