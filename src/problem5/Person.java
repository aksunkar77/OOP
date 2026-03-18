package problem5;

public class Person {
    private String name;
    private gender gender;

    public Person(String name, gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public gender getGender() {
        return gender;
    }

    public String toString() {
        return name + "(" + (gender == gender.BOY ? "B" : "G") + ")";
    }
}



