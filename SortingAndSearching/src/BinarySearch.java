// This search will not work if the elements of a data set is not sorted.

import java.util.*;

public class BinarySearch
{

   public static void display(int[] arr) {
      for (int i = 0; i < arr.length; i++) {
         if (i % 10 == 0) {
            System.out.println();
         }
         System.out.print(arr[i] + " ");
      }
   }

   // the index position of the value being searched for (key) is returned.
   
   public static int binarySearch(int[] arr, int key) {
      int first = 0; //first index
      int last = arr.length-1; //last index
      while (first <= last) {
         int mid = (first+last) / 2; //middle element of array
         if (key > arr[mid]) { 
            first = mid + 1; //move to top half of array if the key is greater than the midpoint
         }
         else if (key < arr[mid]) {
            last = mid - 1; //move to bottom half of array if the key is less than the midpoint
         }
         else {
            return mid;
         }
      }
      return -1;
   }
        

   public static void main(String[] args) 
   {
      {
         final int size = 100;
         int[] data = new int[size];
         
         // 100 random numbers are generated into the array
         for (int i = 0; i < size; i++) {
            data[i] = (int)(Math.random() * 100);
         }
         
         Arrays.sort(data);
         display(data);
         
         Scanner input = new Scanner(System.in);
         System.out.print("\nEnter a number to search for: ");
         int num = input.nextInt();
         
         int found = binarySearch(data, num);
         if (found >= 0) {
            System.out.println("Found key at position " + found);
         }
         else {
            System.out.println("Key not found.");
         }
      }
   }
}
