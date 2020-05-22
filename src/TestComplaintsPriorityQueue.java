import java.util.Iterator;

public class TestComplaintsPriorityQueue {

    public static void test() {
        int n = 4;
        MyPriorityQueue<Complaint> priorityQueue = new MyPriorityQueue<>(n);

        Complaint complaint1 = new Complaint(111, "John", "AC not working");
        Complaint complaint2 = new Complaint(222, "Jane", "Asking for tech support");
        Complaint complaint3 = new Complaint(111, "John Doe", "AC not working");
        Complaint complaint4 = new Complaint(333, "Jack", "Want to switch company");
        Complaint complaint5 = new Complaint(222, "James", "Asking for tech support");
        priorityQueue.add(complaint1, 3);
        priorityQueue.add(complaint2, 3);
        priorityQueue.add(complaint3, 1);
        priorityQueue.add(complaint4, 4);

        System.out.println("Original priority queue:");
        printWithIterator(priorityQueue);

        System.out.println(String.format("Polling: %s", priorityQueue.poll()));
        printWithIterator(priorityQueue);
        System.out.println(String.format("Does the queue have a complaint from user %s about an %s? %s",
                complaint1.getId(), complaint1.getMessage(), priorityQueue.contains(complaint1)));
        System.out.println("Adding complaint with id 222 and the lowest priority");
        priorityQueue.add(complaint5, 4);
        printWithIterator(priorityQueue);
        System.out.println("Removing complaint with id 222");
        priorityQueue.remove(complaint2);
        printWithIterator(priorityQueue);
    }

    private static <T> void printWithIterator(MyPriorityQueue<T> priorityQueue) {
        for (Iterator<T> iterator = priorityQueue.iterator(); iterator.hasNext();) {
            System.out.println(iterator.next());
        }
    }
}
