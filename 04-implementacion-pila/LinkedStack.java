public class LinkedStack<E> implements IStack<E> {
    Nodo<E> tope;
    int size;

    public LinkedStack() {
        this.tope = null;
        this.size = 0;
    }

    @Override 
    public boolean isEmpty() {
        return tope == null;
    }

    @Override 
    public int size() {
        return size;
    }

    @Override 
    public void push(E item) {
        Nodo<E> nuevo = new Nodo<>(item);
        if (isEmpty()) {
            tope = nuevo;
        } else {
            nuevo.setNext(tope);
            tope = nuevo;
        }
        size++;
    }

    @Override 
    public E pop() {
        if (isEmpty()) {
            System.out.println("La pila está vacía. No se puede hacer pop.");
            return null;
        }else{
            E dato = tope.getData();
            tope = tope.getNext();
            size--;
            return dato;
        }
    }

    @Override 
    public E top() {
        if (isEmpty()) {
            System.out.println("La pila está vacía. No se puede hacer top.");
            return null;
        }else{
            return tope.getData();
        }
    }
}
