/*
 * Differs from the TreeMap class because it cannot guarantee the order of the items in the collection.
 * Otherwise, both HashMap and TreeMap are identical. HashMap would be used where order is not important.
 */
import java.util.HashMap;
public class Grades {
	public static void main(String[] args) {
		HashMap<String, Integer> grades = new HashMap<String, Integer>();
		grades.put("David", 67);
		grades.put("Cindy", 84);
		grades.put("Ray", 91);
		grades.put("Sofie", 97);
		System.out.println("Sofies grades is: " + grades.get("Sofie"));
		System.out.println("Size of grades is: " + grades.size());
		
		//always check to see if a certain key is present
		if(grades.containsKey("Ray")){
		grades.remove("Ray");
		System.out.println("Record successfully removed.");
		}
		
		System.out.println("Size of grades is: " + grades.size());

		grades.remove("Tim"); //this will not do anything because there is no key "Tim".

	}

}
