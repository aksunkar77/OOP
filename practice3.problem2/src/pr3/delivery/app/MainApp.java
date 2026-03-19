package pr3.delivery.app;

import pr3.delivery.model.*;
import pr3.delivery.service.DeliveryService;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        Engine e1 = new Engine("Petrol", 150);
        Engine e2 = new Engine("Diesel", 400);

        Car car = new Car("Toyota Camry", 1000, e1, 5);

        Truck truck = new Truck("Volvo Truck", 3000, e2, 10000);

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(truck);

        DeliveryService service = new DeliveryService();

        System.out.println("=== VEHICLE INFO ===");
        service.printAllVehicles(vehicles);

        System.out.println("\n=== DELIVERY COSTS ===");
        service.calculateAllDeliveries(vehicles);

        System.out.println("\n=== TOTAL COST ===");
        System.out.println(service.calculateTotalCost(vehicles));
    }
}