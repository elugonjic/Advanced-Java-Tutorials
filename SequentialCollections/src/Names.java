//This class uses the Hashset class
import java.util.HashSet;
public class Names {
	public static void main(String[] args) {
		HashSet<String> names = new HashSet<String>(); //declared similarly to an ArrayList
		names.add("David");
		names.add("Bryan");
		names.add("Cindy");
		System.out.println("The number of names is " + names.size());
		for(String name : names) {
			System.out.println(name);
		}
		names.remove("David");
		names.add("Ray");
		String name = "David";
		if(names.contains(name))
			System.out.println(name + " is in the collection.");
		else
			System.out.println(name + " is not in the collection.");
		
		for(String n : names) {
			System.out.println(n);
		}
		names.clear();
		System.out.println("The number of names is " + names.size());

	}

}
