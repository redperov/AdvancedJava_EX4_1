import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * A custom priority queue.
 * @param <T> Queue object's type
 */
public class MyPriorityQueue<T> implements Iterable<T> {

    private List<MyNode<T>> queue;
    private int n;
    private Comparator<MyNode> comparator;

    /**
     * Constructor.
     * @param n number of priorities
     */
    public MyPriorityQueue(int n) {
        this.n = n;
        this.queue = new ArrayList<>();
        this.comparator = new MyPriorityComparator<>();
    }

    /**
     * Adds an item to the queue
     * @param item item to add
     * @param priority item's priority
     */
    public void add(T item, int priority) {
        if (priority < 1 || priority > n) {
            priority = this.n;
        }

        MyNode newNode = new MyNode(item, priority);
        queue.add(newNode);

        // Sort the queue by its priority
        this.sort();
    }

    /**
     * Polls the queue's first item.
     * @return queue item
     */
    public T poll() {
        if (this.queue.size() == 0) {
            return null;
        }

        return this.queue.remove(0).getItem();
    }

    /**
     * Retrieves an item according to the given index
     * @param index queue index
     * @return item at the given index
     */
    public T get(int index) {
        if (this.queue.size() == 0 || index < 0 || index > (this.queue.size() - 1)) {
            return null;
        }

        return this.queue.get(index).getItem();
    }

    /**
     * Checks if an item exists in the queue.
     * @param item item to check if exists
     * @return is item exists
     */
    public boolean contains(T item) {
        for (MyNode<T> node : this.queue) {

            if (node.getItem().equals(item)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Removes the given item from the queue.
     * @param item item to remove
     * @return was the item removed
     */
    public boolean remove(T item) {
        for (int i = 0; i < this.queue.size(); i++) {
            if (this.queue.get(i).getItem().equals(item)) {
                this.queue.remove(i);

                return true;
            }
        }

        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyPriorityQueueIterator<>(this);
    }

    /**
     * Returns the size of the queue.
     * @return queue size
     */
    public int size() {
        return this.queue.size();
    }

    /**
     * Sorts the queue according to the priority of the items.
     */
    private void sort() {
        this.queue.sort(this.comparator);
    }
}
