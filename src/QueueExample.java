import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Alice");
        queue.offer("Bob");
        queue.offer("Charlie");

        System.out.println(queue.poll());  // Alice (удаляется первый)
        System.out.println(queue.peek());  // Bob (первый элемент остаётся)
        System.out.println(queue.isEmpty()); // false (очередь не пуста)
    }
}
