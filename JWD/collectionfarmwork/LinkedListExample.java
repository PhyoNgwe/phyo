package collectionfarmwork;
import java.util.LinkedList;
public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList<String> list = new LinkedList<>();
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");
	        list.add(null);
	        System.out.println("List: " + list);

	        // LinkedList ကို Stack အဖြစ် အသုံးပြုခြင်း (LIFO - Last In, First Out)
	        LinkedList<String> stack = new LinkedList<>();
	        stack.push("First");
	        stack.push("Second");
	        stack.push("Third");
	        System.out.println("Stack (after push): " + stack);
	        System.out.println("Pop from stack: " + stack.pop());
	        System.out.println("Stack (after pop): " + stack);

	        // LinkedList ကို Queue အဖြစ် အသုံးပြုခြင်း (FIFO - First In, First Out)
	        LinkedList<String> queue = new LinkedList<>();
	        queue.offer("One");
	        queue.offer("Two");
	        queue.offer("Three");
	        System.out.println("Queue (after offer): " + queue);
	        System.out.println("Poll from queue: " + queue.poll());
	        System.out.println("Queue (after poll): " + queue);
	}

}
