/*
 * A file is read that contains a set of names in a gender designation.
 * Each person is partnered with another according to gender, if there are remaining
 * persons without a partner they will be in queue.
 */
import java.util.PriorityQueue;
import java.io.*;
public class SquareDance {
	public static void main(String[] args) {
		PriorityQueue<String> men = new PriorityQueue<String>();
		PriorityQueue<String> women = new PriorityQueue<String>();
		String line = null;
		String file = "names.txt";
		String sex = "";
		BufferedReader input;
		
		try{
			input = new BufferedReader(new FileReader(file));
			while((line = input.readLine()) != null){
			sex = line.substring(0,1);	//read the first character
			if(sex.equals("M")) men.add(line.substring(2)); //read the line starting from the second character
			else women.add(line.substring(2));
		}
			input.close();
	}catch(IOException except) { System.out.println("Error opening file"); }

		while(!men.isEmpty() && !women.isEmpty()){ //if there are both men and women to partner
			System.out.print("The dance partners will be: ");
			System.out.println(men.poll() + " and " + women.poll()); //outputs the head of the men and women tree
		}
		
		if(men.isEmpty()){ //if there are no more men the women will be placed into queue
			System.out.print("There are " + women.size());
			System.out.print(" women waiting to dance. ");
			System.out.println(women.peek() + " is the next female dancer."); //preview the next woman dancer
		}
		if(women.isEmpty()){ //if there are no more women the men will be placed into queue
			System.out.print("There are " + men.size());
			System.out.print(" men waiting to dance. ");
			System.out.println(men.peek() + " is the next male dancer."); //preview the next woman dancer
		}
		
		
		
}
}