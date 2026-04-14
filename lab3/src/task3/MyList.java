package task3;
import java.util.ArrayList;

public class MyList<E> implements MyCollection<E> {
    private ArrayList<E> data = new ArrayList<>();

    @Override
    public void add(E element) {
        data.add(element);
        System.out.println("Element added: " + element);
    }

    @Override
    public void remove(E element) {
        if (data.remove(element)) {
            System.out.println("Element removed: " + element);
        } else {
            System.out.println("Element not found: " + element);
        }
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public boolean contains(E element) {
        return data.contains(element);
    }
}
