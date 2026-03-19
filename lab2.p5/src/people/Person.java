package people;

import animals.Animal;
import animals.Dog;
import java.util.Objects;

public abstract class Person {
    private String name;
    private int age;
    private Animal pet;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.pet = null;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Animal getPet() {
        return pet;
    }

    public void assignPet(Animal pet) {
        if (this instanceof PhDStudent && pet instanceof Dog) {
            System.out.println("PhDStudent cannot have a dog.");
            return;
        }
        this.pet = pet;
    }

    public void removePet() {
        pet = null;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public abstract String getOccupation();

    public void leavePetWith(Person other) {
        if (!this.hasPet()) {
            System.out.println(this.name + " has no pet to leave.");
            return;
        }

        if (other.hasPet()) {
            System.out.println(other.getName() + " already has a pet.");
            return;
        }

        Animal tempPet = this.pet;

        if (other instanceof PhDStudent && tempPet instanceof Dog) {
            System.out.println("Cannot leave a dog with PhDStudent.");
            return;
        }

        other.assignPet(tempPet);
        this.removePet();
    }

    public void retrievePetFrom(Person other) {
        if (this.hasPet()) {
            System.out.println(this.name + " already has a pet.");
            return;
        }

        if (!other.hasPet()) {
            System.out.println(other.getName() + " has no pet to return.");
            return;
        }

        this.assignPet(other.getPet());
        other.removePet();
    }

    @Override
    public String toString() {
        String petInfo;
        if (pet == null) {
            petInfo = "no pet";
        } else {
            petInfo = pet.toString() + ", sound=" + pet.getSound();
        }

        return "Name: " + name +
                ", age: " + age +
                ", occupation: " + getOccupation() +
                ", pet: " + petInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person p = (Person) o;
        return age == p.age && Objects.equals(name, p.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
