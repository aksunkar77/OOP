package task1;

abstract class Animal {
    String name; 

    public Animal(String name) {
        this.name = name;
    }

    abstract void makeSound(); 

    void sleep() {
        System.out.println(name + " is sleeping...");
    }
}

class Dog extends Animal {
    public Dog(String name) { super(name); }
    
    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}
//abstract class is a relationship