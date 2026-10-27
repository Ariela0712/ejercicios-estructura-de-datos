public interface IStack<E> {

    void push(E item);
    E pop();
    E top();
    boolean isEmpty();
    int size();
}