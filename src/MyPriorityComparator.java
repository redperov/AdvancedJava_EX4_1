import java.util.Comparator;

/**
 * Sorts MyNode objects using their priority in a descending order.
 */
public class MyPriorityComparator<T> implements Comparator<MyNode> {
    @Override
    public int compare(MyNode node1, MyNode node2) {
        return -Integer.compare(node2.getPriority(), node1.getPriority());
    }
}
