/* The following shows the use of a generic class with two different types of parameters. When this class is created, the parameters will 
 * be specified at creation, as see in PairProg
 * 
*/
public class Pair<T1, T2> {
   private T1 firstItem;
   private T2 secondItem;

   public Pair(T1 first, T2 second) {
      firstItem = first;
      secondItem = second;
   }
   
   public Pair(T1 first) {
	      firstItem = first;
	   }

   public T1 first() {
      return firstItem;
   }

   public T2 second() {
      return secondItem;
   }
}

