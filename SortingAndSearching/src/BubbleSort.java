// The bubble sort works through an array, comparing 2 values and swapping them if needed.
// This process is repeated as long as there are values to be swapped. It is an inefficient algorithm for large data sets.
public class BubbleSort {
	
	//least to greatest
	public static void bubbleSort(int[] arr){
		int size = arr.length;
		for(int pass = 1; pass < size; pass++){
			for(int i = 0; i < size-pass; i++){
				if(arr[i] > arr[i+1]){
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
	}

	//greatest to least
	public static void bubbleSort2(int[] arr){
		int size = arr.length;
		for(int pass = 1; pass < size; pass++){
			for(int i = 0; i < size-pass; i++){
				if(arr[i] < arr[i+1]){ //note the change in sign
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
			int size = 10;
			int[] data = new int[size];
			for(int i = 0; i<size; ++i)
				data[i] = (int) (Math.random() * 100);
			System.out.println("Before sorting: ");
			for(int i = 0; i < data.length; ++i)
				System.out.print(data[i] + " ");
			
			bubbleSort(data);
			System.out.println("\nAfter sorting (least to greatest): ");
			for(int i = 0; i < data.length; ++i)
				System.out.print(data[i] + " ");
			
			bubbleSort2(data);
			System.out.println("\nAfter sorting (greatest to least): ");
			for(int i = 0; i < data.length; ++i)
				System.out.print(data[i] + " ");
		}

	

}
