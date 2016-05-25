//This class uses the LinkedHashSet
//In this example, suppose certain flight paths are linked.
import java.util.LinkedHashSet;
import java.util.Iterator;
public class Locations {
	public static void main(String[] args){
		LinkedHashSet<String> loc = new LinkedHashSet<String>();
		//the order will be kept in which it was added
		loc.add("Cleveland");
		loc.add("Washington D.C.");
		loc.add("Paris");
		loc.add("Dubai");
		loc.add("Paris"); //this will be ignored because it is a duplicate

		Iterator<String> i = loc.iterator();
		while(i.hasNext()) System.out.print(i.next() + " -> ");
	}
}
