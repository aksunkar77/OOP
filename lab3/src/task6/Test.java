package task6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        
        List<EnhancedPerson> people = new ArrayList<>();
        people.add(new EnhancedPerson("Bat", 25));
        people.add(new EnhancedPerson("Anu", 20));
        
        Collections.sort(people);
        System.out.println("Sorted by age: " + people.get(0).getName()); 
       
        EnhancedAnimal cat = new EnhancedAnimal("Kitty", 2, "CAT-001");
        System.out.println("Animal ID: " + cat.getID());
        cat.move();


        try {
            EnhancedPerson p1 = new EnhancedPerson("Bold", 30);
            EnhancedPerson p2 = (EnhancedPerson) p1.clone();
            System.out.println("Cloned Person: " + p2.getName() + ", Age: " + p2.getAge());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}