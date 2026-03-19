package pr4.interfaces.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import pr4.interfaces.model.Cat;
import pr4.interfaces.model.IPhone;
import pr4.interfaces.model.LogicGame;
import pr4.interfaces.model.MemoryGame;
import pr4.interfaces.model.Student;
import pr4.interfaces.model.StudentRecord;
import pr4.interfaces.services.App;
import pr4.interfaces.services.CountingSort;
import pr4.interfaces.services.NameComparator;
import pr4.interfaces.services.Restaurant;

public class Main {

    public static void main(String[] args) {

        // Problem 2
        Restaurant restaurant = new Restaurant();
        Cat cat = new Cat();
        Student student = new Student();

        restaurant.servePizza(cat);
        restaurant.servePizza(student);

        System.out.println("-----");

        // Problem 3 - Game / IGame / polymorphism
        LogicGame logicGame = new LogicGame();
        MemoryGame memoryGame = new MemoryGame();

        App.getStatistics(logicGame);
        System.out.println("-----");
        App.getStatistics(memoryGame);

        System.out.println("-----");

        // Problem 3 - Sellable + Pluggable
        IPhone iphone = new IPhone();
        iphone.sell();
        iphone.plug();

        System.out.println("-----");

        // Problem 4 - sorting
        List<StudentRecord> list = new ArrayList<>();
        list.add(new StudentRecord("Ali", 3.2));
        list.add(new StudentRecord("Dana", 3.8));
        list.add(new StudentRecord("Bek", 3.5));

        Collections.sort(list);
        System.out.println("Sorted by GPA:");
        for (StudentRecord s : list) {
            System.out.println(s);
        }

        System.out.println("-----");

        Collections.sort(list, new NameComparator());
        System.out.println("Sorted by Name:");
        for (StudentRecord s : list) {
            System.out.println(s);
        }

        System.out.println("-----");

        
        int[] arr = {3, 5, 2, 1, 4, 2, 3, 0, 5};
        CountingSort.sortAndPrint(arr);
    }
}