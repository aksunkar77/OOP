package app;

import people.Employee;
import people.Person;
import people.PersonRegistry;
import people.PhDStudent;
import people.Student;
import animals.Animal;
import animals.Cat;
import animals.Dog;

public class PetTest {
    public static void main(String[] args) {

        Person john = new Employee("John", 30, "Engineer");
        Person alice = new PhDStudent("Alice", 26, "Computer Science", "AI");
        Person bob = new Student("Bob", 20, "Math");

        Animal rex = new Dog("Rex", 4);
        Animal murka = new Cat("Murka", 5);

        john.assignPet(rex);
        alice.assignPet(murka);

        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);
        registry.addPerson(bob);

        System.out.println("Initial registry:");
        System.out.println(registry);

        System.out.println("John leaves Rex with Bob:");
        john.leavePetWith(bob);
        System.out.println(registry);

        System.out.println("John retrieves Rex from Bob:");
        john.retrievePetFrom(bob);
        System.out.println(registry);

        System.out.println("Trying to leave Rex with Alice:");
        john.leavePetWith(alice);
        System.out.println(registry);
    }
}