/*
 * Generic programming allows us to define classes and methods without specifying data type until defining 

runtime code that uses the specific class or method. The advantage to this is to allow classes and 

methods to be more flexible and able to handle multiple data types.  

Example: Creating a List class without specifying what kind of list it is. It can be a list of 

groceries, grades, items, etc. 

In the class definition, a type placeholder is made. It can be a letter or variable. e.g. <T>

This placeholder is where the type is provided when the List class is used.

The variables are created and so is the constructor. The array created is to hold any number of objects of a certain type. Therefore, a type has not been given, only a generic placeholder. Also, in the constructor, the array is initialized with a cast to the type of the array (which is provided later).

The add method with take as a parameter a certain type which is also determined at runtime. This element will be placed into the current position of the array, which is of the matching type for the element passed.

 */


public class List<T> {
   
   private T[] datastore;
   private int size;
   private int pos;

   public List(int numElements) {
      size = numElements;
      pos = 0;
      datastore = (T[]) new Object[size];
   }
   
   //The add method with take as a parameter a certain type which is also determined at runtime. 
   //This element will be placed into the current position of the array, which is of the matching type for the element passed.

   public void add(T element){
	   datastore[pos] = element;
	   ++pos;
   }
   
   public String toString(){
	   String elements= "";
	   for(int i = 0; i<pos;++i) elements += datastore[i] + " ";
	   return elements;
   }
}