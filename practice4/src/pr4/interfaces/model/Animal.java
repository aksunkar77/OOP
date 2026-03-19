package pr4.interfaces.model;

public class Animal implements Movable {
    private String name;
    private int age;

    public Animal(String name , int age){
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println("Moving paws");
    }

    public void eat(){
        System.out.println("Eating with mouse");
    }

    public void makeSound(){
        System.out.println("Sound");
    }
}
