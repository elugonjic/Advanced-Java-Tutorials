/* In merge sort, the array is broken up into pairs. Each element of the pair is compared to one another and swapped
   if needed. Then the adjacent elements of each pair is compared and the pairs are swapped if needed.
   
   65318724
   65 31 87 24
   56 13 76 24
   1356 2476
   1234567


*/
public class MergeSort {

	public static void mergeSort(int[] arr, int low, int high){
		int size = arr.length;
		if(low < high){
			int middle = (low + high)/2; //split array in 2
			mergeSort(arr, low, middle);
			mergeSort(arr, middle+1, high);
			merge(arr, low, middle, high);
		}
	}
	
	public static void merge(int[] arr, int low, int middle, int high){
		int size = arr.length;
		int[] temp = new int[size];
		for(int i = low; i<= high; ++i){
			temp[i] = arr[i];
		}
		int i = low;
		int j = middle + 1;
		int k = low;
		
		while(i <= middle && j <= high){
			if(temp[i] <= temp[j]){
				arr[k] = temp[i];
				++i;
			}
			else{
				arr[k] = temp[j];
				++j;
			}
			++k;
		}
		
		while(i <= middle){
			arr[k] = temp[i];
			++k;
			++i;
		}
	}
	
	public static void main(String[] args) {
		int size = 10;
		int[] data = new int[]{5, 10, 1, 6, 2, 9, 3, 8, 7, 4};
		int low = 0;
		int high = 9;
		
		System.out.println("Before sorting: ");
		for(int i = 0; i < data.length; ++i)
			System.out.print(data[i] + " ");
		
		mergeSort(data, low, high);
		System.out.println("\nAfter sorting (least to greatest): ");
		for(int i = 0; i < data.length; ++i)
			System.out.print(data[i] + " ");
		
		/*mergeSort2(data);
		System.out.println("\nAfter sorting (greatest to least): ");
		for(int i = 0; i < data.length; ++i)
			System.out.print(data[i] + " ");*/
	}

}
