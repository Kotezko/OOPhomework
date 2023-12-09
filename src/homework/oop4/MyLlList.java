package homework.oop4;

public interface MyLlList<T> {
    MyLlList<T> add(T item);

    void addFirst(T item);

    void addLast(T item);
    T getFirst();

    T getLast();
    T getByIndex(int index);
    MyLlList<T> removeItem(T item);
    boolean update(int index, T item);
    int size();
    boolean isEmpty();

}
