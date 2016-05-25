//This class uses the PriorityQueue
//Uses the queue process, but stores data in its natural order, 
//(alphabetical if Strings, ascending numerical order if numerals, etc)
import java.util.PriorityQueue;
public class Line {

	public static void main(String[] args) {
		PriorityQueue<String> line = new PriorityQueue<String>();
		line.add("David");
		line.add("Bryan");
		line.add("Cindy");
		line.add("Bob");
		line.add("Jenny");
		line.add("Zelda");
		System.out.println("Number of line: " + line.size());
		for(String name : line) System.out.println(name);
		System.out.println();
		//removes the head element, meaning the 
		line.poll();
		for(String name : line) System.out.println(name);
		System.out.println();
		
		//removes a specific element
		//line.remove("David");
		for(String name : line) System.out.println(name);
		System.out.println("Head of line: " + line.peek()); //look at head of line
	}

}
