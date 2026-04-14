package task3;

public interface MyCollection<E> {
    void add(E element);       
    void remove(E element);   
    int size();               
    boolean isEmpty();        
    boolean contains(E element); 
}
