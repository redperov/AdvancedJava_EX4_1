import java.util.Iterator;

/**
 * Tests the custom priority queue against integers.
 */
public class TestIntegerPriorityQueue {

    public static void test() {
        int n = 10;
        MyPriorityQueue<Integer> priorityQueue = new MyPriorityQueue<>(n);
        priorityQueue.add(10, 3);
        priorityQueue.add(158, 2);
        priorityQueue.add(7, 7);
        priorityQueue.add(11, 1);
        priorityQueue.add(100, 2);

        System.out.println("Original priority queue:");
        printWithIterator(priorityQueue);

        System.out.println(String.format("Polling: %s", priorityQueue.poll()));
        System.out.println(String.format("Polling: %s", priorityQueue.poll()));

        System.out.println("Priority queue after polling:");
        printWithIterator(priorityQueue);

        System.out.println("Adding element 5000 with the lowest priority:");
        priorityQueue.add(5000, 10);
        printWithIterator(priorityQueue);

        System.out.println("Adding element 7000 with the highest priority:");
        priorityQueue.add(7000, 1);
        printWithIterator(priorityQueue);

        System.out.println("Removing element 10:");
        priorityQueue.remove(10);
        printWithIterator(priorityQueue);

        System.out.println("Adding element 3 with illegal priority -1:");
        priorityQueue.add(3, -1);
        printWithIterator(priorityQueue);
    }

    /**
     * Prints the queue's content using an iterator.
     * @param priorityQueue queue to iterate
     * @param <T> queue's object type
     */
    private static <T> void printWithIterator(MyPriorityQueue<T> priorityQueue) {
        for (Iterator<T> iterator = priorityQueue.iterator(); iterator.hasNext();) {
            System.out.println(iterator.next());
        }
    }
}
