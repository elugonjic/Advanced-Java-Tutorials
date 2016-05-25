//This class uses a LinkedList to demonstrate the use of a queue
//Each element (node) in a LinkedList is linked to another element.
import java.util.LinkedList;
public class NameQueue {
	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<String>();
		//addLast adds an element to the end of the queue
		names.addLast("John"); //this will be the first element since there are none other
		names.addLast("Ray");
		names.addLast("Cindy");
		for(String name : names) System.out.println(name);

		//remove names using removeFirst
		names.removeFirst();
		System.out.println();
		for(String name : names) System.out.println(name);
		
		//added to the end of the current queue
		names.addLast("Sofie");
		System.out.println();
		for(String name : names) System.out.println(name);
		
		System.out.println("Size of queue: " + names.size());
		
		//check is queue is empty before removing
		if(!names.isEmpty()) names.removeFirst();
		for(String name : names) System.out.println(name);
	}

}
