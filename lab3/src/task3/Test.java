package task3;

public class Test {
    public static void main(String[] args) {
        MyCollection<String> names = new MyList<>();

        System.out.println("--- Testing MyCollection ---");
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println("Current size: " + names.size());
        System.out.println("Contains 'Bob'?: " + names.contains("Bob"));

        names.remove("Alice");
        System.out.println("Size after removal: " + names.size());
        
        System.out.println("Is the collection empty?: " + names.isEmpty());
    }
}