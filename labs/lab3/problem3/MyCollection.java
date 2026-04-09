package labs.lab3.problem3;


public interface MyCollection<T> {
    boolean add(T element);


    boolean remove(T element);


    int size();

    
    boolean isEmpty();

  
    boolean contains(Object o);


    void clear();
}