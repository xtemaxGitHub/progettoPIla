public class Node<T>{
    private final Node<T> previous;
    private final T data;

    public Node(T data, Node<T> previous) {
        this.previous = previous;
        this.data = data;
    }

    public Node<T> getPrevious() {
        return previous;
    }

    public T getData() {
        return data;
    }
}
