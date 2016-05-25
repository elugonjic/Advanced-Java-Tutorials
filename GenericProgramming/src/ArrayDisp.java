/*
 * The following shows how a generic method Display can take generic parameters and be used to display different types of elements (String and Integer in this case)
 * The type <T> is placed before the return type and after the access modifier
 */
public class ArrayDisp {

   static <T> void Display(T[] arr) { //method is defined as static because it is outside a class
      for(int i = 0; i < arr.length; ++i) { //loops through elements of array and displays them
         if (arr[i] != null) { //checks if element is null
             System.out.print(arr[i] + " ");
         }
      }
   }

   public static void main(String[] args) {
      String[] names = new String[10];
      names[0] = "David";
      names[1] = "Cynthia";
      names[2] = "Raymond";
      names[3] = "Jennifer";
      names[4] = "Bryan";
      names[5] = "Clayton";
      names[6] = "Terrill";
      names[7] = "Danny";
      
      Display(names);
      Integer[] numbers = new Integer[]{1,2,3,4,5,6,7,8,9,10}; //must use Integer instead of int because generic classes/methods only works with Objects type
      System.out.println();
      Display(numbers);
   }
}      