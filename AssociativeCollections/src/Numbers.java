/*
 *  TreeMap - one of the associative collections 
 *  It will store a set of names and their numbers, similar to a phonebook.
 *  Order is natural (alphabetical, ascending numbers, etc.)
 */
import java.util.TreeMap;
public class Numbers {
	public static void main(String[] args) {
		//a TreeMap object is created with a String type for key and value
		TreeMap<String, String> numbers = new TreeMap<String, String>(); 
		//put is used to input a number into the TreeMap
		numbers.put("David", "2333");
		numbers.put("Cindy", "2334");
		numbers.put("Ray", "2335");
		numbers.put("Sofie", "2336");
		
		//to retrieve a value, the get method is used along with the key
		System.out.println("Sofie: " + numbers.get("Sofie"));
		
		System.out.println("Sofie: " + numbers.size()); //amount of pairs
		
		//remove is used along with its key to remove an item
		numbers.remove("David");
		System.out.println("Sofie: " + numbers.size()); //amount of pairs

	}

}
