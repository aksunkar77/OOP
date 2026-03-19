package pr3.delivery.model;

public abstract class Vehicle {
    protected String model;
    protected double baseCost;
    protected Engine engine;

    public Vehicle(String model, double baseCost, Engine engine) {
        this.model = model;
        this.baseCost = baseCost;
        this.engine = engine;
    }

 
    public double calculateDeliveryCost() {
        return baseCost + 100;
    }

    public String getVehicleInfo() {
        return "Model: " + model +
                ", Base Cost: " + baseCost +
                ", " + engine.getEngineInfo();
    }
}