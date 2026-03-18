package problem3;

public class Main {

    public static void main(String[] args) {

        Temperature t1 = new Temperature();
        Temperature t2 = new Temperature(25);
        Temperature t3 = new Temperature('F');
        Temperature t4 = new Temperature(100, 'F');

        System.out.println(t1.getCelsius());
        System.out.println(t2.getFahrenheit());
        System.out.println(t3.getCelsius());
        System.out.println(t4.getCelsius());

        t1.setBoth(37, 'C');
        System.out.println(t1.getFahrenheit());
    }
}
