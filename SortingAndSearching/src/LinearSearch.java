// The linear search finds an element by starting at the first element of a data collection
// and progressing through it until a match is found.
// This search is easy to implement, but it is inefficient if the data set is too large. However, it works on unsorted data sets.
// If a data set is sorted, then binary search should be used.
public class LinearSearch {

	//finds the minimum value of an array
	public static int min(int[] arr){
		int minimum = arr[0]; //assign to the first element as a starting point
		for(int i = 1; i < arr.length; i++){
			if(arr[i] < minimum)
				minimum = arr[i];
		}
		return minimum;
	}
	
	//find the maximum value of an array
	public static int max(int[] arr){
		int maximum = arr[0]; //assign to the first element as a starting point
		for(int i = 1; i < arr.length; i++){
			if(arr[i] > maximum)
				maximum = arr[i];
		}
		return maximum;
	}
	public static void main(String[] args) {
		int[] data = new int[]{5, 10, 1, 9, 4, 8, 3, 6, 2, 7};
		int minimum = min(data);
		int maximum = max(data);
		System.out.println("The minimum value is: " + minimum);
		System.out.println("The minimum value is: " + maximum);
	}

}
