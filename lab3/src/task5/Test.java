package task5;
import task4.Employee;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Chocolate[] chocolates = {
            new Chocolate("Twix", 50.5),
            new Chocolate("Snickers", 60.0),
            new Chocolate("Mars", 45.0)
        };
        
        System.out.println("--- Sorting Chocolates ---");
        Sort.bubbleSort(chocolates);
        for(Chocolate c : chocolates) System.out.println(c);

        Employee[] employees = {
            new Employee("Batu", 750000, new Date(), "ID001"),
            new Employee("Saruul", 450000, new Date(), "ID002"),
            new Employee("Anu", 900000, new Date(), "ID003")
        };

        System.out.println("\n--- Sorting Employees (by salary) ---");
        Sort.bubbleSort(employees);
        for(Employee e : employees) System.out.println(e);
    }
}