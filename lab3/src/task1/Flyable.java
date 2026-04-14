package task1;

interface Flyable {
    void fly(); 
}

class Bird extends Animal implements Flyable {
    public Bird(String name) { super(name); }

    @Override
    void makeSound() { System.out.println("Chirp!"); }

    @Override
    public void fly() {
        System.out.println(name + " is flying with wings.");
    }
}

class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Airplane is flying with jet engines.");
    }
}
//interface ashiglah- can do relationship