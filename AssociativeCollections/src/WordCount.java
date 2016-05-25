/*
 * A word list is created along with a word count from the list.
 */
import java.util.TreeMap;
import java.util.*;
public class WordCount {
	public static void main(String[] args) {
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
		Arrays.sort(words); //the words array is sorted in alphabetical order
		int count = 0;
		for(String word : words){
			System.out.println("Word: " + word);
		}
		
		TreeMap<String, Integer> wordList = new TreeMap<String, Integer>();
		String thisWord = "";
		String nextWord = "";
		for(int i = 0; i < words.length - 1; i++){
			thisWord = words[i];
			count++;
			nextWord = words[i+1];
			if(!thisWord.equals(nextWord)){
				wordList.put(thisWord,  count);
				count = 0;
			}
		}
		
		//handling odd word list count
		nextWord = words[words.length - 1];
		if(thisWord.equals(nextWord))
			count++;
		else
			count = 1;
		if(words.length % 2 !=0)
			wordList.put(nextWord, count);
	
	//generate listing of the words and their count
	Set set = wordList.entrySet(); //set of all entries in the wordList
	//iterator is used to move through the set
	Iterator i = set.iterator();
	while(i.hasNext()){ //while there is an entry to display
		Map.Entry me = (Map.Entry)i.next(); //use next to retrieve an entry with the iterator / cast it to the Map Entry object which is a key-value pair.
		System.out.print(me.getKey() + ": ");
		System.out.println(me.getValue());
	}
	}

}
