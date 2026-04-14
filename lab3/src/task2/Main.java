package task2;

public class Main {
	public static void main(String[] args) {
       
        Car myCar = new Car();
        System.out.println("--- Testing Car ---");
        myCar.move();
        myCar.steer("Left");

        System.out.println();

        Robot myRobot = new Robot();
        System.out.println("--- Testing Robot ---");
        myRobot.move();
    }
}
