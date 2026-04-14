package task4;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e1 = new Employee("John", 50000, new Date(), "SN123");
        Employee e2 = new Employee("Alice", 60000, new Date(), "SN456");

        Manager m1 = new Manager("Director", 80000, new Date(), "M001", 5000);
        m1.addToTeam(e1);
        m1.addToTeam(e2);

        System.out.println("Compare Salaries: " + e1.compareTo(e2)); // -1 гарна
        
        Manager m2 = (Manager) m1.clone(); // Deep clone шалгах [cite: 40]
        System.out.println("Original: " + m1);
        System.out.println("Clone: " + m2);
        System.out.println("Equals?: " + m1.equals(m2));
    }
}
