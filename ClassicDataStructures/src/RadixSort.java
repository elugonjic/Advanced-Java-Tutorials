/* 	In this exercise, a radix sort is used.
 	An array of queue is created, each holding numbers 0-9, 10-19, 20-29, etc.
	The numbers are taken in the array that is to be sorted and are distributed
	among the queue based on their values. Afterwards, they are collected into one array.
	

*/
import java.util.LinkedList;
public class RadixSort {

	//the array list of random numbers, the array of queue, and a digit type is taken are a parameter
	//distribute is used to pass the various random numbers to their appropriate digit type
	static void Distribute(int[] arr, LinkedList[] digits, String digitType){
		for(int i = 0; i < arr.length; i++){
			if(digitType.equals("ones")){
				digits[arr[i] % 10].addLast(arr[i]);
			}else //dealing with 10s
				digits[arr[i] / 10].addLast(arr[i]);
		}
	}
	
	//collect is used to 
	static void Collect(LinkedList[] digits, int[] arr){
		int i = 0;
		for(int digit = 0; digit < 10; ++digit)
			while(!digits[digit].isEmpty())
				arr[i++] = (Integer)digits[digit].removeFirst();
	}
	
	static void display(int[] arr){
		int i = 0;
		while(i < arr.length){
			System.out.print(arr[i] + " ");
			if(++i % 10 == 0)
				System.out.println();
		}
		System.out.println();
	}
		
	
	
	public static void main(String[] args) {
	      final int size = 50;
	      final int numQueues = 10;
	      //an array of type LinkedList<Integer> is created, holding 10 queues
	      LinkedList<Integer>[] digits = new LinkedList[numQueues];
	      for (int i = 0; i < numQueues; ++i) {
	         digits[i] = new LinkedList(); //each queue is initialized in the array
	      }
	      
	      //an array of size 50 is created and is filled with random values 
	      int[] numbers = new int[size];
	      for (int i = 0; i < size; ++i) {
	         numbers[i] = (int)(Math.random() * 100);
	      }
	      
	      System.out.println("Unsorted array of random numbers: ");
	      display(numbers); //the unsorted array is shown
	      Distribute(numbers, digits, "ones");
	      Collect(digits, numbers);
	      
	      //System.out.println("After ones have been sorted (Note: there may be none): ");
	      display(numbers);
	      Distribute(numbers, digits, "tens");
	      Collect(digits, numbers);
	      display(numbers);
	   }
}
