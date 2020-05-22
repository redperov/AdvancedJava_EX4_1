import java.util.Iterator;

public class MyPriorityQueueIterator<T> implements Iterator<T> {

    private MyPriorityQueue<T> priorityQueue;
    private int counter;

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
