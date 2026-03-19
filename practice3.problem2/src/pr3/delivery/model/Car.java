package pr3.delivery.model;

public class Car extends Vehicle {
    private int numberOfSeats;

    public Car(String model, double baseCost, Engine engine, int numberOfSeats) {
        super(model, baseCost, engine);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public double calculateDeliveryCost() {
        return baseCost + 200;
    }

  
    public double calculateDeliveryCost(double extraWeight) {
        return calculateDeliveryCost() + extraWeight * 10;
    }
}