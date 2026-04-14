package pr5.io.app;

import pr5.io.model.Book;
import java.io.*;
import java.util.*;

public class LibraryApp {
    private static final String FILE_NAME = "library.dat";
    private static List<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        loadBooks(); 
        try (Scanner sc = new Scanner(System.in)) {
			while (true) {
			    System.out.print("\n(A)dd book, (L)ist books, (Q)uit: ");
			    String choice = sc.nextLine().toUpperCase();

			    if (choice.equals("A")) {
			        System.out.print("Title: "); String t = sc.nextLine();
			        System.out.print("Author: "); String a = sc.nextLine();
			        books.add(new Book(t, a, 10)); 
			    } else if (choice.equals("L")) {
			        books.forEach(System.out::println); 
			    } else if (choice.equals("Q")) {
			        saveBooks(); 
			        break;
			    }
			}
		}
    }

    @SuppressWarnings("unchecked")
	private static void loadBooks() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            books = (List<Book>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("No previous data found.");
        } catch (Exception e) { e.printStackTrace(); }
    }

    private static void saveBooks() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(books);
        } catch (IOException e) { e.printStackTrace(); }
    }
}