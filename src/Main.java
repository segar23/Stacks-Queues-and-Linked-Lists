import java.util.LinkedList;
import java.util.Stack;


/*
Class Queue using LinkedList to simulate a queue behaviour.
 */
class Queue {
    LinkedList<String> queue = new LinkedList<>();

    public void insert (String data) {
        queue.add(data);
    }

    public String retrieve () {
        //Since the idea of retrieving is to remove from the queue, always delete the value
        String value = queue.getFirst();
        queue.removeFirst();
        return value;
    }
}

public class Main {
    public static void main (String [] args) {
        String [] data = {"A", "B", "C", "D", "E"};
        Queue queue = new Queue();

        //Stack operations for insert and retrieve are push and pop.
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < data.length; i++) {
            queue.insert(data[i]);
            stack.push(data[i]);
        }

        System.out.println("Retrieving Queue:");
        for (int i = 0; i < data.length; i++) {
            System.out.println(queue.retrieve());
        }

        System.out.println("<---------->");
        System.out.println("Retrieving Stack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
