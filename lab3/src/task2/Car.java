package task2;

public class Car implements Drivable {
    @Override
    public void move() {
        System.out.println("going by car");
    }

    @Override
    public void steer(String direction) {
        System.out.println("car " + direction + " turn left side");
    }

    @Override
    public void stop() {
        System.out.println("car stopped.");
    }
}
