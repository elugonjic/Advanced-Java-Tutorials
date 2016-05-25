//This class uses the ArrayList class
//Elements can be stored sequentially and accessed by using their index position. The main difference between 
//an ArrayList and an Array is that the size of the ArrayList is dynamic, increasing and decreasing as elements 
//as added and removed, while the size of the Array is whatever size was declared for it at creation.
import java.util.ArrayList;

public class AList {
	public static void main(String[] args){
		ArrayList<Integer> grades = new ArrayList<Integer>();
		grades.add(100);
		grades.add(90);
		grades.add(80);
		grades.add(70);
		grades.add(60);
		int total = 0;
		
		//A for loop or a for each loop can be used to iterate through the array list
		
		/*for(int i = 0; i < grades.size(); i++){
			total += grades.get(i);
		}*/
		
		for(Integer grade : grades){ //for each grade in the grades ArrayList...
			total += grade;
		}
		
		double average = total / grades.size();
		System.out.println("Size of grades: " + grades.size());
		System.out.println("Average: " + average);
		grades.remove(4); //remove 5th element
		System.out.println("New size: " + grades.size());
		grades.add(60);
		grades.add(50);
		System.out.println("Newer size: " + grades.size());


	}	
}
