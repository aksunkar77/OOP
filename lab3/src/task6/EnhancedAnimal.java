package task6;

import animals.Animal;

public class EnhancedAnimal extends Animal implements Movable, Identifiable {
    private String id;

    public EnhancedAnimal(String name, int age, String id) {
        super(name, age);
        this.id = id;
    }

   
    @Override
    public void move() {
        System.out.println(getName() + " is running around.");
    }

    @Override
    public String getID() {
        return this.id;
    }

    @Override
    public String getSound() {
        return "Generic Animal Sound";
    }
}
