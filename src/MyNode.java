/**
 * Priority queue node
 * @param <T> node's object type
 */
public class MyNode<T> {
    private T item;
    private int priority;

    /**
     * Constructor.
     * @param value node value
     * @param priority value's priority
     */
    public MyNode(T value, int priority) {
        this.item = value;
        this.priority = priority;
    }

    public T getItem() {
        return item;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
