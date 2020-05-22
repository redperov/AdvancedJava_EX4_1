import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class MyPriorityQueue<T> implements Iterable<T> {

    private List<MyNode<T>> queue;
    private int n;
    private Comparator<MyNode> comparator;

    public MyPriorityQueue(int n) {
        this.n = n;
        this.queue = new ArrayList<>();
        this.comparator = new MyPriorityComparator<>();
    }

    public void add(T item, int priority) {
        if (priority < 1 || priority > n) {
            priority = this.n;
        }

        MyNode newNode = new MyNode(item, priority);
        queue.add(newNode);

        // Sort the queue by its priority
        this.sort();
    }

    public T poll() {
        if (this.queue.size() == 0) {
            return null;
        }

        return this.queue.remove(0).getItem();
    }

    public T get(int index) {
        if (this.queue.size() == 0 || index < 0 || index > (this.queue.size() - 1)) {
            return null;
        }

        return this.queue.get(index).getItem();
    }

    public boolean contains(T item) {
        for (MyNode<T> node : this.queue) {

            if (node.getItem().equals(item)) {
                return true;
            }
        }

        return false;
    }

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

    public int size() {
        return this.queue.size();
    }

    private void sort() {
        this.queue.sort(this.comparator);
    }
}
