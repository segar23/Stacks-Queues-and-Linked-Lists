import java.util.LinkedList;
import java.util.Scanner;
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

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}

public class Main {
    public static void main (String [] args) {
        Queue queue = new Queue();

        //Stack operations for insert and retrieve are push and pop.
        Stack<String> stack = new Stack<>();

        System.out.println("Star entering values: ");
        Scanner scanner = new Scanner(System.in);
        String item = scanner.next();
        while (!item.equals(".")) {
            queue.insert(item);
            stack.push(item);
            System.out.println("Enter Next Item :");
            item = scanner.next();
        }

        System.out.println("Retrieving Queue:");
        while (!queue.isEmpty()) {
            System.out.println(queue.retrieve());
        }

        System.out.println("<---------->");
        System.out.println("Retrieving Stack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
