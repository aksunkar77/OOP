package pr3.animal.app;

import pr3.animal.model.Animal; 
import pr3.animal.model.Dog;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        Animal a1 = new Dog("Buddy", 3, "Labrador");
        Dog d1 = new Dog("Max", 5, "German Shepherd");
        Dog d2 = new Dog("Rocky", 2, "Husky");

        List<Animal> animals = new ArrayList<>();
        animals.add(a1);
        animals.add(d1);
        animals.add(d2);

        for (Animal a : animals) {
            a.getInfo();
            a.makeSound();
            a.eat();
            a.eat("meat");
            System.out.println("----");
        }
    }
}
