//This class uses the TreeSet class
//As elements as added to the collection, they are stored in a 
//natural order (alphabetical if Strings, ascending numerical order if numerals, etc).
import java.util.TreeSet;
public class Alpha {
	public static void main(String[] args) {
		//Since this Tree will use the String type, the names randomly added will be sorted in an alphabetical way.
		TreeSet<String> names = new TreeSet<String>();
		names.add("David");
		names.add("Bryan");
		names.add("Cindy");
		names.add("Bob");
		names.add("Jenny");
		names.add("Zelda");
		System.out.println("Number of names: " + names.size());
		for(String name : names) System.out.println(name);
	
		//lower is the name before
		System.out.println("Name before Cindy: " + names.lower("Cindy"));
		//higher is the name after
		System.out.println("Name after Cindy: " + names.higher("Cindy"));
		//returns first element
		System.out.println("First element: " + names.first());
		//returns last element
		System.out.println("Last element: " + names.last());
		
		String text;
		//punctuation has been removed to make the storing and comparison of words easier
		text = "Fallout is a series of post-apocalyptic role-playing video games It was created by "
				+ "Interplay Entertainment Although the series is set during the 22nd and 23rd centuries "
				+ "its atompunk retrofuturistic setting and artwork are influenced by the post-war culture of "
				+ "1950s America and its combination of hope for the promises of technology and lurking fear "
				+ "of nuclear annihilation A forerunner for Fallout is Wasteland a 1988 video game of which "
				+ "the Fallout series is regarded to be a spiritual successor Although the game worlds are "
				+ "different the background story inhabitants locations and characters draw many parallels";

		//the paragraph is put into an array using split, which will break up the words at the space.
		String[] words = text.split(" ");
		for(String word : words) System.out.println(word);
		System.out.println("Total number of words: " + text.length());
		
		//creates a TreeSet which stores only unique words of the paragraph.
		TreeSet<String> wordList = new TreeSet<String>();
		for(String w : words) wordList.add(w);
		for(String word : wordList) System.out.println(word);
		System.out.println("Total number of unique words: " + wordList.size());
		
		
		
	}
}
