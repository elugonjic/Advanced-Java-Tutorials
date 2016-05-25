/*
 * Insertion Sort works by comparing each value to all previous ones. If the previous is greater, then the current and the previous are switched.
 * The sort can also be reversed to display greatest to least.
 */
public class InsertionSort {
	public static void main(String[] args) {
		int size = 10;
		int[] data = new int[size];
		for(int i = 0; i<size; ++i)
			data[i] = (int) (Math.random() * 100);
		System.out.println("Before sorting: ");
		for(int i = 0; i < data.length; ++i)
			System.out.print(data[i] + " ");
		
		//sorting least to greatest
		for(int i = 0; i < data.length; ++i){
			for(int j = i; j > 0; --j){
				if(data[j-1] > data[j]){
					int temp = data[j];
					data[j] = data[j-1];
					data[j-1] = temp;	
				}
			}
		}

		System.out.println("\nAfter sorting (least to greatest): ");
		for(int i = 0; i < data.length; ++i)
			System.out.print(data[i] + " ");
		
		//sorting greatest to least
		for(int i = 0; i < data.length; ++i){
			for(int j = i; j > 0; --j){
				if(data[j-1] < data[j]){ //simply change the comparison sign
					int temp = data[j];
					data[j] = data[j-1];
					data[j-1] = temp;	
				}
			}
		}

		System.out.println("\nAfter sorting (greatest to least): ");
		for(int i = 0; i < data.length; ++i)
			System.out.print(data[i] + " ");
	}

}

