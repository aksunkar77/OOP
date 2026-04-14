package task4;

public class Person {
    private String name;

    public Person() { this.name = "No name yet"; }
    public Person(String name) { this.name = name; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Override
    public String toString() { return "Name: " + name; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person p = (Person) o;
        return name.equals(p.name);
    }
}

