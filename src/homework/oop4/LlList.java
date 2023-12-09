package homework.oop4;

public class LlList<T> implements MyLlList<T>  {
    private Node<T> head;

    private Node<T> tail;
    private int size = 0;

    public LlList() {
        head = new Node<>(null,null,tail);
        tail = new Node<>(head,null,null);
    }

    private class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }



    @Override
    public MyLlList<T> add(T item) {
        Node<T> prev = tail;
        prev.item = item;
        tail = new Node<>(prev, null,null);
        prev.next = tail;
        size++;
        return this;
    }

    @Override
    public void addFirst( T item) {
        Node<T> f = head;
        head = new Node<>(null,item, f);
        f.prev = head;
        size++;
    }

    @Override
    public void addLast(T item) {
        Node<T> prev = tail;
        prev.item = item;
        tail = new Node<>(prev, null,null);
        prev.next = tail;
        size++;
    }

    @Override
    public T getFirst() {
        return head.item;
    }

    @Override
    public T getLast() {
        return tail.prev.item;
    }

    @Override
    public T getByIndex(int index) {
        Node<T> target = head.next;
        for(int i = 0; i < index; i--){
            target = getPrevElem(target);
        }
        return target.prev.item;
    }
    private Node<T> getPrevElem(Node<T> cur){
        return cur.prev;
    }

    @Override
    public MyLlList<T> removeItem(T item) {
        return null;
    }

    @Override
    public boolean update(int index, T item) {
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
    public void print(int size){
        Node<T> forPrint = tail;
        for (int i = size; i > 0; i--){
            forPrint = getPrevElem(forPrint);
            System.out.println(forPrint.item);
        }
    }

    @Override
    public String toString() {
        return "LlList{" +
                "head=" + head +
                ", tail=" + tail +
                ", size=" + size +
                '}';
    }
}
