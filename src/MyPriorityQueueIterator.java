import java.util.Iterator;

/**
 * Iterator to iterate over the priority queue.
 * @param <T> priority queue object's type
 */
public class MyPriorityQueueIterator<T> implements Iterator<T> {

    private MyPriorityQueue<T> priorityQueue;
    private int counter;

    /**
     * Constructor
     * @param priorityQueue queue to iterate
     */
    public MyPriorityQueueIterator(MyPriorityQueue<T> priorityQueue) {
        this.priorityQueue = priorityQueue;
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return this.counter < this.priorityQueue.size();
    }

    @Override
    public T next() {
        return this.priorityQueue.get(counter++);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
